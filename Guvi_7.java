package guvi;

import java.util.ArrayList;

public class Guvi_7 {
public static void main(String[] args) {
	
	int n[]= {5 ,1 ,2 ,2 ,3 ,3 ,4};
	int d=0;
	ArrayList<Integer>ss=new ArrayList<Integer>();
	for(int i=0;i<n.length-1;i++) {
	for(int j=1;j<n.length;j++) {
			if(n[i]==n[j]) {
		ss.add(n[j]);
	     	}//i++;
		}	
	}System.out.println(ss.get(0));
}
	
}
