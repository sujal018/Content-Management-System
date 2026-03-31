# 📌 Content Management System (Java)

## 🚀 Project Overview

This is a **console-based Content Management System** developed using **Core Java**.
It allows users to manage customer subscriptions, perform validation, and handle operations like login, update, sorting, and more.

---

## 🛠️ Tech Stack

* Java (Core Java)
* OOP Concepts
* Java Collections (ArrayList)
* Java Streams API
* Exception Handling

---

## 📂 Project Structure

```
com.code            → Customer & ServicePlan classes  
com.service         → Business logic (Service class)  
com.validate        → Validation logic  
com.customvalidation→ Custom Exception  
com.utility         → Dummy data generator  
com.test            → Main class (Tester)
```

---

## ✨ Features

### 👤 Customer Management

* Add new customer with validation
* Prevent duplicate email registration
* Auto-generate customer ID

### 🔐 Authentication

* Login using email & password
* Update password securely

### 📊 Data Operations

* Show all customers
* Sort by:

  * Name
  * Registration Amount
  * Service Plan

### 💰 Financial Operations

* Calculate total registration amount
* Calculate amount based on service plan

### ❌ Other Features

* Unsubscribe (delete customer)
* Input validation using regex
* Custom exception handling

---

## 📋 Service Plans

| Plan     | Charges |
| -------- | ------- |
| SILVER   | 1000    |
| GOLD     | 2000    |
| DIAMOND  | 5000    |
| PLATINUM | 10000   |

---

## ⚙️ How to Run

### 🔹 Step 1: Clone Repository

```
git clone https://github.com/sujal018/Content-Management-System.git
```

### 🔹 Step 2: Open in IDE

* Open in Eclipse / IntelliJ / VS Code

### 🔹 Step 3: Run

* Run `Tester.java`

---

## 📸 Sample Menu

```
1. Show All
2. Add
3. Login
4. Update Password
5. Sort By Name
6. Sort By Price
7. Sort By Service Plan
8. Get Total Registration Amount
9. Get Amount According to Plan
10. Unsubscribe Customer
11. Exit
```

---

## ⚠️ Validations

* Email format validation
* Strong password validation:

  * At least 1 uppercase
  * 1 lowercase
  * 1 digit
  * 1 special character
* Plan amount validation

---

## 🧠 Key Concepts Used

* OOP (Encapsulation, Abstraction)
* `equals()` & `hashCode()` (based on email)
* Java Streams & Lambda Expressions
* Custom Exception Handling

---

## 👨‍💻 Author

**Sujal Sahu**
📍 BE IT Student | Java Developer | Data Analytics Enthusiast

---

## ⭐ Future Improvements

* GUI version (JavaFX / Web)
* Database integration (MySQL / Hibernate)
* REST API (Spring Boot)

---

## 🙌 Acknowledgement

This project is built for learning and practicing Java concepts.

---
