# TestNG Tutorial with MAVEN

## What is the ITestListener Interface?

- its an interface we can use to trigger code when a particular event takes place
- for example, i may want my code to do something if it comes across a failure (e.g take a screenshot at the failed step)
- the interface has a number of available methods (I provide the methods on the next slide)
- We can then provide code for each, some or none of these methods depending on our requirements

## ITestListener Methods
- onTestSuccess
	- this method is called on any test that is successful
- onTestFailure
	- this method is called on any test that has failed
- onTestSkipped
	- this method is called on any test that is skipped

## Connecting a Test Class to use the ITestListener Class
- to set our test classes to use the ITestListener  class is easy 
- we write our test class the exact same way we usually do
- however, we need to add a line of code near the top to connect it:

``` python
	@Listeners(CustomITestListener.class)
```

## Summary
- to use the ITestListener interface, we must create a class that implements the ITestListener interface
- we then must add methods and add code to handle the events of the interest (e.g onTestFailure)
- we then need to connect our test classes to use the ITestListener class using the @Listeners annotation
- now if our test fails, it will trigger the code within the onTestFailure() method from within the ITestListener class
