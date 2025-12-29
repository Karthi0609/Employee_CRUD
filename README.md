
---

# Employee Management System – Spring Boot CRUD API

## 📌 Project Overview

This project is a **Spring Boot RESTful application** that performs **CRUD (Create, Read, Update, Delete)** operations for an **Employee** entity.
It is developed as a demo assignment to showcase **Spring Boot, REST APIs, validation, exception handling, and MySQL integration**.

---

## 🛠️ Tech Stack

* **Java:** 
* **Spring Boot:** 3.x
* **Spring Data JPA**
* **MySQL**
* **Hibernate**
* **Maven**
* **Postman (API Testing)**

---

## 📂 Project Structure

```
com.example.employee
│
├── controller        # REST Controllers
├── service           # Service interfaces
├── service.impl      # Service implementations
├── repository        # JPA Repositories
├── model             # Entity classes
├── dto               # API Response DTOs
├── exception         # Custom & Global Exception Handling
└── EmployeeCrudApplication.java
```

---

## 📘 Employee Entity

| Field      | Type   | Description                |
| ---------- | ------ | -------------------------- |
| empId      | Long   | Auto-generated Primary Key |
| name       | String | Employee Name              |
| email      | String | Employee Email             |
| department | String | Department Name            |

---

## ✅ Features Implemented

* Create Employee with validation
* Get all Employees
* Get Employee by ID
* Update Employee details
* Delete Employee by ID
* Input validation using annotations
* Global exception handling
* Standard layered architecture
* RESTful API design

---

## 🔐 Validations

* `@NotBlank` for name, email, department
* `@Email` for email format validation

---

## ⚠️ Exception Handling

* Employee not found
* Validation errors
* Global exception handler using `@RestControllerAdvice`

---

## 🔗 API Endpoints

### ➕ Create Employee

**POST**

```
/api/employees
```

**Request Body**

```json
{
  "name": "Karthikeyan",
  "email": "karthikeyan@gmail.com",
  "department": "IT"
}
```

---

### 📄 Get All Employees

**GET**

```
/api/employees
```

---

### 🔍 Get Employee By ID

**GET**

```
/api/employees/{id}
```

---

### ✏️ Update Employee

**PUT**

```
/api/employees/{id}
```

**Request Body**

```json
{
  "name": "Karthikeyan S",
  "email": "karthikeyan.s@gmail.com",
  "department": "Development"
}
```

**Response**

```json
{
  "success": true,
  "message": "Employee updated successfully"
}
```

---

### ❌ Delete Employee

**DELETE**

```
/api/employees/{id}
```

**Response**

```json
{
  "success": true,
  "message": "Employee deleted successfully"
}
```

---

## 🗄️ Database Configuration

**MySQL**

Create database:

```sql
CREATE DATABASE employee_db;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run the Application

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/employee-crud-springboot.git
   ```
2. Import into IDE (STS)
3. Configure MySQL credentials
4. Run `EmployeeCrudApplication`
5. Test APIs using Postman

---

## 🧪 API Testing

* APIs tested using **Postman**
* Supports success and failure responses
* Validation and error handling verified

---

## 👤 Author

**Karthikeyan**
Java | Spring Boot Developer

---

