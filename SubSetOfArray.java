package guvi;

public class SubSetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,1,2,3,4,5};
int b[]= {0,1,2,4,5,};

int c[]= {9,8,7};
int count=0;
for (int i=0;i<a.length;i++)
{
for(int j=0;j<c.length;j++) {
	if(a[i]==c[j]) {
		count++;
	}
}
}
if(c.length==count) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
}

}
