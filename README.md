# TestNG Tutorial with MAVEN

## Annotations Part 2

### List of annotations used @BeforeSuite, @BeforeMethod, @Test, @AfterMethod and @AfterSuite

```python
# initialized driver
    @BeforeSuite
	  public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EarlHans Geñoso\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
	}
```
```python
# user has logged in
    @BeforeMethod
	  public void signin() throws InterruptedException {
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("user has logged in");
		Thread.sleep(2000);
	}
```
```python
# user has clicked the clothes link
  @Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("CLOTHES")).click();
		System.out.println("user has clicked the clothes link");
		Thread.sleep(2000);
	}
```
```python
# user has logged out
  @AfterMethod
	public void signout() throws InterruptedException {
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("user has logged out");
		Thread.sleep(2000);
	}
```
```python
# then close and quit
  @AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
```
