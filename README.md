# TestNG Tutorial with MAVEN

## What is it ?

- the DependsOnMethods is a TestNG attribute that we can use to trigger a method only after another method has passed
- we set the method to depend on another
- this method will then only execute once the former has executed successfully
- this can be useful for when we might have a scenario where we might need to wait for something to happen before proceeding to the next step

```python
  @Test
	public void enterEmail() throws InterruptedException {
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
		Thread.sleep(3000);
	}

	@Test
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = { "enterPassword" })
	public void clickBtn() throws InterruptedException {
		driver.findElement(By.cssSelector("button#submit-login")).click();
	}
```
