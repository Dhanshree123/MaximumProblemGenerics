package MaximumProblemGenerics;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MaximumProblemTest {
	
	//Test case 1.1
	@Test
	public void test_TC1_1() {
		List<Integer> myList = new ArrayList<>();
        myList.add(99);
        myList.add(90);
        myList.add(88);
		MaximumProblem obj = new MaximumProblem(myList);
		assertEquals((Integer)99, obj.findMaximum());
	}
	
	//Test case 1.2
	@Test
	public void test_TC1_2() {
		List<Integer> myList = new ArrayList<>();
		myList.add(19);
        myList.add(90);
        myList.add(28);
		myList.add(777);
		MaximumProblem obj = new MaximumProblem(myList);
		assertEquals((Integer)777, obj.findMaximum());
	}
	
	//Test case 1.3
		@Test
		public void test_TC1_3() {
			List<Integer> myList = new ArrayList<>();
			MaximumProblem obj = new MaximumProblem(myList);
			assertEquals(null, obj.findMaximum());
		}
	
	//Test case 2.1
		@Test
		public void test_TC2_1() {
			List<Float> myList = new ArrayList<>();
			myList.add(99.0F);
			myList.add(90.0F);
			myList.add(28.0F);
			MaximumProblem obj = new MaximumProblem(myList);
			assertEquals((Float)99.0F, obj.findMaximum());
		}
		
		//Test case 3.1
		@Test
		public void test_TC3_1() {
			List<String> myList = new ArrayList<>();
			myList.add("Apple");
			myList.add("Peach");
			myList.add("Banana");
			MaximumProblem obj = new MaximumProblem(myList);
			assertEquals("Peach", obj.findMaximum());
		}
		

}
