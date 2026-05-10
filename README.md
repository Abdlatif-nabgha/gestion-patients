# Patients Management Application

A robust Spring Boot 3 application designed for managing patient records efficiently. This application provides a complete CRUD (Create, Read, Update, Delete) interface with secure authentication and role-based access control.

## 🚀 Features

- **Secure Authentication:** Custom login system using Spring Security.
- **Role-Based Access Control (RBAC):**
  - `USER`: Can view and search patients.
  - `ADMIN`: Full access to add, edit, and delete patients.
- **Patient Management:**
  - List patients with pagination.
  - Search patients by name.
  - Add new patients with validation.
  - Edit existing patient details.
  - Delete patient records.
- **Responsive UI:** Built with Thymeleaf and Bootstrap 5 for a modern look across devices.
- **Data Persistence:** Uses Spring Data JPA with MySQL (support for H2 included).

## 🛠️ Technology Stack

- **Framework:** Spring Boot 3.5.x
- **Language:** Java 21
- **Database:** MySQL (Primary), H2 (Development/Testing)
- **UI Engine:** Thymeleaf with Layout Dialect
- **Security:** Spring Security 6
- **Styling:** Bootstrap 5 & Bootstrap Icons (Webjars)
- **Utilities:** Lombok, Maven

## 📋 Prerequisites

- **Java Development Kit (JDK):** Version 21 or higher.
- **Maven:** Version 3.9 or higher (or use the provided `mvnw` wrapper).
- **MySQL Server:** Ensure a MySQL instance is running and accessible.

## ⚙️ Configuration

Before running the application, update the `src/main/resources/application.properties` file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/patients_db?createDatabaseIfNotExist=true
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

The application runs on port `8085` by default.

## 🏃 Running the Application

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd patients-app
   ```

2. **Build and run using Maven:**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the application:**
   Open your browser and navigate to `http://localhost:8085`

## 🔐 Default Credentials

The application uses in-memory authentication for demonstration:

| Username | Role | Password |
| :--- | :--- | :--- |
| **Nabgha** | ADMIN, USER | 44026676 |
| **Mohamed** | USER | 44026676 |
| **Abdellatif** | USER | 44026676 |

## 📁 Project Structure

- `src/main/java`: Backend logic (Entities, Repositories, Controllers, Security).
- `src/main/resources/templates`: HTML views using Thymeleaf.
- `src/main/resources/static`: Static assets (CSS, JS).
- `pom.xml`: Project dependencies and configuration.

---
Developed by [Nabgha](https://github.com/nabgha)
