import java.util.Scanner;
public class maTranTinhHang{
	public static void main(String[] args){
		int n,m;
		
		System.out.println("nhap so hang: ");
		Scanner it = new Scanner(System.in);
		n = it.nextInt();
		
		System.out.println("nhap so cot: ");
		Scanner jt = new Scanner(System.in);
		m= jt.nextInt();
		
		int a[][] = new int[n][m];
		Scanner at = new Scanner(System.in);
		/// nhap mang 
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.println("nhap a["+i+"]["+j+"]=");
				a[i][j]=at.nextInt();
			}
		}
		// xuat mang
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print (a[i][j]+"\t");
			}
			System.out.print ("\t\n");
		}
		int k;
		int T=0;
		System.out.println("nhap hang muon tinh : ");
		Scanner kt = new Scanner(System.in);
		k = kt.nextInt();
		
		for(int j=0;j<m;j++){
			T = T+ a[k][j];
		}
		System.out.println("Tong hang thu "+k+" la: "+T+" ");
	}
}