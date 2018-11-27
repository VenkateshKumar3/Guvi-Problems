package Problems;
import java.util.*;
public class Guvi_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		String str3="";
		int arr[]=new int[str1.length()];
		for(int i=0;i<str1.length();i++) {
			int a=0;
			a=(str1.charAt(i)-96)+(str2.charAt(i)-96);
			if(a<27) {
			arr[i]=a;}
			else {
				a=((str1.charAt(i)-96)+(str2.charAt(i)-96))-26;
				arr[i]=a;
			}
		}
		
		char[] crr=new char[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
		crr[i]=(char) (arr[i]+96);
		}
		for(int i=0;i<crr.length;i++) {
			str3+=crr[i];
		}
		System.out.println(str3);
	}

}
