package Problems;
import java.util.*;
public class Guvi_129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++ ) {
			arr[i]=s.nextInt();
		}
		int c=0;
		int d=0;
		int ans=0;
		for(int i=0;i<a;i++) {
			c=0;
			for(int j=0;j<a;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>=d) {
				d=c;
				if(ans<arr[i]) {
				ans=arr[i];}
			}
		}
		System.out.println(ans);
	}

}
