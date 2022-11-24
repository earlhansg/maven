package demo.testng;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
	public void Desktop_login() {
		System.out.println("Desktop login");
	}
	@Test
	public void Desktop_addItem() {
		System.out.println("Desktop Add Item");
	}
	@Test
	public void Tablet_login() {
		System.out.println("Tablet login");
	}
	@Test
	public void Tablet_addItem() {
		System.out.println("Tablet Add Item");
	}
	@Test
	public void Mobile_login() {
		System.out.println("Mobile login");
	}
	@Test
	public void Mobile_addItem() {
		System.out.println("Mobile Add Item");
	}
}
