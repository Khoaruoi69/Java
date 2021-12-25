import java.util.Scanner;
public class lonnhat{
	public static void main(String[] args){
		int S=0;
		int n;
		System.out.println("nhap so phan tu: ");
		Scanner nt = new Scanner(System.in);
	    n= nt.nextInt();
		int a[] = new int [n];
		Scanner ac = new Scanner(System.in);
		//nhap mang
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]= ");
			a[i]= ac.nextInt();
		}
		// xuat mang
		for(int i=0;i<n;i++){
			System.out.println(a[i] + "\n");
			if(S<a[i]){
				S=a[i];
			}
		}
		System.out.println("phan tu lon nhat la: " + S);
	}
}