package Problems;
import java.util.*;
public class Guvi_126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		String sarr[]=str.split(" ");
		int c=0;
		for(int i=0;i<sarr.length;i++) {
			for(int k=1;k<sarr[i].length();k++) {
				for(int j=65;j<91;j++) {
					if(sarr[i].charAt(0)==j) {
						c++;
					}
			
					if(sarr[i].charAt(k)==j) {
						c++;
					}
				}
			}
		}
		if(c==sarr.length) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
