package Zoho;
import java.util.*;

class Reverse{  
public static void main(String args[]){ 
Scanner s=new Scanner (System.in);
String str=s.nextLine();
ArrayList al =new ArrayList();
ArrayList<String> al1 =new ArrayList<String>();

for(int a=0;a<str.length()+1;a++) {
	for(int b=a+1;b<str.length()+1;b++) {
		String abc=str.substring(a, b);
		al.add(abc);

	}
}
//System.out.println(al);
for(int i=0;i<al.size();i++) {
	StringBuffer ss=new StringBuffer();
	ss.append(al.get(i));
	String ans=ss.reverse().toString();
	if(ans.equals(al.get(i))) {
		al1.add(ans);
	}
	
}
//System.out.println(al1);
String arr[]= new String[al1.size()];
for (int i=0;i<al1.size();i++) {
	arr[i]=al1.get(i);
}
for (int i=0;i<arr.length-1;i++) {
	if(arr[i].length()>arr[i+1].length()) 
	{
		String temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}

ArrayList li=new ArrayList();
int x=arr[arr.length-1].length();
for(int i=0;i<arr.length;i++) {
	if(x==arr[i].length()) {
		li.add(arr[i]);
	}
}
	System.out.println(li.get(0));

}
}
