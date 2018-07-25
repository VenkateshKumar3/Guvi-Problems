package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		System.out.println("type");
		int  a[]= {1,2,3,4,5,6};
		Scanner s=new Scanner (System.in);
		int b=s.nextInt();
		Arrays.sort(a);
        int d=a[a.length-b];
		
		System.out.println(d);
	}

}
