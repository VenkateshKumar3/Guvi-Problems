package Problems;

import java.util.Arrays;
import java.util.*;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a=Integer.parseInt(s.nextLine());
		int arr[] =new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=Integer.parseInt(s.nextLine());
		}ArrayList al=new ArrayList();
		Arrays.sort(arr);
		int b=arr[arr.length/2];
		for(int j=arr.length-1;j>arr.length/2;j--) {
			for(int i=0;i<arr.length/2;i++) {
				al.add(arr[j]);
				al.add(arr[i]);
				j--;
			}
		}
		if(arr.length%2!=0) {
		al.add(b);}
		System.out.println(al);
	}

}
