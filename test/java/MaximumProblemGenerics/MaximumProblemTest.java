package MaximumProblemGenerics;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximumProblemTest {
	

	//Test case 1.1
	@Test
	public void test_TC1_1() {
		MaximumProblem obj = new MaximumProblem(99,90,88);
		assertEquals((Integer)99, obj.findMaximum());
	}
	
	//Test case 1.2
	@Test
	public void test_TC1_2() {
		MaximumProblem obj = new MaximumProblem(19, 90, 28);
		assertEquals((Integer)90, obj.findMaximum());
	}
	
	//Test case 1.3
	@Test
	public void test_TC1_3() {
		MaximumProblem obj = new MaximumProblem(19, 28, 88);
		assertEquals((Integer)88, obj.findMaximum());
	}
	
	//Test case 2.1
		@Test
		public void test_TC2_1() {
			MaximumProblem obj = new MaximumProblem(99.0F, 90.0F, 88.0F);
			assertEquals((Float)99.0F, obj.findMaximum());
		}
		
		//Test case 2.2
		@Test
		public void test_TC2_2() {
			MaximumProblem obj = new MaximumProblem(19.0F, 90.0F, 28.0F);
			assertEquals((Float)90.0F, obj.findMaximum());
		}
		
		//Test case 2.3
		@Test
		public void test_TC2_3() {
			MaximumProblem obj = new MaximumProblem(19.0F, 28.0F, 88.0F);
			assertEquals((Float)88.0F, obj.findMaximum());
		}
		
		//Test case 3.1
		@Test
		public void test_TC3_1() {
			MaximumProblem obj = new MaximumProblem("Peach","Apple" ,"Banana");
			assertEquals("Peach", obj.findMaximum());
		}
		
		//Test case 3.2
		@Test
		public void test_TC3_2() {
			MaximumProblem obj = new MaximumProblem("Apple","Peach" , "Banana");
			assertEquals("Peach", obj.findMaximum());
		}
		
		//Test case 3.3
		@Test
		public void test_TC3_3() {
			MaximumProblem obj = new MaximumProblem("Apple","Banana" ,"Peach");
			assertEquals("Peach", obj.findMaximum());
		}

}
