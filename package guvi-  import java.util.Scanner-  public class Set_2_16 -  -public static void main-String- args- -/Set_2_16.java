package guvi;

import java.util.Scanner;

public class Set_2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
int a=s.nextInt();
int arr[]=new int[a];
int tot=0;
for(int i=0;i<a;i++) {
	arr[i]=s.nextInt();
}
for(int i=0;i<a;i++) {
	tot+=arr[i];
}
System.out.println(tot);
	}

}
