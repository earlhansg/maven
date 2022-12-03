# TestNG Tutorial with MAVEN

## The Problem We Still Face

- our code flexibility has improved but we are still have repetitive code in our Java Classes
- for example, we still have code that initialises the driver in every Java Class
- this goes against the DRY (Dont Repeat Yourself) principle
- we need to think of a way to place our "common" code into a separate location so that our Classes can access it when needed
- this will make our code more maintainable since any changes made to the "common code" will be inherited by our Classes

### config.properties
``` python
	url=http://teststore.automationtesting.co.uk/
	browser=edge
```
### BasePage.java
``` python
	public WebDriver getDriver()
	public String getUrl()
```

### FirstTest.java extending to BasePage.java
``` python
	driver = getDriver();
	driver.get(getUrl());
```
