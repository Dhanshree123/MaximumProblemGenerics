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

}
