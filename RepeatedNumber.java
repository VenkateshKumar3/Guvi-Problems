package guvi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,3,2,3,4,4};
		ArrayList <Integer> sk=new ArrayList<Integer>();
		HashSet <Integer> vk=new HashSet<Integer>();
		for(int i=0;i<arr.length-1;i++) {
			int ch=arr[i];
			for(int j=1;j<arr.length-1;j++){
				if(ch==arr[j]) {
					sk.add(ch);
					
				}
			}
			
		}
		vk.addAll(sk);
		System.out.println(vk);
	}

}
