# TestNG Tutorial with MAVEN

## What we did
-  create constructor in BasePage and initialized the Properties "prop"
``` python
  public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\demo\\testng\\config.properties");
		prop.load(data);
	}
```
- update System.getProperty of webdrivers and add "drivers" folder with the exe files
``` python
  if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
```
- since we already have contructor in BasePage we need to add this code to the FirstTest to avoid error
``` python
  public FirstTest() throws IOException {
		super();
		//TODO Auto-generated constructor stub
	}
```
