import java.util.Arrays;
public class Runner {
	
	public static void main(String[] args){
		
		int[] src = {1,2,3};
		int[] dst = {4,5,6};
		int[] dst_larger = {4,5,6,7,8};
		int[] dst_smaller = {4,5};
		
		System.out.println("The source array is:");
		System.out.println(Arrays.toString(src));
		
		System.out.println("=== When the dst array has the same size ===");
		ArrayCopier ac = new ArrayCopier();
		System.out.println(Arrays.toString(dst));
		dst = ac.copyArrays(src,dst);
		System.out.println(Arrays.toString(dst));
		
		System.out.println("=== When the dst array is larger ===");
		System.out.println(Arrays.toString(dst_larger));
		dst_larger = ac.copyArrays(src,dst_larger);
		System.out.println(Arrays.toString(dst_larger));
		
		System.out.println("=== When the dst array is smaller ===");
		System.out.println(Arrays.toString(dst_smaller));
		dst_smaller = ac.copyArrays(src,dst_smaller);
		System.out.println(Arrays.toString(dst_smaller));
		
		
		
		
		
		
		
		/*
		#
		# Exe1
		#
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1,2));
		System.out.println(calculator.sub(1,2));
		System.out.println(calculator.mul(1,2));
		System.out.println(calculator.div(1,2));
		*/
	}

}

