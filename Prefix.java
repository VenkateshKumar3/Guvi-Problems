package Problems;
import java.util.*;
public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String  S=s.nextLine();
		String P=s.nextLine();
		int count=0;
		ArrayList al=new ArrayList();
		for(int i=0;i<S.length()-P.length()+1;i++) {
			al.add(S.substring(i,i+P.length()));
		}
		if(al.contains(P)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
