package guvi;

import java.util.ArrayList;

public class Hello_World {

	public static void main(String[] args) {
		String hw="Hello World";
		String hw1[]=hw.split(" ");
		String f="";
	ArrayList<String> y=new ArrayList<String>();
	for(int i=0;i<hw1.length;i++) {
			StringBuilder ss=new StringBuilder(hw1[i]);
			f=ss.reverse().toString();
			y.add(f);
		}
	for(String h:y) {
	System.out.print(h+" ");
	}
	}

}
