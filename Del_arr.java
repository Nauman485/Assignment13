package geekster;

public class Del_arr {
	public static void main (String []args) {
		int a[]= {1,2,4,5,7};
		int k=5;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				continue;
			}
			System.out.print(a[i]+" ");	
		}
	}

}
