import HS.HOCSINH;
import java.util.*;
import java.io.*;

public class bai1th{
	public static void main(String[] args){
		    
			DANHSACH ds=new DANHSACH();
			ds.nhap();
			ds.sapxep();
			ds.xuat();



	}
}
	class DANHSACH{
		private HOCSINH ds[]; // danh sach hoc sinh 
		private int n; // so hoc sinh
		// cac phuong  thuc khac
		public void nhap(){
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap so luong hoc sinh: ");
			n=sc.nextInt();
			ds=new HOCSINH[n];
			int i;
			for(i=0;i<n;i++){
				System.out.println("Sinh vien thu"+i);
				ds[i]=new HOCSINH();
				ds[i].intput();
			}
		}
		public void xuat(){
			System.out.println("Thong tin sinh vien : ");
			for(int i=0;i<n;i++){
				ds[i].output();
			}
		}
		public void sapxep(){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(ds[i].getDtb()>ds[j].getDtb()){
						HOCSINH temp = new HOCSINH();
						temp = ds[i];
						ds[i]=ds[j];
						ds[j]=temp;

					}
				}
			}
		}

	}
