// ═══════════════════════════════════════════
//  AnbesaFlow — Dashboard shared JS
// ═══════════════════════════════════════════

/* Sidebar toggle on mobile */
function initSidebarToggle() {
  const toggle = document.getElementById('sidebarToggle');
  const sidebar = document.getElementById('sidebar');
  if (!toggle || !sidebar) return;
  toggle.addEventListener('click', () => sidebar.classList.toggle('open'));
  // Close on outside click
  document.addEventListener('click', (e) => {
    if (!sidebar.contains(e.target) && !toggle.contains(e.target)) {
      sidebar.classList.remove('open');
    }
  });
}

/* Active link */
function setActiveLink() {
  const current = location.pathname.split('/').pop();
  document.querySelectorAll('.sidebar-link').forEach(link => {
    const href = link.getAttribute('href');
    if (href && href.includes(current)) link.classList.add('active');
  });
}

/* Logout */
function initLogout() {
  const logoutBtn = document.getElementById('logoutBtn');
  if (!logoutBtn) return;
  logoutBtn.addEventListener('click', () => {
    if (confirm('Are you sure you want to sign out?')) {
      sessionStorage.removeItem('anbesaUser');
      window.location.href = '../pages/login.html';
    }
  });
}

/* Simple toast */
function showToast(message, type = 'success') {
  const existing = document.querySelector('.toast');
  if (existing) existing.remove();

  const toast = document.createElement('div');
  toast.className = `toast toast-${type}`;
  toast.innerHTML = `<span>${type === 'success' ? '✅' : '⚠️'}</span> ${message}`;
  toast.style.cssText = `
    position:fixed; bottom:1.5rem; right:1.5rem;
    background:${type === 'success' ? '#fff' : 'rgba(229,57,53,.08)'};
    border:1.5px solid ${type === 'success' ? 'rgba(255,107,0,.25)' : 'rgba(229,57,53,.25)'};
    color:${type === 'success' ? '#FF6B00' : '#E53935'};
    padding:.75rem 1.2rem; border-radius:12px;
    box-shadow:0 8px 32px rgba(0,0,0,.12);
    font-size:.88rem; font-weight:600;
    display:flex; align-items:center; gap:.6rem;
    z-index:9999; animation: fadeInUp .35s ease;
    max-width:320px;
  `;
  document.body.appendChild(toast);
  setTimeout(() => { toast.style.opacity = '0'; toast.style.transition = 'opacity .3s'; setTimeout(() => toast.remove(), 300); }, 3500);
}

/* Mock user data */
function getMockUser() {
  return { name: 'Lydia Kebede', role: 'Passenger', initials: 'LK' };
}

/* Render sidebar user info */
function renderUserInfo() {
  const nameEl = document.getElementById('userName');
  const roleEl = document.getElementById('userRole');
  const avatarEl = document.getElementById('userAvatar');
  const user = getMockUser();
  if (nameEl) nameEl.textContent = user.name;
  if (roleEl) roleEl.textContent = user.role;
  if (avatarEl) avatarEl.textContent = user.initials;
}

document.addEventListener('DOMContentLoaded', () => {
  initSidebarToggle();
  setActiveLink();
  initLogout();
  renderUserInfo();
});
