package geekster;


public class Merg_arr {
	public static void main(String []args) {
		int a1[]= {4,5,6,7,8};
		int a2[]= {1,2,3,4};
		int a[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length+a2.length;i++) {
			if(i<a2.length) {
				a[i]=a2[i];
			}
			else {
				a[i]=a1[i-a2.length];
			}
			System.out.print(a[i]+" ");
		}
	}

}
