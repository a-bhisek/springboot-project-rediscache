# Spring Boot Redis Cache Project

## Overview

The Spring Boot Redis Cache Project is a backend RESTful application developed using Java 21, Spring Boot, MySQL, and Redis. The application demonstrates the implementation of CRUD operations with Redis-based caching to improve application performance and reduce unnecessary database queries. It also incorporates Global Exception Handling to provide consistent and user-friendly error responses across all API endpoints.

The primary objective of this project is to showcase how Redis caching can be integrated with Spring Boot applications to optimize data retrieval, minimize database load, and improve response times for frequently accessed data.

---

## Key Features

* Developed RESTful APIs using Spring Boot for efficient data management.
* Implemented complete CRUD (Create, Read, Update, Delete) operations.
* Integrated MySQL database using Spring Data JPA and Hibernate ORM.
* Configured Redis as a distributed caching solution using Spring Cache.
* Reduced database access by caching frequently requested data.
* Implemented cache synchronization using cache update and eviction strategies.
* Added Global Exception Handling using `@RestControllerAdvice` and `@ExceptionHandler`.
* Implemented input validation to ensure data integrity and reliability.
* Followed a layered architecture approach for better maintainability and scalability.
* Utilized Hibernate for object-relational mapping and efficient database operations.

---

## Technology Stack

| Technology      | Purpose                           |
| --------------- | --------------------------------- |
| Java 21         | Core Programming Language         |
| Spring Boot     | Application Development Framework |
| Spring Data JPA | Data Access Layer                 |
| Hibernate       | ORM Framework                     |
| Redis           | In-Memory Caching                 |
| MySQL           | Relational Database               |
| Maven           | Build and Dependency Management   |
| REST APIs       | Client-Server Communication       |

---

## Architecture

```text
Client Request
      |
      v
Controller Layer
      |
      v
Service Layer
      |
      v
Redis Cache
      |
      v
Repository Layer
      |
      v
MySQL Database
```

---

## Redis Caching Workflow

1. A client sends a request to retrieve data.
2. The application first checks Redis Cache for the requested data.
3. If the data exists in Redis, it is returned immediately without querying the database.
4. If the data is not found in Redis, the application fetches it from MySQL.
5. The retrieved data is stored in Redis for future requests.
6. Subsequent requests are served directly from Redis, significantly improving response times.
7. Cache entries are updated or removed whenever data is modified or deleted.

---

## API Functionalities

### Create Resource

* Add new records to the database.
* Persist data using Spring Data JPA.

### Retrieve Resource

* Fetch individual records by ID.
* Retrieve all available records.
* Utilize Redis caching for optimized data access.

### Update Resource

* Modify existing records.
* Synchronize cache with updated database records.

### Delete Resource

* Remove records from the database.
* Evict corresponding cache entries to maintain consistency.

---

## Global Exception Handling

The application uses centralized exception handling to provide consistent error responses throughout the system.

### Handled Exceptions

* Resource Not Found Exception
* Invalid Input Exception
* Database Related Exceptions
* General Application Exceptions

### Benefits

* Consistent API responses
* Improved debugging and maintainability
* Better user experience
* Reduced code duplication

---

## Performance Optimization

Redis caching significantly improves application performance by:

* Reducing repeated database queries.
* Decreasing API response times.
* Lowering database workload.
* Improving scalability for high-traffic applications.
* Enhancing overall user experience.

---

## Project Structure

```text
src/main/java
├── controller
├── service
├── repository
├── entity
├── exception
├── config
└── SpringBootRedisCacheApplication
```

---

## Getting Started

### Prerequisites

* Java 21
* Maven 3.x
* MySQL Server
* Redis Server
* IDE (STS / IntelliJ IDEA / Eclipse)

### Clone Repository

```bash
git clone <repository-url>
cd SpringBoot-RedisCache-Proj01
```

### Configure Database

Update the application configuration with your MySQL credentials.

### Start Redis Server

```bash
redis-server
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## Learning Outcomes

This project demonstrates practical implementation of:

* Spring Boot REST API Development
* Spring Data JPA and Hibernate
* Redis Caching Integration
* Cache Management Strategies
* Global Exception Handling
* Layered Architecture Design
* MySQL Database Integration
* Enterprise Application Development Best Practices

---

## Future Enhancements

* Spring Security with JWT Authentication
* Role-Based Access Control (RBAC)
* Redis Cache Expiration Policies
* Docker Containerization
* API Documentation using Swagger/OpenAPI
* Monitoring with Spring Boot Actuator
* Microservices Architecture Migration

---

## Author

**Abhisek Mohapatra**

Java Backend Developer | Spring Boot | Microservices | MySQL | Redis | AWS

Passionate about building scalable backend applications, optimizing performance, and developing enterprise-grade solutions using modern Java technologies.
