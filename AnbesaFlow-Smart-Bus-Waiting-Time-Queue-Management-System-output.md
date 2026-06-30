# 📁 PROJECT EXPORT FOR LLMs

## 📊 Project Information

- **Project Name**: `AnbesaFlow-Smart-Bus-Waiting-Time-Queue-Management-System`
- **Generated On**: 2026-06-30 20:11:32 (Africa/Nairobi / GMT+03:00)
- **Total Files Processed**: 138
- **Export Tool**: Easy Whole Project to Single Text File for LLMs v1.1.0
- **Tool Author**: Jota / José Guilherme Pandolfi

### ⚙️ Export Configuration

| Setting | Value |
|---------|-------|
| Language | `en` |
| Max File Size | `1 MB` |
| Include Hidden Files | `false` |
| Output Format | `both` |

## 🌳 Project Structure

```
├── 📁 src/
│   └── 📁 main/
│       ├── 📁 java/
│       │   └── 📁 com/
│       │       └── 📁 anbesaflow/
│       │           └── 📁 auth/
│       │               ├── 📁 controller/
│       │               │   ├── 📄 AdminController.java (1.46 KB)
│       │               │   ├── 📄 ArrivalLogController.java (1.2 KB)
│       │               │   ├── 📄 AuthController.java (1.28 KB)
│       │               │   ├── 📄 BusController.java (1.54 KB)
│       │               │   ├── 📄 BusStopController.java (1.67 KB)
│       │               │   ├── 📄 OperatorController.java (1.72 KB)
│       │               │   ├── 📄 PassengerController.java (1.71 KB)
│       │               │   ├── 📄 QueueController.java (2.15 KB)
│       │               │   ├── 📄 RouteController.java (1.6 KB)
│       │               │   └── 📄 UserController.java (1.04 KB)
│       │               ├── 📁 dto/
│       │               │   ├── 📄 ArrivalLogRequest.java (266 B)
│       │               │   ├── 📄 ArrivalLogResponse.java (345 B)
│       │               │   ├── 📄 AuthResponse.java (845 B)
│       │               │   ├── 📄 BusRequest.java (213 B)
│       │               │   ├── 📄 BusResponse.java (206 B)
│       │               │   ├── 📄 BusStopRequest.java (223 B)
│       │               │   ├── 📄 BusStopResponse.java (248 B)
│       │               │   ├── 📄 ErrorResponse.java (1.38 KB)
│       │               │   ├── 📄 JoinQueueRequest.java (401 B)
│       │               │   ├── 📄 LoginRequest.java (651 B)
│       │               │   ├── 📄 QueueStatusResponse.java (783 B)
│       │               │   ├── 📄 RegisterRequest.java (1.08 KB)
│       │               │   ├── 📄 RouteRequest.java (267 B)
│       │               │   ├── 📄 RouteResponse.java (292 B)
│       │               │   ├── 📄 UserResponse.java (1.26 KB)
│       │               │   └── 📄 WaitingTimeResponse.java (354 B)
│       │               ├── 📁 entity/
│       │               │   ├── 📄 ArrivalLog.java (855 B)
│       │               │   ├── 📄 Bus.java (1.68 KB)
│       │               │   ├── 📄 BusStop.java (1.3 KB)
│       │               │   ├── 📄 QueueEntry.java (1.68 KB)
│       │               │   ├── 📄 Role.java (104 B)
│       │               │   ├── 📄 Route.java (1.38 KB)
│       │               │   └── 📄 User.java (1.83 KB)
│       │               ├── 📁 exception/
│       │               │   ├── 📄 GlobalExceptionHandler.java (4.68 KB)
│       │               │   ├── 📄 QueueNotFoundException.java (194 B)
│       │               │   ├── 📄 ResourceNotFoundException.java (352 B)
│       │               │   └── 📄 UserAlreadyExistsException.java (353 B)
│       │               ├── 📁 repository/
│       │               │   ├── 📄 ArrivalLogRepository.java (537 B)
│       │               │   ├── 📄 BusRepository.java (527 B)
│       │               │   ├── 📄 BusStopRepository.java (549 B)
│       │               │   ├── 📄 QueueEntryRepository.java (685 B)
│       │               │   ├── 📄 RouteRepository.java (575 B)
│       │               │   └── 📄 UserRepository.java (408 B)
│       │               ├── 📁 security/
│       │               │   ├── 📄 CustomUserDetails.java (2.36 KB)
│       │               │   ├── 📄 CustomUserDetailsService.java (1.08 KB)
│       │               │   ├── 📄 JwtAuthenticationFilter.java (3.52 KB)
│       │               │   ├── 📄 JwtTokenProvider.java (3.96 KB)
│       │               │   ├── 📄 SecurityConfig.java (3.21 KB)
│       │               │   └── 📄 TokenBlacklistService.java (1.74 KB)
│       │               ├── 📁 service/
│       │               │   ├── 📄 ArrivalLogService.java (1.15 KB)
│       │               │   ├── 📄 AuthService.java (3.95 KB)
│       │               │   ├── 📄 BusService.java (1.65 KB)
│       │               │   ├── 📄 BusStopService.java (1.75 KB)
│       │               │   ├── 📄 QueueService.java (3.84 KB)
│       │               │   ├── 📄 RouteService.java (1.84 KB)
│       │               │   ├── 📄 UserService.java (1.13 KB)
│       │               │   └── 📄 WaitingTimeService.java (523 B)
│       │               └── 📄 AnbesaFlowAuthApplication.java (438 B)
│       └── 📁 resources/
│           ├── 📁 db/
│           │   └── 📁 migration/
│           │       ├── 📄 V1__init_schema.sql (356 B)
│           │       ├── 📄 V2__create_queue_entry_table.sql (461 B)
│           │       ├── 📄 V3__create_bus_table.sql (365 B)
│           │       ├── 📄 V4__create_route_table.sql (278 B)
│           │       └── 📄 V5__create_bus_stop_and_arrival_log_tables.sql (797 B)
│           └── 📄 application.yml (1 KB)
├── 📁 target/
│   ├── 📁 classes/
│   │   ├── 📁 com/
│   │   │   └── 📁 anbesaflow/
│   │   │       └── 📁 auth/
│   │   │           ├── 📁 controller/
│   │   │           │   ├── 📄 AdminController.class (3.14 KB)
│   │   │           │   ├── 📄 ArrivalLogController.class (2.55 KB)
│   │   │           │   ├── 📄 AuthController.class (2.9 KB)
│   │   │           │   ├── 📄 BusController.class (3.89 KB)
│   │   │           │   ├── 📄 BusStopController.class (4 KB)
│   │   │           │   ├── 📄 OperatorController.class (2.93 KB)
│   │   │           │   ├── 📄 PassengerController.class (3.35 KB)
│   │   │           │   ├── 📄 QueueController.class (2.97 KB)
│   │   │           │   ├── 📄 RouteController.class (3.94 KB)
│   │   │           │   └── 📄 UserController.class (2.01 KB)
│   │   │           ├── 📁 dto/
│   │   │           │   ├── 📄 ArrivalLogRequest.class (1.07 KB)
│   │   │           │   ├── 📄 ArrivalLogResponse.class (1.45 KB)
│   │   │           │   ├── 📄 ArrivalLogResponse$ArrivalLogResponseBuilder.class (2.41 KB)
│   │   │           │   ├── 📄 AuthResponse.class (1.31 KB)
│   │   │           │   ├── 📄 BusRequest.class (1.04 KB)
│   │   │           │   ├── 📄 BusResponse.class (1.25 KB)
│   │   │           │   ├── 📄 BusResponse$BusResponseBuilder.class (2.05 KB)
│   │   │           │   ├── 📄 BusStopRequest.class (1.04 KB)
│   │   │           │   ├── 📄 BusStopResponse.class (1.27 KB)
│   │   │           │   ├── 📄 BusStopResponse$BusStopResponseBuilder.class (2.1 KB)
│   │   │           │   ├── 📄 ErrorResponse.class (1.76 KB)
│   │   │           │   ├── 📄 JoinQueueRequest.class (787 B)
│   │   │           │   ├── 📄 LoginRequest.class (961 B)
│   │   │           │   ├── 📄 QueueStatusResponse.class (1.01 KB)
│   │   │           │   ├── 📄 RegisterRequest.class (1.53 KB)
│   │   │           │   ├── 📄 RouteRequest.class (1.28 KB)
│   │   │           │   ├── 📄 RouteResponse.class (1.42 KB)
│   │   │           │   ├── 📄 RouteResponse$RouteResponseBuilder.class (2.26 KB)
│   │   │           │   ├── 📄 UserResponse.class (1.9 KB)
│   │   │           │   └── 📄 WaitingTimeResponse.class (585 B)
│   │   │           ├── 📁 entity/
│   │   │           │   ├── 📄 ArrivalLog.class (3.37 KB)
│   │   │           │   ├── 📄 ArrivalLog$ArrivalLogBuilder.class (3.03 KB)
│   │   │           │   ├── 📄 Bus.class (2.43 KB)
│   │   │           │   ├── 📄 BusStop.class (2.06 KB)
│   │   │           │   ├── 📄 QueueEntry.class (2.51 KB)
│   │   │           │   ├── 📄 Role.class (1.16 KB)
│   │   │           │   ├── 📄 Route.class (2.12 KB)
│   │   │           │   └── 📄 User.class (3 KB)
│   │   │           ├── 📁 exception/
│   │   │           │   ├── 📄 GlobalExceptionHandler.class (8.37 KB)
│   │   │           │   ├── 📄 QueueNotFoundException.class (455 B)
│   │   │           │   ├── 📄 ResourceNotFoundException.class (630 B)
│   │   │           │   └── 📄 UserAlreadyExistsException.class (632 B)
│   │   │           ├── 📁 repository/
│   │   │           │   ├── 📄 ArrivalLogRepository.class (839 B)
│   │   │           │   ├── 📄 BusRepository.class (937 B)
│   │   │           │   ├── 📄 BusStopRepository.class (952 B)
│   │   │           │   ├── 📄 QueueEntryRepository.class (1.13 KB)
│   │   │           │   ├── 📄 RouteRepository.class (946 B)
│   │   │           │   └── 📄 UserRepository.class (682 B)
│   │   │           ├── 📁 security/
│   │   │           │   ├── 📄 CustomUserDetails.class (3.39 KB)
│   │   │           │   ├── 📄 CustomUserDetailsService.class (2.72 KB)
│   │   │           │   ├── 📄 JwtAuthenticationFilter.class (4.65 KB)
│   │   │           │   ├── 📄 JwtTokenProvider.class (5.45 KB)
│   │   │           │   ├── 📄 SecurityConfig.class (6.66 KB)
│   │   │           │   └── 📄 TokenBlacklistService.class (2.48 KB)
│   │   │           ├── 📁 service/
│   │   │           │   ├── 📄 ArrivalLogService.class (1.93 KB)
│   │   │           │   ├── 📄 AuthService.class (6.12 KB)
│   │   │           │   ├── 📄 BusService.class (3.95 KB)
│   │   │           │   ├── 📄 BusStopService.class (3.95 KB)
│   │   │           │   ├── 📄 QueueService.class (6.04 KB)
│   │   │           │   ├── 📄 RouteService.class (4.17 KB)
│   │   │           │   ├── 📄 UserService.class (3.15 KB)
│   │   │           │   └── 📄 WaitingTimeService.class (897 B)
│   │   │           └── 📄 AnbesaFlowAuthApplication.class (836 B)
│   │   ├── 📁 db/
│   │   │   └── 📁 migration/
│   │   │       ├── 📄 V1__init_schema.sql (356 B)
│   │   │       ├── 📄 V2__create_queue_entry_table.sql (461 B)
│   │   │       ├── 📄 V3__create_bus_table.sql (365 B)
│   │   │       ├── 📄 V4__create_route_table.sql (278 B)
│   │   │       └── 📄 V5__create_bus_stop_and_arrival_log_tables.sql (797 B)
│   │   └── 📄 application.yml (1 KB)
│   ├── 📁 generated-sources/
│   │   └── 📁 annotations/
│   ├── 📁 generated-test-sources/
│   │   └── 📁 test-annotations/
│   ├── 📁 maven-status/
│   │   └── 📁 maven-compiler-plugin/
│   │       └── 📁 compile/
│   │           └── 📁 default-compile/
│   │               ├── 📄 createdFiles.lst (3.08 KB)
│   │               └── 📄 inputFiles.lst (8.98 KB)
│   └── 📁 test-classes/
├── 📄 AnbesaFlow_Authentication_Postman_Collection.json (13.19 KB)
├── 📄 pom.xml (3.46 KB)
└── 📄 README.md (19 B)
```

## 📑 Table of Contents

**Project Files:**

- [📄 src/main/java/com/anbesaflow/auth/controller/AdminController.java](#📄-src-main-java-com-anbesaflow-auth-controller-admincontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/ArrivalLogController.java](#📄-src-main-java-com-anbesaflow-auth-controller-arrivallogcontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/AuthController.java](#📄-src-main-java-com-anbesaflow-auth-controller-authcontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/BusController.java](#📄-src-main-java-com-anbesaflow-auth-controller-buscontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/BusStopController.java](#📄-src-main-java-com-anbesaflow-auth-controller-busstopcontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/OperatorController.java](#📄-src-main-java-com-anbesaflow-auth-controller-operatorcontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/PassengerController.java](#📄-src-main-java-com-anbesaflow-auth-controller-passengercontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/QueueController.java](#📄-src-main-java-com-anbesaflow-auth-controller-queuecontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/RouteController.java](#📄-src-main-java-com-anbesaflow-auth-controller-routecontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/controller/UserController.java](#📄-src-main-java-com-anbesaflow-auth-controller-usercontroller-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/ArrivalLogRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-arrivallogrequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/ArrivalLogResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-arrivallogresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/AuthResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-authresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/BusRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-busrequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/BusResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-busresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/BusStopRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-busstoprequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/BusStopResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-busstopresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/ErrorResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-errorresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/JoinQueueRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-joinqueuerequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/LoginRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-loginrequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/QueueStatusResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-queuestatusresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/RegisterRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-registerrequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/RouteRequest.java](#📄-src-main-java-com-anbesaflow-auth-dto-routerequest-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/RouteResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-routeresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/UserResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-userresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/dto/WaitingTimeResponse.java](#📄-src-main-java-com-anbesaflow-auth-dto-waitingtimeresponse-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/ArrivalLog.java](#📄-src-main-java-com-anbesaflow-auth-entity-arrivallog-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/Bus.java](#📄-src-main-java-com-anbesaflow-auth-entity-bus-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/BusStop.java](#📄-src-main-java-com-anbesaflow-auth-entity-busstop-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/QueueEntry.java](#📄-src-main-java-com-anbesaflow-auth-entity-queueentry-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/Role.java](#📄-src-main-java-com-anbesaflow-auth-entity-role-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/Route.java](#📄-src-main-java-com-anbesaflow-auth-entity-route-java)
- [📄 src/main/java/com/anbesaflow/auth/entity/User.java](#📄-src-main-java-com-anbesaflow-auth-entity-user-java)
- [📄 src/main/java/com/anbesaflow/auth/exception/GlobalExceptionHandler.java](#📄-src-main-java-com-anbesaflow-auth-exception-globalexceptionhandler-java)
- [📄 src/main/java/com/anbesaflow/auth/exception/QueueNotFoundException.java](#📄-src-main-java-com-anbesaflow-auth-exception-queuenotfoundexception-java)
- [📄 src/main/java/com/anbesaflow/auth/exception/ResourceNotFoundException.java](#📄-src-main-java-com-anbesaflow-auth-exception-resourcenotfoundexception-java)
- [📄 src/main/java/com/anbesaflow/auth/exception/UserAlreadyExistsException.java](#📄-src-main-java-com-anbesaflow-auth-exception-useralreadyexistsexception-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/ArrivalLogRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-arrivallogrepository-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/BusRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-busrepository-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/BusStopRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-busstoprepository-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/QueueEntryRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-queueentryrepository-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/RouteRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-routerepository-java)
- [📄 src/main/java/com/anbesaflow/auth/repository/UserRepository.java](#📄-src-main-java-com-anbesaflow-auth-repository-userrepository-java)
- [📄 src/main/java/com/anbesaflow/auth/security/CustomUserDetails.java](#📄-src-main-java-com-anbesaflow-auth-security-customuserdetails-java)
- [📄 src/main/java/com/anbesaflow/auth/security/CustomUserDetailsService.java](#📄-src-main-java-com-anbesaflow-auth-security-customuserdetailsservice-java)
- [📄 src/main/java/com/anbesaflow/auth/security/JwtAuthenticationFilter.java](#📄-src-main-java-com-anbesaflow-auth-security-jwtauthenticationfilter-java)
- [📄 src/main/java/com/anbesaflow/auth/security/JwtTokenProvider.java](#📄-src-main-java-com-anbesaflow-auth-security-jwttokenprovider-java)
- [📄 src/main/java/com/anbesaflow/auth/security/SecurityConfig.java](#📄-src-main-java-com-anbesaflow-auth-security-securityconfig-java)
- [📄 src/main/java/com/anbesaflow/auth/security/TokenBlacklistService.java](#📄-src-main-java-com-anbesaflow-auth-security-tokenblacklistservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/ArrivalLogService.java](#📄-src-main-java-com-anbesaflow-auth-service-arrivallogservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/AuthService.java](#📄-src-main-java-com-anbesaflow-auth-service-authservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/BusService.java](#📄-src-main-java-com-anbesaflow-auth-service-busservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/BusStopService.java](#📄-src-main-java-com-anbesaflow-auth-service-busstopservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/QueueService.java](#📄-src-main-java-com-anbesaflow-auth-service-queueservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/RouteService.java](#📄-src-main-java-com-anbesaflow-auth-service-routeservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/UserService.java](#📄-src-main-java-com-anbesaflow-auth-service-userservice-java)
- [📄 src/main/java/com/anbesaflow/auth/service/WaitingTimeService.java](#📄-src-main-java-com-anbesaflow-auth-service-waitingtimeservice-java)
- [📄 src/main/java/com/anbesaflow/auth/AnbesaFlowAuthApplication.java](#📄-src-main-java-com-anbesaflow-auth-anbesaflowauthapplication-java)
- [📄 src/main/resources/db/migration/V1__init_schema.sql](#📄-src-main-resources-db-migration-v1-init-schema-sql)
- [📄 src/main/resources/db/migration/V2__create_queue_entry_table.sql](#📄-src-main-resources-db-migration-v2-create-queue-entry-table-sql)
- [📄 src/main/resources/db/migration/V3__create_bus_table.sql](#📄-src-main-resources-db-migration-v3-create-bus-table-sql)
- [📄 src/main/resources/db/migration/V4__create_route_table.sql](#📄-src-main-resources-db-migration-v4-create-route-table-sql)
- [📄 src/main/resources/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql](#📄-src-main-resources-db-migration-v5-create-bus-stop-and-arrival-log-tables-sql)
- [📄 src/main/resources/application.yml](#📄-src-main-resources-application-yml)
- [📄 target/classes/db/migration/V1__init_schema.sql](#📄-target-classes-db-migration-v1-init-schema-sql)
- [📄 target/classes/db/migration/V2__create_queue_entry_table.sql](#📄-target-classes-db-migration-v2-create-queue-entry-table-sql)
- [📄 target/classes/db/migration/V3__create_bus_table.sql](#📄-target-classes-db-migration-v3-create-bus-table-sql)
- [📄 target/classes/db/migration/V4__create_route_table.sql](#📄-target-classes-db-migration-v4-create-route-table-sql)
- [📄 target/classes/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql](#📄-target-classes-db-migration-v5-create-bus-stop-and-arrival-log-tables-sql)
- [📄 target/classes/application.yml](#📄-target-classes-application-yml)
- [📄 AnbesaFlow_Authentication_Postman_Collection.json](#📄-anbesaflow-authentication-postman-collection-json)
- [📄 pom.xml](#📄-pom-xml)
- [📄 README.md](#📄-readme-md)

---

## 📈 Project Statistics

| Metric | Count |
|--------|-------|
| Total Files | 138 |
| Total Directories | 39 |
| Text Files | 73 |
| Binary Files | 65 |
| Total Size | 260.48 KB |

### 📄 File Types Distribution

| Extension | Count |
|-----------|-------|
| `.class` | 63 |
| `.java` | 58 |
| `.sql` | 10 |
| `.yml` | 2 |
| `.lst` | 2 |
| `.json` | 1 |
| `.xml` | 1 |
| `.md` | 1 |

## 💻 File Code Contents

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-admincontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/AdminController.java`

**File Info:**
- **Size**: 1.46 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/AdminController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `cfa164e5bda6f90c666b8c0f4bb41673`
- **SHA256**: `9cfbd302c4aec89466f26f8e7f12ea87ef00d0e6cbb49163f4d084fa2ad0d48f`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @PostMapping("/bus-stops")
    public ResponseEntity<Map<String, String>> createBusStop(@RequestBody Map<String, String> request) {
        String name = request.getOrDefault("name", "Unknown Stop");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus stop '" + name + "' created successfully"
        ));
    }

    @PostMapping("/routes")
    public ResponseEntity<Map<String, String>> createRoute(@RequestBody Map<String, String> request) {
        String routeCode = request.getOrDefault("routeCode", "Unknown Route");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Route '" + routeCode + "' created successfully"
        ));
    }

    @PostMapping("/settings")
    public ResponseEntity<Map<String, String>> updateSettings(@RequestBody Map<String, Object> settings) {
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "System settings updated successfully",
                "updatedCount", String.valueOf(settings.size())
        ));
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-arrivallogcontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/ArrivalLogController.java`

**File Info:**
- **Size**: 1.2 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/ArrivalLogController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-30 20:03:18 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:03:25 (Africa/Nairobi / GMT+03:00)
- **MD5**: `5991b3c10ddc371e1d0feb1a9e86f8bc`
- **SHA256**: `29822ffe807c040befd0996e8cf52ff92a52db16fc06f1d0e0e54350c6f63cac`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.service.ArrivalLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/arrival-logs")
public class ArrivalLogController {

    private final ArrivalLogService arrivalLogService;

    public ArrivalLogController(ArrivalLogService arrivalLogService) {
        this.arrivalLogService = arrivalLogService;
    }

    @PostMapping
    public ResponseEntity<ArrivalLog> logArrival(@RequestBody ArrivalLog arrivalLog) {
        return new ResponseEntity<>(arrivalLogService.logArrival(arrivalLog), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<ArrivalLog>> getArrivalLogs(
            @RequestParam(required = false) Long busId,
            @RequestParam(required = false) Long busStopId,
            Pageable pageable) {
        return ResponseEntity.ok(arrivalLogService.getArrivalLogs(busId, busStopId, pageable));
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-authcontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/AuthController.java`

**File Info:**
- **Size**: 1.28 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/AuthController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `9412be4d5da4c39779127eccd4eac106`
- **SHA256**: `5e9d2923a943222941c4aeed2e8c3d07fd76606ca01b69064e29e9bacf770fe2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.dto.*;
import com.anbesaflow.auth.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request) {
        UserResponse response = authService.register(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        AuthResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<Map<String, String>> logout(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        authService.logout(authHeader);
        return ResponseEntity.ok(Map.of("message", "Logged out successfully"));
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-buscontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/BusController.java`

**File Info:**
- **Size**: 1.54 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/BusController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-30 20:02:18 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:02:24 (Africa/Nairobi / GMT+03:00)
- **MD5**: `3c643e0b250d9d5f3506b1002c072d85`
- **SHA256**: `b188c8116714d58be0f30294c1c7236cbf3df17d492f08717fdb2cceebda94f8`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.service.BusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        return new ResponseEntity<>(busService.createBus(bus), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Bus>> getAllBuses(
            @RequestParam(required = false) String status,
            Pageable pageable) {
        return ResponseEntity.ok(busService.getAllBuses(status, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return ResponseEntity.ok(busService.getBusById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bus> updateBus(@PathVariable Long id, @RequestBody Bus bus) {
        return ResponseEntity.ok(busService.updateBus(id, bus));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return ResponseEntity.noContent().build();
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-busstopcontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/BusStopController.java`

**File Info:**
- **Size**: 1.67 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/BusStopController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-30 20:02:50 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:02:58 (Africa/Nairobi / GMT+03:00)
- **MD5**: `cf07adf879d171ece83ccc1aca525ed7`
- **SHA256**: `d547d41af2bf0ea95998ba275acbd231b8492acba98837cafce8f259831a162d`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.service.BusStopService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus-stops")
public class BusStopController {

    private final BusStopService busStopService;

    public BusStopController(BusStopService busStopService) {
        this.busStopService = busStopService;
    }

    @PostMapping
    public ResponseEntity<BusStop> createBusStop(@RequestBody BusStop busStop) {
        return new ResponseEntity<>(busStopService.createBusStop(busStop), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<BusStop>> getAllBusStops(
            @RequestParam(required = false) String search,
            Pageable pageable) {
        return ResponseEntity.ok(busStopService.getAllBusStops(search, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusStop> getBusStopById(@PathVariable Long id) {
        return ResponseEntity.ok(busStopService.getBusStopById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BusStop> updateBusStop(@PathVariable Long id, @RequestBody BusStop busStop) {
        return ResponseEntity.ok(busStopService.updateBusStop(id, busStop));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusStop(@PathVariable Long id) {
        busStopService.deleteBusStop(id);
        return ResponseEntity.noContent().build();
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-operatorcontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/OperatorController.java`

**File Info:**
- **Size**: 1.72 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/OperatorController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `71b2e4cd68b5ea57921661680775ae75`
- **SHA256**: `0c4620d226a500a77f5c99552e5de8f32fceb42b2ca6ce6ebaf63a3cc128655e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/operator")
@PreAuthorize("hasRole('OPERATOR')")
public class OperatorController {

    @PostMapping("/bus-arrivals")
    public ResponseEntity<Map<String, String>> recordArrival(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Arrival for Bus " + busId + " at Stop " + stopId + " has been recorded."
        ));
    }

    @PostMapping("/bus-departures")
    public ResponseEntity<Map<String, String>> recordDeparture(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Departure for Bus " + busId + " from Stop " + stopId + " has been recorded."
        ));
    }

    @PutMapping("/bus-status")
    public ResponseEntity<Map<String, String>> updateBusStatus(@RequestBody Map<String, String> request) {
        String busId = request.getOrDefault("busId", "N/A");
        String status = request.getOrDefault("status", "ACTIVE");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Bus " + busId + " status updated to: " + status
        ));
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-passengercontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/PassengerController.java`

**File Info:**
- **Size**: 1.71 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/PassengerController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `b191588eeac35e38e7b58c4c12ec519f`
- **SHA256**: `3b066476f28796d9cecb8421d99ab45a338a6d7ecf0ffea328ffd79fc3445373`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/passenger")
@PreAuthorize("hasRole('PASSENGER')")
public class PassengerController {

    @GetMapping("/waiting-times")
    public ResponseEntity<Map<String, Object>> getWaitingTimes(@RequestParam String stopId) {
        return ResponseEntity.ok(Map.of(
                "stopId", stopId,
                "estimatedWaitTimeMinutes", 15,
                "nextBusArrival", "10:15 AM"
        ));
    }

    @PostMapping("/queues/join")
    public ResponseEntity<Map<String, String>> joinQueue(@RequestBody Map<String, String> request) {
        String stopId = request.getOrDefault("stopId", "N/A");
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Successfully joined queue at Stop " + stopId,
                "queueId", "Q-9912"
        ));
    }

    @GetMapping("/queues/position")
    public ResponseEntity<Map<String, Object>> checkQueuePosition(@RequestParam String queueId) {
        return ResponseEntity.ok(Map.of(
                "queueId", queueId,
                "positionInQueue", 4,
                "estimatedTimeToBoardMinutes", 8
        ));
    }

    @GetMapping("/buses/availability")
    public ResponseEntity<Map<String, Object>> checkBusAvailability(@RequestParam String routeId) {
        return ResponseEntity.ok(Map.of(
                "routeId", routeId,
                "activeBusesOnRoute", 3,
                "status", "NORMAL_SERVICE"
        ));
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-queuecontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/QueueController.java`

**File Info:**
- **Size**: 2.15 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/QueueController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `adbd0991fdd1045f50532d40e28e202f`
- **SHA256**: `2b7d8624dbdc7b9b11cda4ad125a9865a48fa59d0aa65bf3bf22606a87a0bfde`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anbesaflow.auth.dto.JoinQueueRequest;
import com.anbesaflow.auth.dto.QueueStatusResponse;
import com.anbesaflow.auth.dto.WaitingTimeResponse;
import com.anbesaflow.auth.service.QueueService;
import com.anbesaflow.auth.service.WaitingTimeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/queue")
public class QueueController {

    private final QueueService queueService;

    private final WaitingTimeService waitingService;

    public QueueController(QueueService queueService,
                           WaitingTimeService waitingService) {

        this.queueService = queueService;
        this.waitingService = waitingService;
    }

    @PostMapping("/join")
    public ResponseEntity<QueueStatusResponse> join(
            @Valid @RequestBody JoinQueueRequest request){

        return ResponseEntity.ok(
                queueService.joinQueue(request.getBusStop())
        );
    }

    @DeleteMapping("/leave")
    public ResponseEntity<String> leave(){

        queueService.leaveQueue();

        return ResponseEntity.ok("Queue left successfully.");
    }

    @GetMapping("/status")
    public ResponseEntity<QueueStatusResponse> status(){

        return ResponseEntity.ok(
                queueService.getStatus()
        );
    }

    @GetMapping("/position")
    public ResponseEntity<QueueStatusResponse> position(){

        return ResponseEntity.ok(
                queueService.getStatus()
        );
    }

    @GetMapping("/waiting-time")
    public ResponseEntity<WaitingTimeResponse> waitingTime(){

        return ResponseEntity.ok(
                waitingService.getWaitingTime()
        );
    }

}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-routecontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/RouteController.java`

**File Info:**
- **Size**: 1.6 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/RouteController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-30 20:01:46 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:01:55 (Africa/Nairobi / GMT+03:00)
- **MD5**: `f69f9fc641d6d0adb645bc20a749a725`
- **SHA256**: `7bee3c4753dd51b1d63acb4ff78c9ccb5e91d72d91361cf20202017d22bb2c56`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.service.RouteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/routes")
public class RouteController {

    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping
    public ResponseEntity<Route> createRoute(@RequestBody Route route) {
        return new ResponseEntity<>(routeService.createRoute(route), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Route>> getAllRoutes(
            @RequestParam(required = false) String search,
            Pageable pageable) {
        return ResponseEntity.ok(routeService.getAllRoutes(search, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable Long id) {
        return ResponseEntity.ok(routeService.getRouteById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Route> updateRoute(@PathVariable Long id, @RequestBody Route route) {
        return ResponseEntity.ok(routeService.updateRoute(id, route));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoute(@PathVariable Long id) {
        routeService.deleteRoute(id);
        return ResponseEntity.noContent().build();
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-controller-usercontroller-java"></a>📄 `src/main/java/com/anbesaflow/auth/controller/UserController.java`

**File Info:**
- **Size**: 1.04 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/controller/UserController.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/controller`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `0cc7470f58eac183992fbdcec435f352`
- **SHA256**: `1a0a8b7d336593fa81702003009b39f59c9b1285c3c74e5bfce2c752fa1cad1f`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.controller;

import com.anbesaflow.auth.dto.UserResponse;
import com.anbesaflow.auth.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        List<UserResponse> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN') or #id == principal.id")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        UserResponse user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-arrivallogrequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/ArrivalLogRequest.java`

**File Info:**
- **Size**: 266 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/ArrivalLogRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 16:01:02 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 17:52:53 (Africa/Nairobi / GMT+03:00)
- **MD5**: `2c0045d4a23751553d599f23e3dd6d83`
- **SHA256**: `05225dca36f011ae6b24436eeb1e30098c5824d2c3d49955a8907fdcd78a9a46`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ArrivalLogRequest {
    private Long busId;
    private Long busStopId;
    private LocalDateTime arrivalTime;
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-arrivallogresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/ArrivalLogResponse.java`

**File Info:**
- **Size**: 345 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/ArrivalLogResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 16:01:14 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 17:53:25 (Africa/Nairobi / GMT+03:00)
- **MD5**: `89a0cfe7ad239e5093a40c5aca70e110`
- **SHA256**: `3669404c4bb621de53e5620a6012445b9f9329f37e3b0a0d2e284e79a0bdd571`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class ArrivalLogResponse {
    private Long id;
    private Long busId;
    private Long busStopId;
    private LocalDateTime arrivalTime;
    private String status; // e.g., DELAYED, ON_TIME
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-authresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/AuthResponse.java`

**File Info:**
- **Size**: 845 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/AuthResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `b3d61f8a45fc666f081950d5ec179c9a`
- **SHA256**: `fe53d53cd9ba2b322fd78e8ab869d2199fc72485a32eea096195022f252a15b2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

public class AuthResponse {

    private String token;
    private String tokenType = "Bearer";
    private UserResponse user;

    // Constructors
    public AuthResponse() {
    }

    public AuthResponse(String token, UserResponse user) {
        this.token = token;
        this.user = user;
    }

    // Getters and Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-busrequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/BusRequest.java`

**File Info:**
- **Size**: 213 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/BusRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 15:59:33 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `f0cf62988a8f7423a511c6adf2397c67`
- **SHA256**: `d91f70e9bded16ab1f2a4a382e1d5668b51541a4b93fd623139f3be7a04bdf65`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BusRequest{

private String plateNumber;

private Integer capacity;

private String status;

}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-busresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/BusResponse.java`

**File Info:**
- **Size**: 206 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/BusResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 15:59:44 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `8a1f6c71f5713b6aebaaf3ab2610d3d1`
- **SHA256**: `b7b939934f8e12986353103249023cbe7af959346a4c2cba322622f37df2f22b`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;
import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
public class BusResponse{

Long id;

String plateNumber;

Integer capacity;

String status;

}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-busstoprequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/BusStopRequest.java`

**File Info:**
- **Size**: 223 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/BusStopRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 16:00:14 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `de706f315dfb1a489b7aa74ddd67073b`
- **SHA256**: `9d5caf0f34a80606bc8affe5dca6063433ebe2afcb6481ecdf199e5cb43325c0`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusStopRequest {
    private String name;
    private Double latitude;
    private Double longitude;
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-busstopresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/BusStopResponse.java`

**File Info:**
- **Size**: 248 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/BusStopResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 16:00:40 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `cd006e20886675b3f6a8f10c6d3fee18`
- **SHA256**: `d6774f9e2c09fe7c433174b5bcf2a9fbe3acb5029c3bdbedd7699a99b24202e7`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BusStopResponse {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-errorresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/ErrorResponse.java`

**File Info:**
- **Size**: 1.38 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/ErrorResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `568fadedbbb5c72999eae54892a64f3c`
- **SHA256**: `cc4652c4f87ab0bac243fd5c6c6d68a93503ad88b50e4dba67df14b9ab5c43dc`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    // Constructors
    public ErrorResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public ErrorResponse(int status, String error, String message, String path) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    // Getters and Setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-joinqueuerequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/JoinQueueRequest.java`

**File Info:**
- **Size**: 401 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/JoinQueueRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `c0252aae85876265061658431c197777`
- **SHA256**: `624314555014a67ec72c08d23b8a06dc60a62e3e2b2c1bef56caed73df3a0034`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;
import jakarta.validation.constraints.NotBlank;

public class JoinQueueRequest {
    
    @NotBlank(message = "Bus stop is required")
    private String busStop;

    public JoinQueueRequest() {
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-loginrequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/LoginRequest.java`

**File Info:**
- **Size**: 651 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/LoginRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `25f4b90c8d230782c74c044b9800099c`
- **SHA256**: `e18efb5d6ed7230324b23e61bc659080f08254cafc3bc380d3905f27ae722b18`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

public class LoginRequest {

    private String email;
    private String password;

    // Constructors
    public LoginRequest() {
    }

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-queuestatusresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/QueueStatusResponse.java`

**File Info:**
- **Size**: 783 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/QueueStatusResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `5441e9281827232a5c2301fb8ac2f56f`
- **SHA256**: `34b30f2e32d34367a3d064a5cab23ccd757080d42eff1cf40df99c490fb240a2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

public class QueueStatusResponse {

    private String busStop;
    private int position;
    private int peopleAhead;
    private long totalInQueue;

    public QueueStatusResponse() {
    }

    public QueueStatusResponse(String busStop, int position, int peopleAhead, long totalInQueue) {
        this.busStop = busStop;
        this.position = position;
        this.peopleAhead = peopleAhead;
        this.totalInQueue = totalInQueue;
    }

    public String getBusStop() {
        return busStop;
    }

    public int getPosition() {
        return position;
    }

    public int getPeopleAhead() {
        return peopleAhead;
    }

    public long getTotalInQueue() {
        return totalInQueue;
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-registerrequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/RegisterRequest.java`

**File Info:**
- **Size**: 1.08 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/RegisterRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `aa2821ecb1cbd64198bee5a7993061f8`
- **SHA256**: `701e6ecc5e07596740f38f7f203f5f1c47baa371ef9b325cd58a034949fadb72`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import com.anbesaflow.auth.entity.Role;

public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private Role role;

    // Constructors
    public RegisterRequest() {
    }

    public RegisterRequest(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-routerequest-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/RouteRequest.java`

**File Info:**
- **Size**: 267 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/RouteRequest.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 15:59:55 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `2e74dc863399ed959a8901117536b29a`
- **SHA256**: `24322a946d147c46dc42578432d7df2fb86c5f4b067132459be30fc9fcbc2632`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteRequest {
    private String routeNumber;
    private String startLocation;
    private String endLocation;
    private Double distanceKm;
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-routeresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/RouteResponse.java`

**File Info:**
- **Size**: 292 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/RouteResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 16:00:04 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `baa73e8152b6bf58e3810f01b4109c8e`
- **SHA256**: `122e73fbd8ea61f352ae82e51965f904380a2d21aba0b3391dc9de57bf87b201`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RouteResponse {
    private Long id;
    private String routeNumber;
    private String startLocation;
    private String endLocation;
    private Double distanceKm;
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-userresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/UserResponse.java`

**File Info:**
- **Size**: 1.26 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/UserResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `e875da2b459680bd8bf13e44f31303a0`
- **SHA256**: `eec890313f9f038cb9cd43a8e430fbe527afa0db3f7270a05871a7b2d82af956`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

import com.anbesaflow.auth.entity.Role;
import com.anbesaflow.auth.entity.User;

public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private Role role;

    // Constructors
    public UserResponse() {
    }

    public UserResponse(Long id, String name, String email, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Static Mapper
    public static UserResponse fromUser(User user) {
        if (user == null) return null;
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getRole());
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-dto-waitingtimeresponse-java"></a>📄 `src/main/java/com/anbesaflow/auth/dto/WaitingTimeResponse.java`

**File Info:**
- **Size**: 354 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/dto/WaitingTimeResponse.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/dto`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `4f59425508bfdff65a34d92e4c697f5c`
- **SHA256**: `14ed3e79df9ff9743c067d0680693396934078aab63c5010567ce3c559e4e34a`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.dto;

public class WaitingTimeResponse {

    private int estimatedMinutes;

    public WaitingTimeResponse() {
    }

    public WaitingTimeResponse(int estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-arrivallog-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/ArrivalLog.java`

**File Info:**
- **Size**: 855 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/ArrivalLog.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-30 15:57:27 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:56:43 (Africa/Nairobi / GMT+03:00)
- **MD5**: `a996aac8244ad6802a77aee584207eb0`
- **SHA256**: `60680eacad3526c75f3b0242d790b83f7d7b03817387d46e4d6061f86db91553`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "arrival_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArrivalLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_stop_id", nullable = false)
    private BusStop busStop;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(nullable = false, length = 50)
    private String status; // e.g., ON_TIME, DELAYED
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-bus-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/Bus.java`

**File Info:**
- **Size**: 1.68 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/Bus.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-30 15:56:36 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:11:16 (Africa/Nairobi / GMT+03:00)
- **MD5**: `e75014e2a5848062ef7ff347b3363691`
- **SHA256**: `70cbcf65c25cfd3c089c6a13d5742f8d58eb5993110fbf49a0666c2d31b6ed09`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plate_number", nullable = false, unique = true, length = 50)
    private String plateNumber;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false, length = 50)
    private String status; // e.g., AVAILABLE, IN_TRANSIT, MAINTENANCE

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public Bus() {}

    public Bus(Long id, String plateNumber, Integer capacity, String status) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.capacity = capacity;
        this.status = status;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Explicit Getters and Setters to resolve any Lombok/IDE compilation issues
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-busstop-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/BusStop.java`

**File Info:**
- **Size**: 1.3 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/BusStop.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-30 15:56:59 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:08:29 (Africa/Nairobi / GMT+03:00)
- **MD5**: `238d4c201216e1535422b1fe9c467ea7`
- **SHA256**: `7f79a5b580f20019ebf620ca88b46720536a049b72eaf404d04f28ea54d7923b`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bus_stops")
public class BusStop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name; 

    @Column(nullable = false, length = 255)
    private String location;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public BusStop() {}

    public BusStop(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Explicit Getters and Setters to guarantee compilation
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-queueentry-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/QueueEntry.java`

**File Info:**
- **Size**: 1.68 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/QueueEntry.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `d8dd67bc69a68959131c86ba289149a8`
- **SHA256**: `ad7217a0b5b0a77f5c8c28e72dbe3c59c5c6b8688600f41e84f5814e062411e7`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "queue_entries")
public class QueueEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer position;

    @Column(nullable =false)
    private LocalDateTime joinedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String busStop;

    public QueueEntry() {
    }

    public QueueEntry(Long id,
                      Integer position,
                      LocalDateTime joinedAt,
                      User user,
                      String busStop) {
        this.id = id;
        this.position = position;
        this.joinedAt = joinedAt;
        this.user = user;
        this.busStop = busStop;
    }

    public Long getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public User getUser() {
        return user;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-role-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/Role.java`

**File Info:**
- **Size**: 104 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/Role.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `c02eee12c7d6ff9a6fa30abbc1f2404b`
- **SHA256**: `469c5f40ecbccacc138493f84c7212b76f5d8a80a40f776719def8612b3d980c`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

public enum Role {
    ADMIN,
    OPERATOR,
    PASSENGER
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-route-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/Route.java`

**File Info:**
- **Size**: 1.38 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/Route.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-30 15:56:49 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:08:55 (Africa/Nairobi / GMT+03:00)
- **MD5**: `69261331895b8c1c627b0c0cddd28679`
- **SHA256**: `7d89530e9216d9699037845bd05a54d8e71fac86497cf09f9f3f2095d948cec7`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name; 

    @Column(name = "start_point", nullable = false, length = 100)
    private String startPoint;

    @Column(name = "end_point", nullable = false, length = 100)
    private String endPoint;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public Route() {}

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Explicit Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStartPoint() { return startPoint; }
    public void setStartPoint(String startPoint) { this.startPoint = startPoint; }

    public String getEndPoint() { return endPoint; }
    public void setEndPoint(String endPoint) { this.endPoint = endPoint; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-entity-user-java"></a>📄 `src/main/java/com/anbesaflow/auth/entity/User.java`

**File Info:**
- **Size**: 1.83 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/entity/User.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/entity`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6de3f63929687d370f7c78b5d58034b9`
- **SHA256**: `1d286a001d5f0873f70ebfeee584d32331b289995237378ba2d343a3404a90c2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Role role;

    // Default Constructor (required by JPA)
    public User() {
    }

    // Full Constructor
    public User(Long id, String name, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-exception-globalexceptionhandler-java"></a>📄 `src/main/java/com/anbesaflow/auth/exception/GlobalExceptionHandler.java`

**File Info:**
- **Size**: 4.68 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/exception/GlobalExceptionHandler.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/exception`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `65866bac38c98b54b1a628997fd7d301`
- **SHA256**: `17be09ff809958e04c477c3e1735b5819777656ca1d564caf01747886faeb45e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.exception;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.anbesaflow.auth.dto.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistsException(UserAlreadyExistsException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.CONFLICT.value(),
                HttpStatus.CONFLICT.getReasonPhrase(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ErrorResponse> handleBadCredentialsException(BadCredentialsException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.UNAUTHORIZED.value(),
                HttpStatus.UNAUTHORIZED.getReasonPhrase(),
                "Invalid email or password",
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorResponse> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.FORBIDDEN.value(),
                HttpStatus.FORBIDDEN.getReasonPhrase(),
                "You do not have permission to access this resource: " + ex.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex, WebRequest request) {
        String validationErrors = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.joining(", "));

        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                validationErrors,
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(QueueNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleQueue(
        QueueNotFoundException ex,
        HttpServletRequest request) {

            ErrorResponse error = new ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            HttpStatus.NOT_FOUND.getReasonPhrase(),
            ex.getMessage(),
            request.getRequestURI()
            );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-exception-queuenotfoundexception-java"></a>📄 `src/main/java/com/anbesaflow/auth/exception/QueueNotFoundException.java`

**File Info:**
- **Size**: 194 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/exception/QueueNotFoundException.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/exception`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6edd36ec1e4c9a90ed5fde0a6c78aae6`
- **SHA256**: `444fd5732ce076fcff472f5584aa6daed3bb889c20446e5b49cefb5e6552798e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.exception;

public class QueueNotFoundException extends RuntimeException {

    public QueueNotFoundException(String message) {
        super(message);
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-exception-resourcenotfoundexception-java"></a>📄 `src/main/java/com/anbesaflow/auth/exception/ResourceNotFoundException.java`

**File Info:**
- **Size**: 352 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/exception/ResourceNotFoundException.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/exception`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `8abe327b30f0fe9eec030953ab4a4881`
- **SHA256**: `6d49d552623a8e8a8f1cf516cbec0c493733ad62c5e33202d10887ec6d23adb2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-exception-useralreadyexistsexception-java"></a>📄 `src/main/java/com/anbesaflow/auth/exception/UserAlreadyExistsException.java`

**File Info:**
- **Size**: 353 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/exception/UserAlreadyExistsException.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/exception`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `66475d67c9439113332c09a38d0a9f73`
- **SHA256**: `d0c987e2580c4be5edbbc38feabf21c0a3fdc640a7c50d510ba06ee6a1c08dbc`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-arrivallogrepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/ArrivalLogRepository.java`

**File Info:**
- **Size**: 537 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/ArrivalLogRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-30 15:58:25 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:57:52 (Africa/Nairobi / GMT+03:00)
- **MD5**: `acda8a3d74da75b7325d08abe944eddf`
- **SHA256**: `4e164e8fbeba566f20c071a292dd70919e6ef3da916dd880051bb9d81240f56b`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.ArrivalLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrivalLogRepository extends JpaRepository<ArrivalLog, Long> {
    Page<ArrivalLog> findByBusId(Long busId, Pageable pageable);
    Page<ArrivalLog> findByBusStopId(Long busStopId, Pageable pageable);
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-busrepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/BusRepository.java`

**File Info:**
- **Size**: 527 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/BusRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-30 15:57:46 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:57:13 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6594541665bd4c94819ab30b04024262`
- **SHA256**: `07a0677234acfc8af0b31f6be6712a7c7d9d7203f1d9275484aff7e4b08059ed`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    Optional<Bus> findByPlateNumber(String plateNumber);
    Page<Bus> findByStatus(String status, Pageable pageable);
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-busstoprepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/BusStopRepository.java`

**File Info:**
- **Size**: 549 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/BusStopRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-30 15:58:10 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:57:44 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6b98035c5c1c5dc3b189fe1d76f5517a`
- **SHA256**: `5cbda23d997b1aa750950effd0a47a881d2fb80646dec13e5b9d9f0cc97ed554`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.BusStop;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusStopRepository extends JpaRepository<BusStop, Long> {
    Optional<BusStop> findByName(String name);
    Page<BusStop> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-queueentryrepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/QueueEntryRepository.java`

**File Info:**
- **Size**: 685 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/QueueEntryRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `01ac68bc6f4cec38903ee65b9d97a703`
- **SHA256**: `1ca90843db6ae49f2f91821864b2391b341bcd107d5f7e421706d76148a724d2`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anbesaflow.auth.entity.QueueEntry;
import com.anbesaflow.auth.entity.User;

public interface QueueEntryRepository extends JpaRepository<QueueEntry, Long> {

    List<QueueEntry> findByBusStopOrderByPositionAsc(String busStop);
    List<QueueEntry> findAllByOrderByJoinedAtAsc();
    List<QueueEntry> findByBusStop(String busStop);

    Optional<QueueEntry> findByUser(User user);

    boolean existsByUser(User user);

    void deleteByUser(User user);

    long countByBusStop(String busStop);
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-routerepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/RouteRepository.java`

**File Info:**
- **Size**: 575 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/RouteRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-30 15:57:58 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:57:33 (Africa/Nairobi / GMT+03:00)
- **MD5**: `a91b37c0a1b8b3745ad5fa5a1f0de980`
- **SHA256**: `f052a986b2fd999da724f6a60b14817d8b9d22bc7673899ab7bfa5be9eeea63e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.Route;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Page<Route> findByNameContainingIgnoreCaseOrStartPointContainingIgnoreCaseOrEndPointContainingIgnoreCase(
            String name, String startPoint, String endPoint, Pageable pageable);
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-repository-userrepository-java"></a>📄 `src/main/java/com/anbesaflow/auth/repository/UserRepository.java`

**File Info:**
- **Size**: 408 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/repository/UserRepository.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/repository`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `4f8b0ec93fe77509bab06dfa9f9482fd`
- **SHA256**: `452bb5ad16855e1aa8d7dcc7f5474c284957a2dfa765f1b0d43ddd727741bd9a`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.repository;

import com.anbesaflow.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-customuserdetails-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/CustomUserDetails.java`

**File Info:**
- **Size**: 2.36 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/CustomUserDetails.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `c351c291a9ad292f6e18213dea5a9322`
- **SHA256**: `613df822ed8b8cdd8153f6809e299dc85e45d466ecd8a3b7aa0c605302efabbf`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import com.anbesaflow.auth.entity.Role;
import com.anbesaflow.auth.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    private final Long id;
    private final String name;
    private final String email;
    private final String password;
    private final Role role;
    private final Collection<? extends GrantedAuthority> authorities;

    public CustomUserDetails(Long id, String name, String email, String password, Role role, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.authorities = authorities;
    }

    public static CustomUserDetails create(User user) {
        // Map role to SimpleGrantedAuthority with "ROLE_" prefix
        List<GrantedAuthority> authorities = Collections.singletonList(
                new SimpleGrantedAuthority("ROLE_" + user.getRole().name())
        );

        return new CustomUserDetails(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole(),
                authorities
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-customuserdetailsservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/CustomUserDetailsService.java`

**File Info:**
- **Size**: 1.08 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/CustomUserDetailsService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `1b92ff2c58fd837577ea5267666ce697`
- **SHA256**: `d17fa60f4caad7f25665337e8d3631b2061bdcb80150a56af3d66307a5f1f411`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return CustomUserDetails.create(user);
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-jwtauthenticationfilter-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/JwtAuthenticationFilter.java`

**File Info:**
- **Size**: 3.52 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/JwtAuthenticationFilter.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `e64c019807a8a23d2ea966ceb625aeda`
- **SHA256**: `4fe76180f5f12c51113954c7bd0a546d98ca53b4f828b85a16caa837fa5314b4`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationFilter.class);

    private final JwtTokenProvider tokenProvider;
    private final CustomUserDetailsService customUserDetailsService;
    private final TokenBlacklistService blacklistService;
    private final String jwtHeader;
    private final String jwtPrefix;

    public JwtAuthenticationFilter(
            JwtTokenProvider tokenProvider,
            CustomUserDetailsService customUserDetailsService,
            TokenBlacklistService blacklistService,
            @Value("${app.jwt.header}") String jwtHeader,
            @Value("${app.jwt.prefix}") String jwtPrefix) {
        this.tokenProvider = tokenProvider;
        this.customUserDetailsService = customUserDetailsService;
        this.blacklistService = blacklistService;
        this.jwtHeader = jwtHeader;
        this.jwtPrefix = jwtPrefix;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String jwt = getJwtFromRequest(request);

            if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
                // Check if token is blacklisted (logged out)
                if (blacklistService.isBlacklisted(jwt)) {
                    logger.warn("Attempt to authenticate with blacklisted JWT token");
                    filterChain.doFilter(request, response);
                    return;
                }

                String email = tokenProvider.getEmailFromJWT(jwt);

                UserDetails userDetails = customUserDetailsService.loadUserByUsername(email);
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities()
                );
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } catch (Exception ex) {
            logger.error("Could not set user authentication in security context", ex);
        }

        filterChain.doFilter(request, response);
    }

    private String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader(jwtHeader);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(jwtPrefix)) {
            return bearerToken.substring(jwtPrefix.length());
        }
        return null;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-jwttokenprovider-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/JwtTokenProvider.java`

**File Info:**
- **Size**: 3.96 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/JwtTokenProvider.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `13534c06894b9b6f63ba56970483fd8a`
- **SHA256**: `d083dbdf9400048cb1c16697c751ffad510f9c389186afb052b0dd2b4113dbe6`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenProvider {

    private static final Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);

    private final Key signingKey;
    private final long jwtExpirationMs;

    public JwtTokenProvider(
            @Value("${app.jwt.secret}") String jwtSecret,
            @Value("${app.jwt.expiration-ms}") long jwtExpirationMs) {
        // Decode the secret string. If it is hex-encoded, we parse it, otherwise we use raw bytes.
        byte[] keyBytes = jwtSecret.getBytes();
        if (jwtSecret.length() >= 64) {
            // Hex string convert to bytes
            try {
                keyBytes = java.util.HexFormat.of().parseHex(jwtSecret);
            } catch (Exception e) {
                // Fallback to raw bytes
                keyBytes = jwtSecret.getBytes();
            }
        }
        this.signingKey = Keys.hmacShaKeyFor(keyBytes);
        this.jwtExpirationMs = jwtExpirationMs;
    }

    public String generateToken(Authentication authentication) {
        CustomUserDetails userPrincipal = (CustomUserDetails) authentication.getPrincipal();

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationMs);

        Map<String, Object> claims = new HashMap<>();
        claims.put("id", userPrincipal.getId());
        claims.put("name", userPrincipal.getName());
        claims.put("role", userPrincipal.getRole().name());

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userPrincipal.getUsername())
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(signingKey, SignatureAlgorithm.HS512)
                .compact();
    }

    public String getEmailFromJWT(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    public String getRoleFromJWT(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.get("role", String.class);
    }

    public Date getExpirationFromJWT(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getExpiration();
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parserBuilder().setSigningKey(signingKey).build().parseClaimsJws(authToken);
            return true;
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
            logger.error("Invalid JWT signature: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("Unsupported JWT token: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-securityconfig-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/SecurityConfig.java`

**File Info:**
- **Size**: 3.21 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/SecurityConfig.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:25:05 (Africa/Nairobi / GMT+03:00)
- **MD5**: `93b1838838e2b8f9558a36637af0de6c`
- **SHA256**: `ee5064bb8dc536fe926975cf185f7507b94aa57e69f5359e23c95132c64e7729`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF since we are using stateless JWTs
                .csrf(AbstractHttpConfigurer::disable)
                // Configure session management to be stateless
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // Handle unauthorized entry points
                .exceptionHandling(exceptions -> exceptions
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                // Configure request authorization
                .authorizeHttpRequests(auth -> auth
                        // Permit public authentication endpoints
                        .requestMatchers("/auth/register", "/auth/login").permitAll()
                        // Any other request must be authenticated
                        .requestMatchers("/queue/**")
                        .hasRole("PASSENGER")
                        .anyRequest()
                        .authenticated()
                )
                // Add JWT filter before standard Spring Security UsernamePasswordAuthenticationFilter
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-security-tokenblacklistservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/security/TokenBlacklistService.java`

**File Info:**
- **Size**: 1.74 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/security/TokenBlacklistService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/security`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `470f99a4cd2897270685d986bbd1efde`
- **SHA256**: `b84508e8b0e21dd188d5f3a3f05519c2d623238c79105fef4317f2184b2175ec`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.security;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TokenBlacklistService {

    // Map to store blacklisted token as key and its expiration Date as value
    private final Map<String, Date> blacklist = new ConcurrentHashMap<>();

    /**
     * Blacklist a token.
     *
     * @param token the JWT token to blacklist
     * @param expiryDate the token expiration date
     */
    public void blacklistToken(String token, Date expiryDate) {
        if (token != null && expiryDate != null) {
            blacklist.put(token, expiryDate);
        }
    }

    /**
     * Check if a token is blacklisted.
     *
     * @param token the JWT token
     * @return true if the token is blacklisted, false otherwise
     */
    public boolean isBlacklisted(String token) {
        if (token == null) {
            return false;
        }
        Date expiryDate = blacklist.get(token);
        if (expiryDate == null) {
            return false;
        }
        // If the current date is after the expiration, it's expired (cleanup will remove it anyway)
        if (new Date().after(expiryDate)) {
            blacklist.remove(token);
            return false;
        }
        return true;
    }

    /**
     * Cleanup expired tokens from the blacklist map.
     * Runs every hour (3600000 ms) in the background.
     */
    @Scheduled(fixedRate = 3600000)
    public void cleanExpiredTokens() {
        Date now = new Date();
        blacklist.entrySet().removeIf(entry -> now.after(entry.getValue()));
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-arrivallogservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/ArrivalLogService.java`

**File Info:**
- **Size**: 1.15 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/ArrivalLogService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 16:02:27 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:59:45 (Africa/Nairobi / GMT+03:00)
- **MD5**: `1e6bcbb3952a7559ec397e1ae2584bbc`
- **SHA256**: `c6c7b762e005bb727af2c8f6cd3db6faa580ea3a021ea2eef59130737614baea`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.ArrivalLog;
import com.anbesaflow.auth.repository.ArrivalLogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArrivalLogService {

    private final ArrivalLogRepository arrivalLogRepository;

    public ArrivalLogService(ArrivalLogRepository arrivalLogRepository) {
        this.arrivalLogRepository = arrivalLogRepository;
    }

    public ArrivalLog logArrival(ArrivalLog arrivalLog) {
        return arrivalLogRepository.save(arrivalLog);
    }

    @Transactional(readOnly = true)
    public Page<ArrivalLog> getArrivalLogs(Long busId, Long busStopId, Pageable pageable) {
        if (busId != null) {
            return arrivalLogRepository.findByBusId(busId, pageable);
        } else if (busStopId != null) {
            return arrivalLogRepository.findByBusStopId(busStopId, pageable);
        }
        return arrivalLogRepository.findAll(pageable);
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-authservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/AuthService.java`

**File Info:**
- **Size**: 3.95 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/AuthService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `814432a01dc1f3bf407a5022a7eff396`
- **SHA256**: `6746fa64c7cec65714de9930004a9f46bfed8343e32a740a75046bc7bbe25e12`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.*;
import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.exception.UserAlreadyExistsException;
import com.anbesaflow.auth.repository.UserRepository;
import com.anbesaflow.auth.security.JwtTokenProvider;
import com.anbesaflow.auth.security.TokenBlacklistService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider tokenProvider;
    private final TokenBlacklistService blacklistService;
    private final String jwtPrefix;

    public AuthService(
            AuthenticationManager authenticationManager,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtTokenProvider tokenProvider,
            TokenBlacklistService blacklistService,
            @Value("${app.jwt.prefix}") String jwtPrefix) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenProvider = tokenProvider;
        this.blacklistService = blacklistService;
        this.jwtPrefix = jwtPrefix;
    }

    @Transactional
    public UserResponse register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email address '" + request.getEmail() + "' is already registered");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        // Hash password before saving
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        User savedUser = userRepository.save(user);
        return UserResponse.fromUser(savedUser);
    }

    @Transactional(readOnly = true)
    public AuthResponse login(LoginRequest request) {
        // Authenticate the credentials
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        // Store authentication context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Generate JWT token
        String jwt = tokenProvider.generateToken(authentication);

        // Fetch user info for DTO mapping
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalStateException("Authenticated user not found in database"));

        return new AuthResponse(jwt, UserResponse.fromUser(user));
    }

    public void logout(String authHeader) {
        if (StringUtils.hasText(authHeader) && authHeader.startsWith(jwtPrefix)) {
            String jwt = authHeader.substring(jwtPrefix.length());

            if (tokenProvider.validateToken(jwt)) {
                // Retrieve token expiration and add to blacklist
                Date expiration = tokenProvider.getExpirationFromJWT(jwt);
                blacklistService.blacklistToken(jwt, expiration);
            }
        }
        // Invalidate current context
        SecurityContextHolder.clearContext();
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-busservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/BusService.java`

**File Info:**
- **Size**: 1.65 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/BusService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 16:01:49 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:11:32 (Africa/Nairobi / GMT+03:00)
- **MD5**: `f516bc45ed9c1b2e0b2d55641f8a3685`
- **SHA256**: `1a3d6574ef4e71134457a90d049d7916d1fd50fec492513def2dd0078059c22e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Bus;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.BusRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Transactional(readOnly = true)
    public Page<Bus> getAllBuses(String status, Pageable pageable) {
        if (status != null && !status.isBlank()) {
            return busRepository.findByStatus(status, pageable);
        }
        return busRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Bus getBusById(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bus not found with id: " + id));
    }

    public Bus updateBus(Long id, Bus updatedBus) {
        Bus existingBus = getBusById(id);
        existingBus.setPlateNumber(updatedBus.getPlateNumber());
        existingBus.setCapacity(updatedBus.getCapacity());
        existingBus.setStatus(updatedBus.getStatus());
        return busRepository.save(existingBus);
    }

    public void deleteBus(Long id) {
        Bus bus = getBusById(id);
        busRepository.delete(bus);
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-busstopservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/BusStopService.java`

**File Info:**
- **Size**: 1.75 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/BusStopService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 16:02:14 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:09:35 (Africa/Nairobi / GMT+03:00)
- **MD5**: `4f363c61a95078789233357bcd8706d7`
- **SHA256**: `8855572ff8af4f9cbbcb71120ec5b9dab84e3eb45b3c137a5ee11087ebd15882`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.BusStop;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.BusStopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusStopService {

    private final BusStopRepository busStopRepository;

    public BusStopService(BusStopRepository busStopRepository) {
        this.busStopRepository = busStopRepository;
    }

    public BusStop createBusStop(BusStop busStop) {
        return busStopRepository.save(busStop);
    }

    @Transactional(readOnly = true)
    public Page<BusStop> getAllBusStops(String search, Pageable pageable) {
        if (search != null && !search.isBlank()) {
            return busStopRepository.findByNameContainingIgnoreCase(search, pageable);
        }
        return busStopRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public BusStop getBusStopById(Long id) {
        return busStopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bus Stop not found with id: " + id));
    }

    public BusStop updateBusStop(Long id, BusStop updatedBusStop) {
        BusStop existingStop = getBusStopById(id);
        existingStop.setName(updatedBusStop.getName());
        existingStop.setLocation(updatedBusStop.getLocation());
        return busStopRepository.save(existingStop);
    }

    public void deleteBusStop(Long id) {
        BusStop busStop = getBusStopById(id);
        busStopRepository.delete(busStop);
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-queueservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/QueueService.java`

**File Info:**
- **Size**: 3.84 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/QueueService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `4dd01d457167e329809debd1decb7818`
- **SHA256**: `c5fad551779eb830cdb8e52d3616c0d87d48dec3d626c21f16872a5c27f940d9`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anbesaflow.auth.dto.QueueStatusResponse;
import com.anbesaflow.auth.entity.QueueEntry;
import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.exception.QueueNotFoundException;
import com.anbesaflow.auth.repository.QueueEntryRepository;
import com.anbesaflow.auth.repository.UserRepository;
import com.anbesaflow.auth.security.CustomUserDetails;

@Service
public class QueueService {

    private final QueueEntryRepository queueRepository;
    private final UserRepository userRepository;

    public QueueService(QueueEntryRepository queueRepository,
                        UserRepository userRepository) {
        this.queueRepository = queueRepository;
        this.userRepository = userRepository;
    }

    private User currentUser() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        CustomUserDetails userDetails =
                (CustomUserDetails) authentication.getPrincipal();

        return userRepository.findById(userDetails.getId())
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }
    @Transactional
public QueueStatusResponse joinQueue(String busStop) {

    User user = currentUser();

    queueRepository.findByUser(user).ifPresent(q -> {
    throw new IllegalStateException(
            "User is already in a queue."
    );
});

    long total = queueRepository.countByBusStop(busStop);

    QueueEntry entry = new QueueEntry();

    entry.setBusStop(busStop);
    entry.setUser(user);
    entry.setJoinedAt(LocalDateTime.now());
    entry.setPosition((int) total + 1);

    queueRepository.save(entry);

    return new QueueStatusResponse(
            busStop,
            entry.getPosition(),
            entry.getPosition()-1,
            total+1
    );
}
@Transactional(readOnly = true)
public QueueStatusResponse getStatus() {

    User user = currentUser();

    QueueEntry entry = queueRepository.findByUser(user)
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    long total =
            queueRepository.countByBusStop(entry.getBusStop());

    return new QueueStatusResponse(

            entry.getBusStop(),

            entry.getPosition(),

            entry.getPosition()-1,

            total
    );
}
@Transactional
public void leaveQueue(){

    User user = currentUser();

    QueueEntry entry = queueRepository.findByUser(user)
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    String stop = entry.getBusStop();

    int removedPosition = entry.getPosition();

    queueRepository.delete(entry);

    List<QueueEntry> queue =
            queueRepository.findByBusStopOrderByPositionAsc(stop);

    for(QueueEntry q : queue){

        if(q.getPosition() > removedPosition){

            q.setPosition(q.getPosition()-1);

            queueRepository.save(q);

        }
    }
}
@Transactional(readOnly = true)
public int getEstimatedWaitingTime(){

    QueueEntry entry =
            queueRepository.findByUser(currentUser())
            .orElseThrow(() ->
                    new QueueNotFoundException("Queue entry not found"));

    final int BUS_CAPACITY = 10;

    final int ARRIVAL_INTERVAL = 10;

    int busesNeeded =
            (int)Math.ceil((double)entry.getPosition()/BUS_CAPACITY);

    return busesNeeded * ARRIVAL_INTERVAL;
}}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-routeservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/RouteService.java`

**File Info:**
- **Size**: 1.84 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/RouteService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 16:02:04 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 20:09:51 (Africa/Nairobi / GMT+03:00)
- **MD5**: `051b84e87ac3e8cbcc92c525c11719bb`
- **SHA256**: `bd24ae32f06a5dfcd7d9f267fa4251f9bf6dbea58bfb4701d83517b1a5ceec6e`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.entity.Route;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.RouteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RouteService {

    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    @Transactional(readOnly = true)
    public Page<Route> getAllRoutes(String search, Pageable pageable) {
        if (search != null && !search.isBlank()) {
            return routeRepository.findByNameContainingIgnoreCaseOrStartPointContainingIgnoreCaseOrEndPointContainingIgnoreCase(
                    search, search, search, pageable);
        }
        return routeRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Route getRouteById(Long id) {
        return routeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Route not found with id: " + id));
    }

    public Route updateRoute(Long id, Route updatedRoute) {
        Route existingRoute = getRouteById(id);
        existingRoute.setName(updatedRoute.getName());
        existingRoute.setStartPoint(updatedRoute.getStartPoint());
        existingRoute.setEndPoint(updatedRoute.getEndPoint());
        return routeRepository.save(existingRoute);
    }

    public void deleteRoute(Long id) {
        Route route = getRouteById(id);
        routeRepository.delete(route);
    }
}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-userservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/UserService.java`

**File Info:**
- **Size**: 1.13 KB
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/UserService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6fe267ad193646e9830d26329eccbfda`
- **SHA256**: `4ed5e2a8392cee4653edacfd721d678ad3e57e3d903910e1afee8ef23354bd98`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.UserResponse;
import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.exception.ResourceNotFoundException;
import com.anbesaflow.auth.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserResponse::fromUser)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return UserResponse.fromUser(user);
    }
}

```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-service-waitingtimeservice-java"></a>📄 `src/main/java/com/anbesaflow/auth/service/WaitingTimeService.java`

**File Info:**
- **Size**: 523 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/service/WaitingTimeService.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth/service`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `bb0da77dd322fedd71037ccc1f9b2909`
- **SHA256**: `82a47a57a0999cac46aa5b07de4823586b1ba40ada66bd524411ad723d5f9722`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth.service;

import org.springframework.stereotype.Service;

import com.anbesaflow.auth.dto.WaitingTimeResponse;

@Service
public class WaitingTimeService {

    private final QueueService queueService;

    public WaitingTimeService(QueueService queueService) {
        this.queueService = queueService;
    }

    public WaitingTimeResponse getWaitingTime(){

        return new WaitingTimeResponse(
                queueService.getEstimatedWaitingTime()
        );
    }

}
```

---

### <a id="📄-src-main-java-com-anbesaflow-auth-anbesaflowauthapplication-java"></a>📄 `src/main/java/com/anbesaflow/auth/AnbesaFlowAuthApplication.java`

**File Info:**
- **Size**: 438 B
- **Extension**: `.java`
- **Language**: `java`
- **Location**: `src/main/java/com/anbesaflow/auth/AnbesaFlowAuthApplication.java`
- **Relative Path**: `src/main/java/com/anbesaflow/auth`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `4d60afb295c49587d4e60603da37af3e`
- **SHA256**: `545b59d0a5aa6492630f38b4ae78023fcfd0ec298d7925da69441a3b23050218`
- **Encoding**: ASCII

**File code content:**

```java
package com.anbesaflow.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AnbesaFlowAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnbesaFlowAuthApplication.class, args);
    }
}

```

---

### <a id="📄-src-main-resources-db-migration-v1-init-schema-sql"></a>📄 `src/main/resources/db/migration/V1__init_schema.sql`

**File Info:**
- **Size**: 356 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `src/main/resources/db/migration/V1__init_schema.sql`
- **Relative Path**: `src/main/resources/db/migration`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `47babe6a83cb9430d2757b5c900cedde`
- **SHA256**: `fd2b61e463f3a6772a8ba7349fe5ab74b5444f913a489cd9111352eb1b8e2089`
- **Encoding**: ASCII

**File code content:**

```sql
-- Create users table
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- Add index on email for faster authentication lookups
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);

```

---

### <a id="📄-src-main-resources-db-migration-v2-create-queue-entry-table-sql"></a>📄 `src/main/resources/db/migration/V2__create_queue_entry_table.sql`

**File Info:**
- **Size**: 461 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `src/main/resources/db/migration/V2__create_queue_entry_table.sql`
- **Relative Path**: `src/main/resources/db/migration`
- **Created**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `0bf34dc2776d1e38f88d07e6e6a045ae`
- **SHA256**: `471243f8d03f1a9a240ff65946b210d4e2e08b2bbe2ca6f85ef9211eb2878373`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE queue_entries (

    id BIGSERIAL PRIMARY KEY,

    position INTEGER NOT NULL,

    joined_at TIMESTAMP NOT NULL,

    bus_stop VARCHAR(100) NOT NULL,

    user_id BIGINT NOT NULL UNIQUE,

    CONSTRAINT fk_queue_user
        FOREIGN KEY(user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_queue_bus_stop
ON queue_entries(bus_stop);

CREATE INDEX idx_queue_position
ON queue_entries(position);
```

---

### <a id="📄-src-main-resources-db-migration-v3-create-bus-table-sql"></a>📄 `src/main/resources/db/migration/V3__create_bus_table.sql`

**File Info:**
- **Size**: 365 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `src/main/resources/db/migration/V3__create_bus_table.sql`
- **Relative Path**: `src/main/resources/db/migration`
- **Created**: 2026-06-30 16:03:35 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:15 (Africa/Nairobi / GMT+03:00)
- **MD5**: `abacdbba3a2a6a0410018680967f9027`
- **SHA256**: `a15e0c4aaf3ed5a3e413ea8c5a6b0afbba0e0da8552ffb285c49ea9f79f7a974`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE buses (

    id BIGSERIAL PRIMARY KEY,

    plate_number VARCHAR(50) NOT NULL UNIQUE,

    capacity INTEGER NOT NULL
        CHECK (capacity > 0),

    status VARCHAR(50) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_bus_status
ON buses(status);

CREATE INDEX idx_bus_plate
ON buses(plate_number);
```

---

### <a id="📄-src-main-resources-db-migration-v4-create-route-table-sql"></a>📄 `src/main/resources/db/migration/V4__create_route_table.sql`

**File Info:**
- **Size**: 278 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `src/main/resources/db/migration/V4__create_route_table.sql`
- **Relative Path**: `src/main/resources/db/migration`
- **Created**: 2026-06-30 16:03:43 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:27 (Africa/Nairobi / GMT+03:00)
- **MD5**: `2724843474bcfc47dc4abd260d0d6821`
- **SHA256**: `95c1a3d2a56d50003ea96fc9ff422f9ffb73e18d49395189e2766d0bdcdf3ed9`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE routes (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(150) NOT NULL,

    start_point VARCHAR(100) NOT NULL,

    end_point VARCHAR(100) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_route_name
ON routes(name);
```

---

### <a id="📄-src-main-resources-db-migration-v5-create-bus-stop-and-arrival-log-tables-sql"></a>📄 `src/main/resources/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql`

**File Info:**
- **Size**: 797 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `src/main/resources/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql`
- **Relative Path**: `src/main/resources/db/migration`
- **Created**: 2026-06-30 16:03:59 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:36 (Africa/Nairobi / GMT+03:00)
- **MD5**: `c039b9442688c99fce2d07835bba33b6`
- **SHA256**: `df6eae64247a31b1699ae1c30a1d928fd5712cdc515628e6fc85e7bb6c322939`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE bus_stops (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(120) NOT NULL,

    location VARCHAR(255) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE arrival_logs (

    id BIGSERIAL PRIMARY KEY,

    bus_id BIGINT NOT NULL,

    bus_stop_id BIGINT NOT NULL,

    arrival_time TIMESTAMP,

    departure_time TIMESTAMP,

    status VARCHAR(50) NOT NULL,

    CONSTRAINT fk_arrival_bus
        FOREIGN KEY (bus_id)
        REFERENCES buses(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_arrival_stop
        FOREIGN KEY (bus_stop_id)
        REFERENCES bus_stops(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_arrival_bus
ON arrival_logs(bus_id);

CREATE INDEX idx_arrival_stop
ON arrival_logs(bus_stop_id);
```

---

### <a id="📄-src-main-resources-application-yml"></a>📄 `src/main/resources/application.yml`

**File Info:**
- **Size**: 1 KB
- **Extension**: `.yml`
- **Language**: `yaml`
- **Location**: `src/main/resources/application.yml`
- **Relative Path**: `src/main/resources`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 15:07:44 (Africa/Nairobi / GMT+03:00)
- **MD5**: `1cadd546df5716b7f78628dcc3bb7080`
- **SHA256**: `28e38a1b9503ba6186c132f2bebdab11366a1f88186525f55920620c31e79172`
- **Encoding**: ASCII

**File code content:**

```yaml
spring:
  application:
    name: anbesaflow-auth

  datasource:
    url: ${DATABASE_URL:jdbc:postgresql://localhost:8432/anbesaflow}
    username: ${DATABASE_USERNAME:postgres}
    password: ${DATABASE_PASSWORD:postgres}
    driver-class-name: org.postgresql.Driver

  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: validate
    show-sql: false
    properties:
      hibernate:
        format_sql: true

  flyway:
    enabled: true
    baseline-on-migrate: true

app:
  jwt:
    # 512-bit HMAC-SHA Secret Key (Hex-encoded 64-byte string)
    secret: ${JWT_SECRET:9a67431a7b1b369c0d4860b81c4e743a6d4860b81c4e743a6d4860b81c4e743a9a67431a7b1b369c0d4860b81c4e743a6d4860b81c4e743a6d4860b81c4e743a}
    # Token expiration time: 24 hours in milliseconds (24 * 60 * 60 * 1000)
    expiration-ms: 86400000
    header: Authorization
    prefix: "Bearer "

server:
  port: 8080
  error:
    include-message: always
    include-binding-errors: always

```

---

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/controller/AdminController.class`
- `target/classes/com/anbesaflow/auth/controller/ArrivalLogController.class`
- `target/classes/com/anbesaflow/auth/controller/AuthController.class`
- `target/classes/com/anbesaflow/auth/controller/BusController.class`
- `target/classes/com/anbesaflow/auth/controller/BusStopController.class`
- `target/classes/com/anbesaflow/auth/controller/OperatorController.class`
- `target/classes/com/anbesaflow/auth/controller/PassengerController.class`
- `target/classes/com/anbesaflow/auth/controller/QueueController.class`
- `target/classes/com/anbesaflow/auth/controller/RouteController.class`
- `target/classes/com/anbesaflow/auth/controller/UserController.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/dto/ArrivalLogRequest.class`
- `target/classes/com/anbesaflow/auth/dto/ArrivalLogResponse.class`
- `target/classes/com/anbesaflow/auth/dto/ArrivalLogResponse$ArrivalLogResponseBuilder.class`
- `target/classes/com/anbesaflow/auth/dto/AuthResponse.class`
- `target/classes/com/anbesaflow/auth/dto/BusRequest.class`
- `target/classes/com/anbesaflow/auth/dto/BusResponse.class`
- `target/classes/com/anbesaflow/auth/dto/BusResponse$BusResponseBuilder.class`
- `target/classes/com/anbesaflow/auth/dto/BusStopRequest.class`
- `target/classes/com/anbesaflow/auth/dto/BusStopResponse.class`
- `target/classes/com/anbesaflow/auth/dto/BusStopResponse$BusStopResponseBuilder.class`
- `target/classes/com/anbesaflow/auth/dto/ErrorResponse.class`
- `target/classes/com/anbesaflow/auth/dto/JoinQueueRequest.class`
- `target/classes/com/anbesaflow/auth/dto/LoginRequest.class`
- `target/classes/com/anbesaflow/auth/dto/QueueStatusResponse.class`
- `target/classes/com/anbesaflow/auth/dto/RegisterRequest.class`
- `target/classes/com/anbesaflow/auth/dto/RouteRequest.class`
- `target/classes/com/anbesaflow/auth/dto/RouteResponse.class`
- `target/classes/com/anbesaflow/auth/dto/RouteResponse$RouteResponseBuilder.class`
- `target/classes/com/anbesaflow/auth/dto/UserResponse.class`
- `target/classes/com/anbesaflow/auth/dto/WaitingTimeResponse.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/entity/ArrivalLog.class`
- `target/classes/com/anbesaflow/auth/entity/ArrivalLog$ArrivalLogBuilder.class`
- `target/classes/com/anbesaflow/auth/entity/Bus.class`
- `target/classes/com/anbesaflow/auth/entity/BusStop.class`
- `target/classes/com/anbesaflow/auth/entity/QueueEntry.class`
- `target/classes/com/anbesaflow/auth/entity/Role.class`
- `target/classes/com/anbesaflow/auth/entity/Route.class`
- `target/classes/com/anbesaflow/auth/entity/User.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/exception/GlobalExceptionHandler.class`
- `target/classes/com/anbesaflow/auth/exception/QueueNotFoundException.class`
- `target/classes/com/anbesaflow/auth/exception/ResourceNotFoundException.class`
- `target/classes/com/anbesaflow/auth/exception/UserAlreadyExistsException.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/repository/ArrivalLogRepository.class`
- `target/classes/com/anbesaflow/auth/repository/BusRepository.class`
- `target/classes/com/anbesaflow/auth/repository/BusStopRepository.class`
- `target/classes/com/anbesaflow/auth/repository/QueueEntryRepository.class`
- `target/classes/com/anbesaflow/auth/repository/RouteRepository.class`
- `target/classes/com/anbesaflow/auth/repository/UserRepository.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/security/CustomUserDetails.class`
- `target/classes/com/anbesaflow/auth/security/CustomUserDetailsService.class`
- `target/classes/com/anbesaflow/auth/security/JwtAuthenticationFilter.class`
- `target/classes/com/anbesaflow/auth/security/JwtTokenProvider.class`
- `target/classes/com/anbesaflow/auth/security/SecurityConfig.class`
- `target/classes/com/anbesaflow/auth/security/TokenBlacklistService.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/service/ArrivalLogService.class`
- `target/classes/com/anbesaflow/auth/service/AuthService.class`
- `target/classes/com/anbesaflow/auth/service/BusService.class`
- `target/classes/com/anbesaflow/auth/service/BusStopService.class`
- `target/classes/com/anbesaflow/auth/service/QueueService.class`
- `target/classes/com/anbesaflow/auth/service/RouteService.class`
- `target/classes/com/anbesaflow/auth/service/UserService.class`
- `target/classes/com/anbesaflow/auth/service/WaitingTimeService.class`

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/classes/com/anbesaflow/auth/AnbesaFlowAuthApplication.class`

### <a id="📄-target-classes-db-migration-v1-init-schema-sql"></a>📄 `target/classes/db/migration/V1__init_schema.sql`

**File Info:**
- **Size**: 356 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `target/classes/db/migration/V1__init_schema.sql`
- **Relative Path**: `target/classes/db/migration`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `47babe6a83cb9430d2757b5c900cedde`
- **SHA256**: `fd2b61e463f3a6772a8ba7349fe5ab74b5444f913a489cd9111352eb1b8e2089`
- **Encoding**: ASCII

**File code content:**

```sql
-- Create users table
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- Add index on email for faster authentication lookups
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);

```

---

### <a id="📄-target-classes-db-migration-v2-create-queue-entry-table-sql"></a>📄 `target/classes/db/migration/V2__create_queue_entry_table.sql`

**File Info:**
- **Size**: 461 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `target/classes/db/migration/V2__create_queue_entry_table.sql`
- **Relative Path**: `target/classes/db/migration`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 14:19:21 (Africa/Nairobi / GMT+03:00)
- **MD5**: `0bf34dc2776d1e38f88d07e6e6a045ae`
- **SHA256**: `471243f8d03f1a9a240ff65946b210d4e2e08b2bbe2ca6f85ef9211eb2878373`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE queue_entries (

    id BIGSERIAL PRIMARY KEY,

    position INTEGER NOT NULL,

    joined_at TIMESTAMP NOT NULL,

    bus_stop VARCHAR(100) NOT NULL,

    user_id BIGINT NOT NULL UNIQUE,

    CONSTRAINT fk_queue_user
        FOREIGN KEY(user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_queue_bus_stop
ON queue_entries(bus_stop);

CREATE INDEX idx_queue_position
ON queue_entries(position);
```

---

### <a id="📄-target-classes-db-migration-v3-create-bus-table-sql"></a>📄 `target/classes/db/migration/V3__create_bus_table.sql`

**File Info:**
- **Size**: 365 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `target/classes/db/migration/V3__create_bus_table.sql`
- **Relative Path**: `target/classes/db/migration`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:15 (Africa/Nairobi / GMT+03:00)
- **MD5**: `abacdbba3a2a6a0410018680967f9027`
- **SHA256**: `a15e0c4aaf3ed5a3e413ea8c5a6b0afbba0e0da8552ffb285c49ea9f79f7a974`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE buses (

    id BIGSERIAL PRIMARY KEY,

    plate_number VARCHAR(50) NOT NULL UNIQUE,

    capacity INTEGER NOT NULL
        CHECK (capacity > 0),

    status VARCHAR(50) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_bus_status
ON buses(status);

CREATE INDEX idx_bus_plate
ON buses(plate_number);
```

---

### <a id="📄-target-classes-db-migration-v4-create-route-table-sql"></a>📄 `target/classes/db/migration/V4__create_route_table.sql`

**File Info:**
- **Size**: 278 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `target/classes/db/migration/V4__create_route_table.sql`
- **Relative Path**: `target/classes/db/migration`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:27 (Africa/Nairobi / GMT+03:00)
- **MD5**: `2724843474bcfc47dc4abd260d0d6821`
- **SHA256**: `95c1a3d2a56d50003ea96fc9ff422f9ffb73e18d49395189e2766d0bdcdf3ed9`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE routes (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(150) NOT NULL,

    start_point VARCHAR(100) NOT NULL,

    end_point VARCHAR(100) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_route_name
ON routes(name);
```

---

### <a id="📄-target-classes-db-migration-v5-create-bus-stop-and-arrival-log-tables-sql"></a>📄 `target/classes/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql`

**File Info:**
- **Size**: 797 B
- **Extension**: `.sql`
- **Language**: `sql`
- **Location**: `target/classes/db/migration/V5__create_bus_stop_and_arrival_log_tables.sql`
- **Relative Path**: `target/classes/db/migration`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 16:31:36 (Africa/Nairobi / GMT+03:00)
- **MD5**: `c039b9442688c99fce2d07835bba33b6`
- **SHA256**: `df6eae64247a31b1699ae1c30a1d928fd5712cdc515628e6fc85e7bb6c322939`
- **Encoding**: ASCII

**File code content:**

```sql
CREATE TABLE bus_stops (

    id BIGSERIAL PRIMARY KEY,

    name VARCHAR(120) NOT NULL,

    location VARCHAR(255) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE arrival_logs (

    id BIGSERIAL PRIMARY KEY,

    bus_id BIGINT NOT NULL,

    bus_stop_id BIGINT NOT NULL,

    arrival_time TIMESTAMP,

    departure_time TIMESTAMP,

    status VARCHAR(50) NOT NULL,

    CONSTRAINT fk_arrival_bus
        FOREIGN KEY (bus_id)
        REFERENCES buses(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_arrival_stop
        FOREIGN KEY (bus_stop_id)
        REFERENCES bus_stops(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_arrival_bus
ON arrival_logs(bus_id);

CREATE INDEX idx_arrival_stop
ON arrival_logs(bus_stop_id);
```

---

### <a id="📄-target-classes-application-yml"></a>📄 `target/classes/application.yml`

**File Info:**
- **Size**: 1 KB
- **Extension**: `.yml`
- **Language**: `yaml`
- **Location**: `target/classes/application.yml`
- **Relative Path**: `target/classes`
- **Created**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:48:26 (Africa/Nairobi / GMT+03:00)
- **MD5**: `1cadd546df5716b7f78628dcc3bb7080`
- **SHA256**: `28e38a1b9503ba6186c132f2bebdab11366a1f88186525f55920620c31e79172`
- **Encoding**: ASCII

**File code content:**

```yaml
spring:
  application:
    name: anbesaflow-auth

  datasource:
    url: ${DATABASE_URL:jdbc:postgresql://localhost:8432/anbesaflow}
    username: ${DATABASE_USERNAME:postgres}
    password: ${DATABASE_PASSWORD:postgres}
    driver-class-name: org.postgresql.Driver

  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: validate
    show-sql: false
    properties:
      hibernate:
        format_sql: true

  flyway:
    enabled: true
    baseline-on-migrate: true

app:
  jwt:
    # 512-bit HMAC-SHA Secret Key (Hex-encoded 64-byte string)
    secret: ${JWT_SECRET:9a67431a7b1b369c0d4860b81c4e743a6d4860b81c4e743a6d4860b81c4e743a9a67431a7b1b369c0d4860b81c4e743a6d4860b81c4e743a6d4860b81c4e743a}
    # Token expiration time: 24 hours in milliseconds (24 * 60 * 60 * 1000)
    expiration-ms: 86400000
    header: Authorization
    prefix: "Bearer "

server:
  port: 8080
  error:
    include-message: always
    include-binding-errors: always

```

---

## 🚫 Binary/Excluded Files

The following files were not included in the text content:

- `target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst`
- `target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst`

### <a id="📄-anbesaflow-authentication-postman-collection-json"></a>📄 `AnbesaFlow_Authentication_Postman_Collection.json`

**File Info:**
- **Size**: 13.19 KB
- **Extension**: `.json`
- **Language**: `json`
- **Location**: `AnbesaFlow_Authentication_Postman_Collection.json`
- **Relative Path**: `root`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6fa086d4fb578f67b35355babe3634a2`
- **SHA256**: `6a8ec910223e74887cf79583d6e2bc26a72773729d4b6cb104e6e83383e108e7`
- **Encoding**: ASCII

**File code content:**

```json
{
	"info": {
		"_postman_id": "a904db52-1678-43d9-95e2-6320092fae3f",
		"name": "AnbesaFlow Authentication & Security API",
		"description": "Postman Collection for verifying and testing the AnbesaFlow Authentication & Security Management module.",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "Authentication",
			"item": [
				{
					"name": "Register Admin User",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"name\": \"System Admin\",\n    \"email\": \"admin@anbesaflow.com\",\n    \"password\": \"adminPass123\",\n    \"role\": \"ADMIN\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/auth/register",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"auth",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Register Operator User",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"name\": \"Station Operator\",\n    \"email\": \"operator@anbesaflow.com\",\n    \"password\": \"operatorPass123\",\n    \"role\": \"OPERATOR\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/auth/register",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"auth",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Register Passenger User",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"name\": \"Regular Passenger\",\n    \"email\": \"passenger@anbesaflow.com\",\n    \"password\": \"passengerPass123\",\n    \"role\": \"PASSENGER\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/auth/register",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"auth",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Login User",
					"event": [
						{
							"listen": "test",
							"script": {
								"exec": [
									"if (pm.response.code === 200) {",
									"    var jsonData = pm.response.json();",
									"    if (jsonData.token) {",
									"        pm.collectionVariables.set(\"token\", jsonData.token);",
									"        pm.collectionVariables.set(\"userId\", jsonData.user.id);",
									"        console.log(\"Saved JWT Token to variables: \" + jsonData.token);",
									"    }",
									"}"
								],
								"type": "text/javascript"
							}
						}
					],
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"email\": \"admin@anbesaflow.com\",\n    \"password\": \"adminPass123\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/auth/login",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"auth",
								"login"
							]
						}
					},
					"response": []
				},
				{
					"name": "Logout User",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"url": {
							"raw": "{{baseUrl}}/auth/logout",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"auth",
								"logout"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "User Management",
			"item": [
				{
					"name": "Get All Users (Admin Only)",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"url": {
							"raw": "{{baseUrl}}/users",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"users"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get User By ID (Admin or Self)",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"url": {
							"raw": "{{baseUrl}}/users/{{userId}}",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"users",
								"{{userId}}"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Admin Panel",
			"item": [
				{
					"name": "Create Bus Stop",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"name\": \"Mexico Square Station\",\n    \"coordinates\": \"8.9984,38.7497\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/admin/bus-stops",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"admin",
								"bus-stops"
							]
						}
					},
					"response": []
				},
				{
					"name": "Create Route",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"routeCode\": \"R-04\",\n    \"startStop\": \"Mexico\",\n    \"endStop\": \"Megenagna\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/admin/routes",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"admin",
								"routes"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update System Settings",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"allowOvercrowding\": false,\n    \"gpsTrackingIntervalSeconds\": 10,\n    \"maintenanceMode\": false\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/admin/settings",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"admin",
								"settings"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Operator Panel",
			"item": [
				{
					"name": "Record Bus Arrival",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"busId\": \"BUS-ANB-232\",\n    \"stopId\": \" Mexico-01\",\n    \"timestamp\": \"2026-06-29T09:12:00\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/operator/bus-arrivals",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"operator",
								"bus-arrivals"
							]
						}
					},
					"response": []
				},
				{
					"name": "Record Bus Departure",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"busId\": \"BUS-ANB-232\",\n    \"stopId\": \"Mexico-01\",\n    \"timestamp\": \"2026-06-29T09:15:00\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/operator/bus-departures",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"operator",
								"bus-departures"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update Bus Status",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"busId\": \"BUS-ANB-232\",\n    \"status\": \"MAINTENANCE\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/operator/bus-status",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"operator",
								"bus-status"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Passenger Panel",
			"item": [
				{
					"name": "Get Waiting Times",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"url": {
							"raw": "{{baseUrl}}/passenger/waiting-times?stopId=Mexico-01",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"passenger",
								"waiting-times"
							],
							"query": [
								{
									"key": "stopId",
									"value": "Mexico-01"
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Join Queue",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"stopId\": \"Mexico-01\"\n}"
						},
						"url": {
							"raw": "{{baseUrl}}/passenger/queues/join",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"passenger",
								"queues",
								"join"
							]
						}
					},
					"response": []
				},
				{
					"name": "Check Queue Position",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"url": {
							"raw": "{{baseUrl}}/passenger/queues/position?queueId=Q-9912",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"passenger",
								"queues",
								"position"
							],
							"query": [
								{
									"key": "queueId",
									"value": "Q-9912"
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Check Bus Availability",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "{{token}}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"url": {
							"raw": "{{baseUrl}}/passenger/buses/availability?routeId=R-04",
							"host": [
								"{{baseUrl}}"
							],
							"path": [
								"passenger",
								"buses",
								"availability"
							],
							"query": [
								{
									"key": "routeId",
									"value": "R-04"
								}
							]
						}
					},
					"response": []
				}
			]
		}
	],
	"event": [
		{
			"listen": "prerequest",
			"script": {
				"type": "text/javascript",
				"exec": [
					""
				]
			}
		},
		{
			"listen": "test",
			"script": {
				"type": "text/javascript",
				"exec": [
					""
				]
			}
		}
	],
	"variable": [
		{
			"key": "baseUrl",
			"value": "http://localhost:8080",
			"type": "string"
		},
		{
			"key": "token",
			"value": "",
			"type": "string"
		},
		{
			"key": "userId",
			"value": "1",
			"type": "string"
		}
	]
}

```

---

### <a id="📄-pom-xml"></a>📄 `pom.xml`

**File Info:**
- **Size**: 3.46 KB
- **Extension**: `.xml`
- **Language**: `xml`
- **Location**: `pom.xml`
- **Relative Path**: `root`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-30 19:40:23 (Africa/Nairobi / GMT+03:00)
- **MD5**: `271bb8ad7bf18edf7baccf9d38a5302d`
- **SHA256**: `d166e2e59f13739750c21504cd413a77a80e265b0f9000878accf4239c7ea080`
- **Encoding**: ASCII

**File code content:**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <groupId>com.anbesaflow</groupId>
    <artifactId>anbesaflow-auth</artifactId>
    <version>1.0.0</version>
    <name>anbesaflow-auth</name>
    <description>Authentication &amp; Security Management module for AnbesaFlow</description>

    <properties>
        <java.version>17</java.version>
        <jjwt.version>0.11.5</jjwt.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

        <!-- Database -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
        </dependency>
        <!-- JSON Web Token (JWT) -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>${jjwt.version}</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <!-- Test dependencies -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

```

---

### <a id="📄-readme-md"></a>📄 `README.md`

**File Info:**
- **Size**: 19 B
- **Extension**: `.md`
- **Language**: `text`
- **Location**: `README.md`
- **Relative Path**: `root`
- **Created**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **Modified**: 2026-06-29 07:49:09 (Africa/Nairobi / GMT+03:00)
- **MD5**: `6a85877102f9e9f912140992fb22a35f`
- **SHA256**: `c8d9abbdfe30b3083b60cd4f3fe205845ebc5fa0f44dfdf8b0d0ea9d431b3910`
- **Encoding**: ASCII

**File code content:**

````markdown
# AnbesaFlow Auth

````

---

