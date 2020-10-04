package MaximumProblemGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumProblem <E extends Comparable<E>>{
	List<E> EList = new ArrayList<>();
	
	public MaximumProblem(List<E> EList){
		for(E e : EList) {
			this.EList.add(e);
		}
		
	}
	
	public E findMaximum(){
		return MaximumProblem.findMaximum(EList);
	}
	
	public static <E extends Comparable<E>> E findMaximum(List<E> list) {
		int len = list.size();
		if(len== 0) {
			System.out.println("No object in the list");
			return null;
		}
		
	    Collections.sort(list);
		E maximum = list.get(list.size() -1);
		printMax(maximum);
		return maximum;
		
	}
	
	public static <E> void printMax(E max) {
		System.out.println("Maximum value is: "+max);
	}


}
