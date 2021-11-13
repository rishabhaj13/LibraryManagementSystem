# 📚 Library Management System (Backend)

A backend application for managing library operations built using **Java**, **Spring Boot**, and **MySQL**. It exposes RESTful APIs to handle authors, books, publishers, users, and borrowing records.

---

## 🚀 Features

- CRUD operations for:
  - Authors
  - Books
  - Publishers
  - Users
  - Borrow records
- RESTful API design following standard conventions
- Integrated Swagger UI for API documentation and testing
- Layered architecture (Controller, Service, Repository)
- MySQL integration using JPA/Hibernate

---

## 🛠️ Tech Stack

- Backend: Java, Spring Boot
- Database: MySQL
- ORM: Hibernate / JPA
- API Documentation: Swagger UI
- Build Tool: Maven

---

## 📂 Project Structure

```text
src/main/java/com/example/librarymanagement
├── controller     # REST Controllers
├── service        # Business logic
├── repository     # Data access layer
├── model          # Entity classes
├── dto            # Data Transfer Objects
└── config         # Configuration classes (e.g., Swagger)
```

---

## 📌 API Modules

- Author Controller – Manage author details
- Book Controller – Manage books and metadata
- Publisher Controller – Handle publisher information
- User Controller – Manage users
- Borrow Controller – Track borrowing and returns

---

## 📖 API Documentation

Swagger UI is available for testing and exploring APIs.

```text
http://localhost:8070/swagger-ui/index.html
```

---

## ⚙️ Setup and Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/rishabhaj13/LibraryManagementSystem.git
   ```

2. Navigate to the project directory:

   ```bash
   cd LibraryManagementSystem
   ```

3. Configure MySQL in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/library_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

---

## 🧪 Sample API Endpoints

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| GET    | /book/getAllBook     | Get all books     |
| POST   | /book/save           | Add a new book    |
| GET    | /author/getAllAuthor | Get all authors   |
| POST   | /user/save           | Create a new user |
| POST   | /borrow/save         | Borrow a book     |
