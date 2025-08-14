# Janitri Login Automation

This project automates the **Janitri Dashboard Login Page** test cases using:
- **Java**
- **Selenium WebDriver**
- **Page Object Model (POM)**
- **TestNG**
- **Maven**
- **WebDriverManager**

## 📂 Project Structure
```
JanitriLoginAutomation/
 ├── src/
 │    ├── main/java/
 │    │     ├── base/        # BaseTest class for setup/teardown
 │    │     └── pages/       # Page Object Model classes
 │    └── test/java/
 │          └── tests/       # TestNG test classes
 ├── pom.xml                 # Maven dependencies
 ├── testng.xml              # TestNG suite configuration
```

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/JanitriLoginAutomation.git
   ```
2. Open in **IntelliJ** or **Eclipse** as a **Maven Project**.
3. Install dependencies:
   ```bash
   mvn clean install
   ```
4. Run the tests:
   - From IDE: Right-click `testng.xml` → Run
   - From CLI:
     ```bash
     mvn test
     ```

## 🧪 Test Scenarios Automated
- **Blank Fields Login** → Verify login button state
- **Invalid Credentials** → Validate error message
- **Password Masking Toggle** → Check password visibility
- **UI Elements Presence** → Validate basic UI elements

## 📦 Dependencies
- Selenium Java 4.21.0
- TestNG 7.10.2
- WebDriverManager 5.9.2

## 📝 Notes
- Tests are written **without valid credentials** (negative testing focus).
- Locators are based on XPath and may need adjustments if UI changes.

---
👩‍💻 Developed for **QA Internship Assignment** - Janitri
