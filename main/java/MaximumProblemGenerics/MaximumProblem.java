package MaximumProblemGenerics;

public class MaximumProblem <E extends Comparable<E>>{
	E x,y,z;
	
	public MaximumProblem(E x,E y,E z){
		this.x = x;
		this.y = y;
		this.z =z;
		
	}
	
	public E findMaximum(){
		return MaximumProblem.findMaximum(x, y, z);
	}
	
	public static <E extends Comparable<E>> E findMaximum(E a,E b,E c) {
		E max = a;
		if(b.compareTo(max) >0)
			max =b;
		if(c.compareTo(max) >0)
			max = c;
		
		return max;
		
	}


}
