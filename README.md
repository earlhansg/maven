# TestNG Tutorial with MAVEN

## What is the Page Object Model ?

- Page Object Model is a design pattern to create Object Repository for web UI elements
- under this model we are to separate our tests into two parts
- for example, if we were testing the "homepage" of a website, we would split our code into two classes
	- 1 a Test Class which contains instructions like to click a button on a homepage
	- 2 a corresponding Object Class which stores the locator and method to access the locators

## Why do this ?
- say we had a number of tests that uses the homgepage, e.g. - 
	- a "login test" might access the sign in page by clicking the sign in button on the homepage
	- another "add product to basket test" might click on a product from the homepage
- what happens if a developer changes the layout of the homepage and the locator values change?
- in the old model, we would have to go through each Test Class and update the locators individually
- under the Page Object model, we only have to update the locators in the HomepageObjects class
- all test then observe and inherit the new locator values

## Additional Advantages
- our Test classes are simplified as the will contain less code
- this makes our code easier to read
- our code also becomes easire to maintain
- the same objects (e.g those created in the HomepageObject.java in this example) can be used by multiple test cases, meaning less repetitiveness

## What we did ?
- created TestStoreLoginPage
``` python
	public class TestStoreLoginPage
```
