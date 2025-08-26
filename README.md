# Facebook Data-Driven Test Automation Framework

**Java + Selenium + Cucumber (BDD) + TestNG + Apache POI (Excel)**
using the **Page Object Model (POM)**. Includes a sample Cucumber feature,
Excel-driven data, and a GitHub Actions CI workflow.

## 📂 Structure
```
FacebookDataDrivenProject/
├─ pom.xml
├─ README.md
├─ .gitignore
├─ .github/workflows/maven.yml
├─ data/                # Excel data (users.xlsx)
├─ Features/            # Cucumber feature files
├─ src/
│  ├─ main/java/fb/
│  │  ├─ model/
│  │  ├─ page/
│  │  └─ lib/
│  └─ test/java/fb/
│     ├─ stepdefinitions/
│     ├─ BaseTest.java
│     ├─ HomePageTest.java
│     ├─ CreateNewAccountPageTest.java
│     └─ RunCucumberTest.java
└─ driver/              # (optional) local drivers
```



📂 reports/ (local only)

  When you run mvn test, Maven + TestNG + Cucumber generate results here:

reports/
│── test-output/              (TestNG default HTML reports)
│   ├── index.html
│   ├── emailable-report.html
│   └── other files...
│
│── allure-results/           (raw Allure report files in JSON/XML)
│   ├── *.xml
│   ├── *.json
│   └── categories.json
│
└── allure-report/            (generated HTML report after running `allure serve` or `allure generate`)
    ├── index.html
    └── static/


## ▶️ Run
```bash
mvn clean test
# Or run only Cucumber:
mvn -Dcucumber.filter.tags=@smoke test
```
