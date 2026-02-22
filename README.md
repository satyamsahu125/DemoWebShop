# 🛒 DemoWebShop Automation Framework

## 📌 Project Overview

This project is a **Selenium Automation Framework** developed using **Java, Maven, TestNG**, and **Extent Reports** following industry-standard automation practices.

The framework automates end-to-end testing of the Demo Web Shop application.

---

## 🚀 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Extent Reports
* Apache POI (Excel Handling)
* Page Object Model (POM Design Pattern)

---

## 📂 Project Structure

```
DemoWebShop
│
├── src
│   ├── main
│   │   └── java
│   │       └── utilities
│   │           ├── BaseClass.java
│   │           ├── ExcelUtility.java
│   │           ├── PropertiesUtility.java
│   │           └── ListnerUtility.java
│   │
│   └── test
│       └── java
│           └── tests
│
├── reports
├── screenshots
├── docs/images
├── testng.xml
└── pom.xml
```

---

## ⚙️ Framework Features

✅ Maven Build Management
✅ TestNG Execution
✅ Listener Implementation
✅ Screenshot Capture on Failure
✅ Extent HTML Reporting
✅ Data Driven Testing (Excel)
✅ Configurable Environment (Properties File)

---

## 📊 Extent Report

Below is the generated Extent Report:

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/32471965-4764-4cd4-9b0e-a49909e558d5" />


---

## ▶️ How to Run Tests

### Run using Maven

```bash
mvn clean test
```

---

### Run using TestNG XML

Right click → `testng.xml` → Run As → TestNG Suite

---

## 🧪 Reporting

After execution, report is generated at:

```
/reports/TestReport.html
```

Open it in browser to view results.

---

## 📸 Screenshot Capture

Screenshots are automatically captured when test cases fail.

Location:

```
/screenshots/
```

---

## 🧠 Design Patterns Used

* Page Object Model (POM)
* Listener Pattern
* Utility-Based Framework
* Data Driven Framework

---

## 👨‍💻 Author

**Satyam Sahu**

QA Automation Engineer
