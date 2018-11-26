package Problems;
import java.util.*;
public class Guvi_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String ans="";
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(c==1) {
				ans+=str.charAt(i);
			}
		}
	System.out.println(ans);
	}

}
