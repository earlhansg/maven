# TestNG Tutorial with MAVEN

## What is the Enabled attribute ?

- its an attribute that can be used to prevent a method from executing
- the method itself will "skip" when enabled is set to false
- there is more than one way to skip a test, for example we can exclude it from the testng.xml
- this option however provides covenience when we want to a skip a method to review the outcome quickly

```python
  @Test(enabled = false)
	  public void enterEmail() throws InterruptedException {
		  driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
		  Thread.sleep(3000);
	  }
```
