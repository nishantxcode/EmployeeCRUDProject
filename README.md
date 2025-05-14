# 🧑‍💼 EmployeeCRUDProject

A RESTful Spring Boot application to manage employee records with complete CRUD operations. Built with Spring Boot, Spring Data JPA, and MySQL, the project demonstrates clean architecture and real-world backend development practices.

---

## 📌 Features

- Create new employee records
- Retrieve all or specific employee details
- Update existing employee information
- Delete employee records by ID
- Layered architecture: Controller → Service → Repository → Model
- MySQL database integration
- Tested with Postman

---

## 🧰 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven

---

## 🔗 Sample API Endpoints

| Method | Endpoint             | Description             |
|--------|----------------------|-------------------------|
| GET    | `/employees`         | Fetch all employees     |
| GET    | `/employees/{id}`    | Fetch employee by ID    |
| POST   | `/employees`         | Add a new employee      |
| PUT    | `/employees/{id}`    | Update employee by ID   |
| DELETE | `/employees/{id}`    | Delete employee by ID   |

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
