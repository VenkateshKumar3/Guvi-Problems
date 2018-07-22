package guvi;

import java.util.ArrayList;

public class Guvi_5 {
public static void main(String[] args) {
	int nums[]= {1,2,3,4,5,1,2,3};
    ArrayList<Integer> ss =new ArrayList<Integer>();
    int count=0;
    int n=0;
    for(int i=0;i<nums.length;i++) {
		count=0;
		n=nums[i];
			for(int j=0;j<nums.length;j++) {
				if(n==nums[j]) {
					count++;
				}
			}
	if(count==1) {
		ss.add(n);
	}
    }
System.out.println(ss);
	}

}
