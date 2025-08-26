# 📌 Facebook Data-Driven Automation Project  

This project is a **Data-Driven Test Automation Framework** built using **Java, Selenium, TestNG, Cucumber (BDD), and Apache POI (Excel)**.  
It follows the **Page Object Model (POM)** design pattern and demonstrates how test data can be maintained in **Excel sheets** and consumed in automated UI tests.  

---

## 🚀 Features
- Page Object Model (POM) design for reusable and maintainable code  
- Data-Driven testing with **Apache POI** (Excel integration)  
- Cucumber **Gherkin feature files** for BDD scenarios  
- TestNG integration for parallel and structured test execution  
- Centralized **DriverFactory** for browser setup  
- **Maven** for build and dependency management  
- **GitHub Actions CI/CD** pipeline with test reporting  
- Extensible for **Allure Reports**  

---

## 📂 Project Structure


```

FacebookDataDrivenProject/
│── pom.xml # Maven dependencies
│── README.md # Project documentation
│── .gitignore # Ignored files
│── .github/workflows/ # GitHub Actions CI/CD
│ └── maven.yml
│
├── data/
│ └── users.xlsx # Excel test data
│
├── drivers/ # (Optional) Local WebDriver executables
│ ├── chromedriver.exe
│ └── geckodriver.exe
│
├── src/
│ ├── main/java/
│ │ ├── pages/ # Page Object classes
│ │ └── utils/ # ExcelReader, DriverFactory, Helpers
│ │
│ └── test/java/
│ ├── features/ # Cucumber .feature files
│ ├── stepdefs/ # Step Definitions
│ └── runners/ # TestNG-Cucumber Runner
│
└── reports/ (generated after tests)
├── test-output/ # TestNG HTML reports
├── allure-results/ # Raw Allure results
└── allure-report/ # Allure HTML report

```





---

## ⚙️ Tech Stack
- **Java 17**  
- **Selenium WebDriver**  
- **TestNG**  
- **Cucumber (BDD with Gherkin)**  
- **Apache POI (Excel integration)**  
- **Maven**  
- **Allure Reporting** (optional)  
- **GitHub Actions CI/CD**  

---


## ▶️ How to Run Tests


1. Clone the repository:
   ```bash
   git clone https://github.com/Mugdass/FacebookDataDrivenProject.git
   cd FacebookDataDrivenProject
```

2. Run tests with Maven:
```
     mvn clean test
   ```

4. Generate Allure report (optional):
```
    allure generate allure-results --clean -o allure-report
    allure serve allure-results

```



📊 Reports

TestNG HTML Report → reports/test-output/emailable-report.html

Allure Report → Open reports/allure-report/index.html
