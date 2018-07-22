package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ExactlyOnce {

	public static void main(String[] args) {
int  a[]= {7,8,9,2,3,4,6,5,1,6,7,8,9};
Arrays.sort(a);
ArrayList <Integer> sk=new ArrayList<Integer>();

for(int i=0;i<a.length;i++) {
sk.add(a[i]);
						
	}
Collections.reverse(sk);
//System.out.println(sk);

HashSet<Integer> ss =new LinkedHashSet<Integer>(sk);


	
System.out.println(ss);
	}

}
