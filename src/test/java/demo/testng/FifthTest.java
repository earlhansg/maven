package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FifthTest {
    @Test
	public void testng() {
		Assert.assertEquals("demo", "demo");
	}
}
