package demo.testng.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.TestStoreLoginPage;
import demo.testng.BasePage;


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
