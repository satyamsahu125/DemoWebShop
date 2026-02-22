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
├── pom.xml
├── README.md
├── testng.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── pages                ← Page Object Model classes
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── ComputersPage.java
│   │   │   │   ├── ContactUsPage.java
│   │   │   │   ├── DashboardPage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── ProductPage.java
│   │   │   │   ├── ProfilePage.java
│   │   │   │   ├── RegisterPage.java
│   │   │   │   ├── ReviewPage.java
│   │   │   │   ├── SearchPage.java
│   │   │   │   └── WishListPage.java
│   │   │   │
│   │   │   └── utilities            ← Framework core
│   │   │       ├── BaseClass.java
│   │   │       ├── WebDriverUtility.java
│   │   │       ├── ExcelUtility.java
│   │   │       ├── PropertiesUtility.java
│   │   │       ├── JavaUtility.java
│   │   │       ├── ListenerUtility.java
│   │   │       └── ExtentManager.java
│   │   │
│   │   └── resources                ← 
│   │
│   └── test
│       ├── java
│       │   └── tests                ← Test Classes
│       │       ├── CartTest.java
│       │       ├── ContactUsTest.java
│       │       ├── LoginTest.java
│       │       ├── RegisterTest.java
│       │       ├── ReviewTest.java
│       │       └── WishListTest.java
│       │
│       └── resources                ← Test Data
│           ├── commondata.properties
│           └── testCaseData.xlsx
│
├── reports                          ← Extent Reports
├── screenshots                      ← Failure Screenshots
├── docs
│   └── images                       ← README images
│
├── target                           ← Maven auto generated
└── test-output                      ← TestNG reports
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
