package guvi;

import java.util.ArrayList;

public class Addition_in_Arrays {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	ArrayList <Integer> ss=new ArrayList<Integer>();
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			for(int k=0;k<a.length;k++)
			{if(a[i]+a[j]==a[k]) {
				ss.add(a[k]);
			   }
			}
		}
	}
System.out.println(ss);
	}

}
