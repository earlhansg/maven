# TestNG Tutorial with MAVEN

## Parameters

- TestNG Parameters are the arguments that we pass to our test methods
- there are two ways we can pass parameter values and this is by using:
	- Parameters; Or,
	- DataProviders
- this lecture focuses on Parameters
- TestNG Parameters are used to pass daa into our tests at execution
- for exmaple, we can send a URL address, or a email address or username

```python
import foobar

# in test java (FirstTest)
@Parameters({ "email", "password" })
	@Test
	public void signin(String email, String password) throws InterruptedException {
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("user has logged in");
		Thread.sleep(2000);
}
# in testng.xml
  <test name="TestOne">
    <parameter name="email" value="test@test.com"/>
    <parameter name="password" value="test123"/>
    <classes>
      <class name="demo.testng.FirstTest"/>
    </classes>
  </test>
```
