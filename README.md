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




