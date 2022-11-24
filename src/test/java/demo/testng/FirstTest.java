package demo.testng;

import org.testng.annotations.Test;

public class FirstTest {
    @Test (groups= {"smoke", "regression"})
	public void method1() {
		System.out.println("Hello World from method 1");
	}

	@Test (groups= {"smoke"})
	public void method2() {
		System.out.println("Hello World from method 2");
	}
}
