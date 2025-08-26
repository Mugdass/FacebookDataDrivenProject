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

## ▶️ Run
```bash
mvn clean test
# Or run only Cucumber:
mvn -Dcucumber.filter.tags=@smoke test
```
