package guvi;

import java.util.ArrayList;

public class Guvi_4 {
public static void main(String[] args) {
int num[]= {8,7,6,8,4,7,8,7};
ArrayList<Integer> ss=new ArrayList<Integer>();
for(int i=0;i<num.length;i++) {
for(int j=0;j<num.length;j++) {
			if(num[i]==j){
			ss.add(j);
			}i++;				   		 	
		}	
	}
System.out.println(ss);	
			}
	}
