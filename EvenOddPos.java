package guvi;

import java.util.ArrayList;

public class EvenOddPos {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};

		ArrayList<Integer> ss =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			
			if(i%2==0) 
			{
				if(a[i]%2!=0) {
				ss.add(a[i]);}
            }
		   if(i%2!=0) 
			{
				if(a[i]%2==0) {
				ss.add(a[i]);}
			}
							}
		System.out.println(ss);

	}

}
