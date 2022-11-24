# TestNG Tutorial with MAVEN

## Executing Methods By Common Name
- if we wanted to run just the "Tablet" related methods, then we can do that by simply amending our testng.xml
- we can use the <include> tags to run methods that have a particular value in the name
```python
# just the "Tablet" related methods
   <test name="TestOne">
    <classes>
     <class name="demo.testng.FirstTest">
       <methods>
         <include name="Tablet.*" />
       </methods>
     </class>
   </classes>
  </test>
```
- when we run this code, only the methods that have "Tablet" in the name will execute
- the * acts as a wild car character, meaning anything following the Tablet wording will run
- this is useful because it gives us flexibility in being selective in the tests we choose to run
```python
# just the "Tablet" related methods Tablet_login() & Tablet_addItem()
   <include name="Tablet.*" />
```
## Summary of TestNG Annotations
- @BeforeSuite: The annotated method will be run before all tests in this suite have run.
- @AfterSuite: The annotated method will be run after all tests in this suite have run.
- @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the tag is run.
- @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the tag have run.
- @BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
- @AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
- @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
- @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
- @BeforeMethod: The annotated method will be run before each test method.
- @AfterMethod: The annotated method will be run after each test method.
- @Test: The annotated method is a part of a test case
