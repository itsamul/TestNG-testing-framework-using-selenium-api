# TestNG-testing-framework-using-selenium-api
TestNG is a testing framework commonly used in conjunction with Selenium for automating and organizing test cases in Java. 

## 📔 Project Description:
This project is a web automation framework designed to perform end-to-end testing of a web application using the TestNG testing framework, Selenium WebDriver for browser automation, and Maven for project management and build automation.

## 📔 Key Components:

### TestNG:
**Purpose:** TestNG is utilized for structuring and executing test cases. It provides annotations for defining test methods, supports parameterization, and facilitates the grouping of tests.

### Selenium WebDriver:
**Purpose:** Selenium WebDriver is employed for automating interactions with the web application. It allows the scripting of browser actions such as clicking buttons, entering data, and validating page content.

### Maven:
**Purpose:** Maven is used for project management and build automation. It simplifies the project setup, manages dependencies, and enables the execution of tests. Maven ensures a consistent and reproducible build process.


## 📔 TestNG Feature covered in this project:

- [x] TestNG Annotations		
- [x] Assertions in TestNG		
  - [x] Hard Assert and Soft Assert
- [x] Passing Parameters in TestNG	
- [x] Prioritizing Selenium Test Cases using TestNG Feature
- [x] Grouping Tests in Selenium
- [x] DataProviders in TestNG
- [x] TestNG Listeners in Selenium
- [X] Reporting and logging in TestNG
- [x] Cross Browser Testing using Selenium and TestNG	
- [ ] Running Parallel Tests in Selenium with TestNG		


## 📄 Annotations for Selenium Tests:
- Annotations help define the order of execution and manage the test lifecycle. TestNG annotations such as @Test, @BeforeMethod and @AfterMethod are used to setup and tear down the Selenium test environment.
  </br> </br>
  Following annotation are used in the sample project:
  1. @Test – This marks a class or a method as a part of the test.
  2. @BeforeMethod – The @BeforeMethod method in TestNG will execute before each test method. 
  3. @AfterMethod – The @AfterMethod method in TestNG will run after each test method is executed.
  4. @Parameters – This annotation is used to pass parameters to test methods.
  5. @DataProvider – The @DataProvider annotation in TestNG is used to supply test methods with data, allowing the same test method to be executed multiple times with different sets of data. 
  </br>

  - **@BeforeMetod, @AfterMethod and @Paramters** annotations used in BaseClass. </br></br>
  **Code:** </br>
  ![d9lcOA7ZBu](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6864cbab-97cc-4b67-bb8c-fff3cbd64083)
  </br></br>
  - **@Test** annotation is used in the test classes.</br></br>
  **Code:** </br>
  ![w5OSLmtFCX](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/98b69134-7423-4971-8b82-ce33b4b92fea)
  </br></br>
  - **@DataProvider** annotation is used in DataProvidersDemo class.</br></br>
   **Code:** </br>
  ![6LsqCaRw4c](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/be6f608f-c144-4cb5-b41a-a00a2fb6744a)
  </br></br>

## 📄 Assertions in TestNG
Assertions in TestNG are used to verify that the expected result and the actual result matches or not in the test case. </br> </br>
Following assertion methods are used in project : </br>
1. **Assert.assertEquals(String actual, String expected)** : This method is to check whether the actual value is equal to the expected value. </br></br>
  **Code:** </br>
  ![Z5lGeU94tB](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/521cbaa0-8a67-4eb4-9f30-223974ee9247)
  </br></br>
  **TestNG Xml file:** </br>
  ![lpBJOMLsNJ](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/f5e88ca5-0574-4e66-b3d4-02ad775cee3a)
  </br></br>
  **Output :** </br>
    ![eclipse_fnOOkVgWCi](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/9c4d6b5c-8d55-4eb0-a59f-e3e44b29101a)
    </br></br>
  **Report :** </br>
  ![chrome_vOvtoaBej0](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6620eb77-256e-4c3e-865e-0cef6a0a65c6)
     </br></br>

2. **Assert.assertTrue(condition)** : This method checks that a condition is true or not. If not, it will fail the test and an AssertionError is thrown. </br></br>
  **Code:** </br>
  ![blae8krkpL](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/09f7269f-1d70-4771-b7a4-b71bbc101875)
    </br></br>
  **TestNG Xml file:** </br>
  ![UMznYb6fSi](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/0f436337-e8d5-4570-b673-ab4b8bd85e53)
  </br></br>
  **Output :** </br>
  ![eclipse_h7HEBNcfTk](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/d16dbde6-0cb0-4cec-bd6c-566fd24bafad)
    </br></br>
  **Report :** </br>
  ![chrome_up6YD5aQfo](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/027b10d2-729b-4023-8b18-c89d8ebe2ec8)
     </br></br>

## 📄 Hard Assert and Soft Assert:
- **Hard Assert** : A "hard assert" refers to an assertion in testing that, when it fails, immediately stops the execution of the test. </br></br>
  **Code:** </br>
  ![my1I7Kzy02](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/7925885f-a59b-4d44-bfd1-34b38060d2ae)
  </br></br>
  **TestNG Xml file:** </br>
  ![sULIYSzISU](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/b0692b77-7f33-4de5-8242-623ffc969fcb)
  </br></br>
  **Output:** </br>
  ![eclipse_OzxHv2LbM8](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/5db702c1-1dbd-40b2-87f2-44eb493c42cf)
  </br></br>
  **Report :** <br>
  ![chrome_PP7gMrFKP2](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/5f4e8d95-b770-4b88-a401-0560856d9440)
  </br></br>
  
- **Soft Assert** : A "soft assert" refers to a mechanism in testing that allows the execution of a test to continue even after encountering a failure. Unlike a "hard assert," which immediately stops the test upon failure, a soft assert continues executing subsequent steps. If the first assertEquals condition fails, the subsequent steps and the additional assertions will still be executed. The assertAll() method at the end; collects all the failures and reports them together after the test execution is complete. </br></br>
  **Code:** </br>
  ![jghyxes31d](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/d6f20c60-8fa4-4dac-8c25-83fe998c6527)
  </br></br>
  **TestNG Xml file:** </br>
  ![DhDc5cUrx8](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6d8bf7f3-9bd5-4c76-bd3f-0ec5f63f3a30)
  </br></br>
  **Output:** </br>
  ![eclipse_c8zqGCv7KL](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/5aaaff65-280e-419f-afcc-9e04b3d7d521)
  </br></br>
  **Report :** <br>
  ![chrome_UxFTaCMrzk](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/47709d69-37d0-4aad-abad-58ef789d6573)
  </br></br>

## 📄 Passing Parameters in TestNG		
The @Parameters annotation is used to pass parameters to a test method. This annotation allows to define parameters at the method level and pass values from the XML suite configuration file. </br>
</br>
  **Code:** </br>
  ![d9lcOA7ZBu](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6864cbab-97cc-4b67-bb8c-fff3cbd64083)
  </br></br>
  **TestNG Xml file:** </br>
  ![dAVLaoYcDt](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6df9996b-aa63-4997-a87c-d711831e310d)
  </br></br>
  **Output:** </br>
  ![eclipse_dLMfkphB67](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/10056eb5-8798-49bd-b425-dfd4dd991402)
  </br></br>
  **Report :** <br>
  ![chrome_NjfIXR3dNi](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/b6a608d0-107e-47ac-a29b-a13da02c17c0)
  </br></br>

## 📄 Prioritizing Selenium Test Cases using TestNG Feature	
The priority attribute is used to specify the execution order of test methods within a test class. By assigning priority values to test methods, you can control the sequence in which these methods are executed during a test run. </br>
</br>
  **Code:** </br>
  ![cjSJw6DaEB](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/9bdfa6a6-fdbd-4c80-9389-966ae1470884)
  </br></br>
  **Testng XML file:** </br>
  ![SmRpfIw6pB](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/f1e4ee4c-8af5-4c5d-a3c1-bad6b88943b2)
  </br></br>
   **Output:** </br>
  ![eclipse_ufDGHk0F3c](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/7ce895a8-cd9d-4e46-bc31-d2f6776bcab7)
  </br></br>
  **Report:** </br>
  ![chrome_eIkivS7gP6](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/ca1a96de-418c-4c06-8fc4-15b0052137fd)
  </br></br>

## 📄 Grouping Tests in Selenium	:
TestNG provides the ability to categorize tests into groups using the @Test(groups = "groupname") annotation. </br>
The tests in this project are grouped as "Smoke" and "Regression". E.g: **groups = {"Smoke", "Regression"}** </br></br>
  **Code:** </br>
  ![Uym9czB3uo](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/a792058f-0564-488a-8e43-edc58cbe57f8)
  </br></br>
	**Testng XML file:** Following xml will only run test grouped under **"Smoke"** </br>
  ![tIbKBnlamZ](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/230d2a37-723e-415a-8b54-370cf8c37c30)
  </br></br>
  **Report:** </br>
  ![chrome_Ct6KTlJtop](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/d67c6e30-dbf8-4cd9-9eb3-a2d74943fac0)
  </br></br>
  **Testng XML file:** Following xml will only run test grouped under **"Regression"** </br>
  ![YfV4yOvTk8](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/1dc60f6c-ee20-48fc-951d-c51bc4cc138a)
  </br></br>
  **Report:** </br>
  ![chrome_RsIH8h93fp](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/636368bd-d30f-4b14-b4bf-8b781d447ed8)
  </br></br>

## 📄 DataProviders in TestNG
The @DataProvider annotation is used to supply test methods with data. It allows to run the same test method with different sets of data, increasing the test coverage and flexibility. </br></br>
   **Code:** This is the dataprovider class which contains @DataProvider annotated method. </br>
  ![6LsqCaRw4c](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/be6f608f-c144-4cb5-b41a-a00a2fb6744a)
  </br></br>
  The following code, the @Test annotation uses attribute dataProvider with name to access the data along with DataProvider class name
  ![hDp1yk52bi](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/45e495c2-3a2c-408a-bf01-b247c7b75c8f)
  </br></br>
  **Testng XML file:** </br>
  ![CAedSSzxcO](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/22e41dc2-8ced-4096-a0a9-e052d5bac31c)
  </br></br>
   **Output:** </br>
  ![eclipse_BHwaMfVFqf](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/d48dad48-b2d5-426f-9348-51398ba22e05)
  </br></br>
  **Report:** </br>
  ![4rDRlInO5G](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/77060a1e-ca28-4c7b-8f17-fe40ea34c0f6)
  </br></br>

## 📄 TestNG Listeners in Selenium
Listeners are useful for tasks such as logging, reporting, and taking actions based on the status of the test cases. ITestListener used in the project is an interface that allows to implement custom listeners to log the status of execution of test cases and also capture screenshot in case of test failure. </br> </br>
  **Code:** </br>
  ![DJhzPyPSk0](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/6198629b-b291-4d4b-b342-cd654f5f1aab)
  </br>
  ![ObzElcgzNf](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/4f9c64d2-d767-4248-ac6a-af7003050e90)
  </br></br>
  **Testng XML file:** </br>
  ![9fzTf4K0gG](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/d5a3b607-5e4d-4166-96c3-0adc6e3275be)
  </br></br>
   **Output:** </br>
  ![eclipse_l9VWhHTcE2](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/ad28c46b-8adc-4f4d-a9cb-3a1687c5ef42)
  </br></br>
  **Report:** </br>
  ![FgssKyip4g](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/b44a5b9a-b494-454d-bf4d-05184d57c1c4)
  </br></br>
  **Screenshot:** </br> Following is the location the screenshot is getting captured.
  ![eclipse_YGIiMVrOWJ](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/9c2d5105-5eb4-4b32-84a4-25a123ec70ed)
  </br>
  Following is the screenshot captured.
  ![Screenshot_testToVerifyProductListPageIsDisplayedonClickingBackToProductsLink1700925625357](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/b84f9363-fb86-439b-82d1-53553d834f30)
  </br></br>

## 📄 Cross Browser Testing using Selenium and TestNG
TestNG makes it easy to implement cross-browser testing by allowing to parameterize tests and configure test methods to run on multiple browsers.
</br></br>
  **Testng XML file:** </br>
  ![OH497xoiMm](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/435bedc9-3e6b-4655-a33c-bde57110500b)
  </br></br>
  **Testng XML file:** </br>
  ![eclipse_DVjbMQAstn](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/ce5809bf-5f2a-4100-be6e-6cf8aa0c509f)
  </br></br>
   **Output:** </br>
  ![eclipse_l9VWhHTcE2](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/ad28c46b-8adc-4f4d-a9cb-3a1687c5ef42)
  </br></br>
  **Report:** </br>
  ![chrome_yMicYOv0ml](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/f3474142-4413-441a-a7b1-3bcb6c12e082)
  </br></br>

## 📄 Reporting and logging in TestNG
TestNG generates detailed HTML reports that provide information of the test executions. By default, TestNG generates an HTML report after each test run. The report named emailable-report.html is located in the project's output directory, the "test-output" folder. This report includes information such as the overall test results, test durations, and individual test method outcomes. </br></br>
  **Testng XML file:** </br>
  ![52Ih89RcpH](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/711d45e6-ae13-490a-9db8-31217daa0b78)
  </br></br>
  **Report:** </br>
  ![vDxiLlFlHo](https://github.com/itsamul/TestNG-testing-framework-using-selenium-api/assets/85364800/dfe6d92c-f803-419a-b72b-ba47d0e264de)


