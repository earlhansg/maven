# TestNG Tutorial with MAVEN

## What is TestNG Data Provider ?

- Data Provider allows us to send more than one set of data to our test cases
- for example, say we had 3 username and password combinations that we wanted to test with the login functionality of a website
- you might think we need to run the test invidual 3 times to test each combination
- luckily, TestNG provides functionality using the @DataProvider annotation to send more than one set of data at execution

## Using a Multi-Demensional Array

- we will be storing out "sets" of data in something called a multi-dimensional array
- this will be an array that stores Object pairs (e.g. an email and a password)

```python
  @DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		// data set 1
		data[0][0] = "test2@test.com";
		data[0][1] = "test12345";

		// data set 2
		data[1][0] = "test@test.com";
		data[1][1] = "test123";

		// data set 3
		data[2][0] = "doesntexist@test.com";
		data[2][1] = "xxxxxxx";

		return data;
	}
```
## How it works

- we need to use the "@DataProvider" annotation when writing code to set the multi-dimensional array in our test class
- we then assign data to particular columns/rows in the multi-dimensional array
- the testng.xml doesnt require any special tags 
- we simply run our tests and the tests will execute and until all data sets are exhausted

```python
  @Test(dataProvider = "getData")
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
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("user has logged out");
		Thread.sleep(2000);
	}
```
