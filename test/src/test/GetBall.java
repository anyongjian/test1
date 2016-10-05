package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GetBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string  = sc.nextLine();
		string = string +" ";
		List<StringBuffer> list = new LinkedList<StringBuffer>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<string.length();i++){
			if((string.charAt(i)>='A'&&string.charAt(i)<='Z')||(string.charAt(i)>='a'&&string.charAt(i)<='z')){
				sb.append(string.charAt(i));
			}else{
				if(string.charAt(i) == ' '){
					list.add(sb);
					sb = new StringBuffer();
				}else{
					list.add(sb);
					sb = new StringBuffer();
					sb.append(string.charAt(i));
					list.add(sb);
					sb = new StringBuffer();
				}
				
			}
		}
		for(int i = 0;i<list.size();i++){
			if(i<list.size()-1){
				if(list.get(i).toString().length() == 1 &&!(string.charAt(i)>='A'&&string.charAt(i)<='Z')||(string.charAt(i)>='a'&&string.charAt(i)<='z'))
				System.out.print(list.get(i).reverse().toString()+" ");
			}else{
				System.out.print(list.get(i).reverse().toString());
			}
		}
	}

}
