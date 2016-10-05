	package test;

public abstract class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,5,7,9,11};
		int[] b = {2,4,6};
		int[] result = merge(a,b);
		for(int i = 0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	public static int[] merge(int[] a,int[] b){
		int[] result = new int[a.length+b.length];
		int i = 0;//遍历a
		int j = 0;//遍历b
		int k = 0;//result
		while(i<a.length&&j<b.length){
			if(a[i]<b[j]){
				result[k++] = a[i++];
			}else{
				result[k++] = b[j++];
			}
		}//a或b已经遍历完
		while(i<a.length){
			result[k++] = a[i++];
		}
		while(j<b.length){
			result[k++] = b[j++];
		}
		return result;
	}

}
