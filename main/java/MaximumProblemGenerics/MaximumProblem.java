package MaximumProblemGenerics;

public class MaximumProblem {
	public Integer findMaximum(Integer a,Integer b,Integer c) {
		Integer max = a;
		if(b>max)
			max =b;
		if(c>max)
			max = c;
		
		return max;
	}

}
