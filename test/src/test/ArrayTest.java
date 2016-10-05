package test;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		Object[] b = {"apple","banana"};
		List<Object> fruits = Arrays.asList(b);
		System.out.println(fruits.toString());
		List nums = Arrays.asList(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		//System.out.println(nums.toString());
		//Arrays.
	}

}
