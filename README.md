# Hospital Management System

## Overview
The **Hospital Management System** is a Java-based application designed to efficiently manage hospital operations. It utilizes **Hibernate** for ORM, **JDBC** for database connectivity, and **MySQL** as the database backend. The system organizes various hospital entities and operations, providing structured data management through service and DAO layers.

## Technologies Used
- **Java** (Core application logic)
- **Hibernate** (Object-Relational Mapping)
- **JDBC** (Database connectivity)
- **MySQL** (Database management)
- **Maven** (Dependency management)
- **Eclipse/IntelliJ** (IDE for development)

## Features
- Manages multiple hospital **branches** under a college
- Stores **users** and **persons** data securely
- Handles **encounters**, **medical orders**, and **items**
- Tracks **observations** related to patient treatments
- Implements structured **DAO** and **service** layers for scalability

## Entities
The system includes the following entities:
- **College** – Represents the parent institution
- **Address** – Stores location details
- **Branch** – Different branches of the hospital
- **Encounter** – Tracks patient visits
- **Item** – Medicines and medical supplies
- **MedOrder** – Medical prescriptions and orders
- **Observation** – Clinical observations and patient data
- **User** – Hospital staff and administrators
- **Person** – General entity for patients and staff

## Architecture
The project follows a **layered architecture**:
1. **Entity Layer** – Defines all Hibernate entities
2. **DAO Layer** – Handles database operations using Hibernate and JDBC
3. **Service Layer** – Implements business logic and interacts with DAO layer




## Future Enhancements
- Implement **Spring Boot** for better scalability
- Add **REST APIs** for external integrations
- Enhance **security** with authentication and authorization
- Develop a **front-end** using Angular or React

##Created By
minhajpty@gmail.com

