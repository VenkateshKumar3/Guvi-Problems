package Problems;
import java.util.*;
public class Guvi_128 {


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

		for(int i=0;i<arr.length;i++) {
		if(arr[i].length()>1) {
		System.out.println(arr[i]);	
		}}
		
		
		}
		
	}

