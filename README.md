# Hotel Management System - Setup & Usage Guide

## Table of Contents

- [Project Description](#project-description)
- [Implemented Features](#implemented-features)
  - [Authentication](#authentication)
  - [Admin Panel](#admin-panel)
  - [Reception Panel](#reception-panel)
- [Technology Stack](#technology-stack)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [Application Flow](#application-flow)
- [Project Structure](#project-structure)
- [Screenshots and Assets](#screenshots-and-assets)
- [Notes](#notes)

---

## Project Description

Hotel Management System is a Java Swing desktop application for managing the main
operations of a hotel. It provides authenticated access to administrative and
reception workflows, allowing staff to manage hotel resources, employees, guests,
rooms, drivers, departments, and check-in information from one application.

The application uses a MySQL database through JDBC. Its interface is built with
Java Swing and uses the image assets in `src/icon` for navigation screens,
backgrounds, and module illustrations.

---

## Implemented Features

### Authentication

- Login screen connected to the `login` table.
- Separate admin login connected to the `login2` table.
- Invalid credentials are rejected before the relevant dashboard opens.
- Cancel and logout actions close the current session.

### Admin Panel

The admin area provides access to:

- Add employee
- Add room
- Add driver
- Return to the main dashboard
- Logout

### Reception Panel

The reception area provides screens for:

- Registering a new customer and assigning an available room
- Viewing room information and searching by bed type or availability
- Viewing departments
- Viewing employee and manager information
- Viewing customer information
- Selecting a driver and pickup service
- Updating check-in and room information where supported by the application

---

## Technology Stack

- **Language:** Java
- **UI:** Java Swing
- **Database:** MySQL
- **Database access:** JDBC / MySQL Connector/J
- **IDE:** IntelliJ IDEA
- **Project type:** IntelliJ IDEA Java project

---

## Prerequisites

Before running the application, install:

- Java Development Kit (JDK)
- IntelliJ IDEA
- MySQL Server and MySQL Workbench (or another MySQL client)
- MySQL Connector/J

The project currently uses the following local database connection:

```text
Host: localhost
Port: 3306
Database: hotelM
```

---

## Installation and Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/maheen112/Hotel-Management-System.git
   ```

2. Open the `Hotel Management System` folder in IntelliJ IDEA.

3. Configure the project SDK to a compatible JDK.

4. Add MySQL Connector/J to the project classpath. The IntelliJ project library
   configuration is stored in `.idea/libraries`.

5. Create the MySQL database and tables described in
   [Database Configuration](#database-configuration).

6. Update the connection settings in
   [`Conn.java`](Hotel%20Management%20System/src/Hotel/Manager/System/Conn.java)
   if your MySQL username, password, host, port, or database name is different.

---

## Database Configuration

Create the application database before starting the program:

```sql
CREATE DATABASE hotelM;
```

The application reads from and writes to these tables:

- `login` - primary login credentials
- `login2` - admin credentials
- `employee` - employee and manager records
- `room` - room number, availability, status, price, and bed type
- `driver` - driver and vehicle records
- `department` - hotel departments
- `customer` - guest check-in records

The Java classes contain the queries used by each screen. Make sure the table
columns match those queries before running the application. Add test login
records to `login` and `login2` according to your local database setup.

> Do not commit real database passwords or production credentials. Use local
> development credentials and update `Conn.java` only in your local checkout.

---

## Running the Application

1. Open:
   `src/Hotel/Manager/System/Login.java`
2. Run the `main` method from IntelliJ IDEA.
3. Sign in with a record from the `login` table.
4. Choose **Reception** or **Admin** from the dashboard.

Individual screens also contain `main` methods and can be launched directly for
module-level testing, including `Admin`, `Reception`, `AddRoom`, `AddEmployee`,
`AddDriver`, and `SearchRoom`.

---

## Application Flow

```text
Login
  |
  v
Dashboard
  |----------------------|
  v                      v
Reception              Admin Login
  |                      |
  v                      v
Guest, room,            Add employee,
department,            room, or driver
employee, driver
management
```

---

## Project Structure

```text
Hotel Management System/
├── src/
│   ├── Hotel/Manager/System/
│   │   ├── Login.java
│   │   ├── Dassbord.java
│   │   ├── Reception.java
│   │   ├── Admin.java
│   │   ├── NewCustomer.java
│   │   ├── SearchRoom.java
│   │   ├── AddEmployee.java
│   │   ├── AddRoom.java
│   │   ├── AddDriver.java
│   │   └── Conn.java
│   └── icon/
│       ├── Dashboard.gif
│       ├── Reception.png
│       ├── room.png
│       ├── employee and driver icons
│       └── login and background images
├── .idea/
└── Hotel Management System.iml
```

---

## Screenshots and Assets

The repository includes the visual assets used by the application:

- Dashboard background: [`Dashboard.gif`](Hotel%20Management%20System/src/icon/Dashboard.gif)
- Reception artwork: [`Reception.png`](Hotel%20Management%20System/src/icon/Reception.png)
- Admin artwork: [`boss.png`](Hotel%20Management%20System/src/icon/boss.png)
- Room artwork: [`room.png`](Hotel%20Management%20System/src/icon/room.png)
- Driver artwork: [`driver.png`](Hotel%20Management%20System/src/icon/driver.png)
- Login artwork: [`login.gif`](Hotel%20Management%20System/src/icon/login.gif)

---

## Notes

- This repository is an IntelliJ IDEA project and does not currently include a
  Maven or Gradle build file.
- Database availability is required for login and data-management screens.
- The application uses absolute-size Swing layouts designed for a large desktop
  display.
- Keep the MySQL Connector/J version compatible with the JDK used to run the
  project.

---

## Author

Developed by [maheen112](https://github.com/maheen112).
