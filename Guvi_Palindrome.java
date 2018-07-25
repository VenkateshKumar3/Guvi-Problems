package guvi;

import java.util.Scanner;

public class Guvi_Palindrome {

	public static void main(String[] args) {
Scanner ss=new Scanner(System.in);
String str=ss.nextLine();
StringBuilder y=new StringBuilder(str);
String d=y.reverse().toString();
if(str.contentEquals(d)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not");
}
	
	}

}
