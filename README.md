# Student Management System – Java + Maven + MySQL + JasperReports

This is a complete Student Management System built using **Java (with Swing GUI)**, **Maven**, **MySQL**, and **JasperReports**. The system includes full CRUD functionality for both **students** and **courses**, along with a **report viewer** to generate printable PDF-style reports.

---

## Technologies Used

- Java SE (Swing GUI with NetBeans GUI Builder)
- Maven (Project Management)
- MySQL (Database)
- JDBC (MySQL connectivity)
- JasperReports + JasperViewer (Report generation)
- NetBeans IDE

---

## Project Structure (Modules)

| Module         | Description                                              |
|----------------|----------------------------------------------------------|
| `DBConnection` | Handles MySQL DB connection using JDBC                   |
| `StudentDAO`   | DAO for managing student records                         |
| `CourseDAO`    | DAO for managing course records                          |
| `StudentForm`  | GUI for student management (Add, Update, Delete, View)   |
| `CourseForm`   | GUI for course management (Add, Update, Delete, View)    |
| `ReportForm`   | GUI to generate and view student reports (JasperReports) |
| `MainMenu`     | Launchpad to open all other forms                        |

---

## Student Management – Features

- Add new student
- Update student by selecting ID from combo box
- Delete student
- View student list in a table
- Student ID auto-selected using `JComboBox`
- Automatically loads data into fields when ID is selected

---

## Course Management – Features

- Add new course (name, duration, fee)
- Update course using `JComboBox` selection
- Delete course
- View all courses in a table

---

## Reports – JasperReports Integration

- View **Student Report** in a JasperViewer window
- Report displays all students using SQL:  
  ```sql
  SELECT id, name, age, grade FROM students;
