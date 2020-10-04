package MaximumProblemGenerics;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximumProblemTest {
	
	MaximumProblem obj;
	
	@Before
	public void TestBefore(){
		obj = new MaximumProblem();
	}
	
	//Test case 1.1
	@Test
	public void test_TC1_1() {
		assertEquals((Integer)99, obj.findMaximum(99, 90, 88));
	}
	
	//Test case 1.2
	@Test
	public void test_TC1_2() {
		assertEquals((Integer)90, obj.findMaximum(19, 90, 28));
	}
	
	//Test case 1.3
	@Test
	public void test_TC1_3() {
		assertEquals((Integer)88, obj.findMaximum(19, 28, 88));
	}
	
	//Test case 2.1
		@Test
		public void test_TC2_1() {
			assertEquals((Float)99.0F, obj.findMaximum(99.0F, 90.0F, 88.0F));
		}
		
		//Test case 2.2
		@Test
		public void test_TC2_2() {
			assertEquals((Float)90.0F, obj.findMaximum(19.0F, 90.0F, 28.0F));
		}
		
		//Test case 2.3
		@Test
		public void test_TC2_3() {
			assertEquals((Float)88.0F, obj.findMaximum(19.0F, 28.0F, 88.0F));
		}

}
