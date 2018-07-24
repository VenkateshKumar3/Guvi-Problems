package guvi;

import java.util.ArrayList;

public class CloestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {-1,2,3,1,0};
int b=0;
int c=0;
int count=0;
ArrayList<Integer> ss=new ArrayList<Integer>();
for(int i=0;i<a.length;i++) {
	b=a[i];
	for(int j=i+1;j<a.length-1;j++) {
		c=a[j];
		if(b+c==-1||b+c==0||b+c==1){
ss.add(c);
	
		}
	}
}System.out.println(ss);
	}

}
