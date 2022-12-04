# TestNG Tutorial with MAVEN

## Steps Ahead

- we are going to create a Test class that is to test the functionality of logging into http://teststore.automationtesting.co.uk/
- we will create a new package named "Testcases"
- we will then create a new Java class named "StoreLoginTest" within the Testcases package
- the StoreLoginTest class will then use the objects from PageObjects > TestStoreLoginPage to help construct the login test

## Accessing the Object Class Method
- in the demonstration notice how i gain access and use the Object methods
- i do this by creating an Object of the "TestStoreLoginPage" class within the StoreLoginTest class
- i then use this object to call methods like getEmail() or getPassword() to retrieve the locators values for the elements of interest
- i then perform actions against them e.g passing data using .sendKeys() or perform a click using .click()

## What we did ?
``` python
  public class StoreLoginTest extends BasePage {
    public StoreLoginTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
	  public void login() throws IOException {
		  driver = getDriver();
		  driver.get(getUrl());

		  driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");

		  TestStoreLoginPage logPage = new TestStoreLoginPage(driver);
		  logPage.getEmail().sendKeys("test@test.com");
		  logPage.getPassword().sendKeys("test123");
		  logPage.getLoginBtn().click();
	}
}
```
