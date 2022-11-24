# TestNG Tutorial with MAVEN

## Annotations Part 1
### It Gives Us Control
- TestNG annotations provides us with an additional layer of control
- we can trigger code to run at a specific time
- this is useful if we need to do things before or after an event
- for example, we most likely will always want to close the browser after our tests have completed and so we have an annotation that will trigger the code at this specific in the process

### Requirements
```python
# import selenium chrome driver in the pom file
   <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-chrome-driver</artifactId>
      <version>4.6.0</version>
   </dependency>
```
### Process
```python
# initialized the driver
   @BeforeSuite
# running test
  @Test
# the close and quit
  @AfterSuite
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
