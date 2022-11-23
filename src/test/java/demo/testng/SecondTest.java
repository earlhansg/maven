package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
	public void testng() {
		Assert.assertEquals("demo", "demo");
	}
}
