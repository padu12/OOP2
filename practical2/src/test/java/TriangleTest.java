import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

	@Test
	public void newTriangleShouldHaveZeroA() {
		Triangle triangle = new Triangle();
		
		Assert.assertEquals(0, triangle.getA(), 1e-9);
	}
	
	@Test
	public void newTriangleShouldHaveZeroB() {
		Triangle triangle = new Triangle();
		
		Assert.assertEquals(1, triangle.getB(), 1e-9);
	}
}
