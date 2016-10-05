package test;

public class SingleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,1,4,3};
		int result = 0;
		for(int i= 0;i<a.length;i++){
			result^=a[i];
		}
		int index = -1;
		if(result == 0){
			System.out.println("不存在只出现一次的数");
		}else{
			String binaryString = Integer.toBinaryString(result);
			System.out.println(binaryString);
		    index = binaryString.length()- binaryString.lastIndexOf("1")-1;
		}
		int result1 = 0;
		int result2 = 0;
		for(int i = 0;i<a.length;i++){
			if(((a[i]>>index)&1) == 0){
				result1^=a[i];
			}else{
				result2^=a[i];
			}
		}
		System.out.println(result1);
		System.out.println(result2);
	}

}
