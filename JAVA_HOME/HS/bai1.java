package HS;
import java.util.*;
import java.io.*;



 class HOCSINH{
		public String maso;
		public String hoten;
		public float dtb;

		public String getMaso(){
			return maso;
		}
		public void setMaso(String maso){
			this.maso=maso;
		}
		public String getHoten(){
			return hoten;
		}
		public void setHoten(String hoten){
			this.hoten=hoten;
		}
		public float getDtb(){
			return dtb;
		}
		public void setDtb(float dtb){
			this.dtb=dtb;
		}

		public void intput(){
			Scanner sc =new Scanner(System.in);
			System.out.println("nhap ma so: ");
			maso =sc.nextLine();
			System.out.println("nhap ho ten: ");
			hoten=sc.nextLine();
			System.out.println("nhap diem: ");
			dtb=sc.nextFloat();
		}
		public void output(){
			System.out.println("ma so sinh vien: "+maso);
			System.out.println("ho va ten: "+hoten);
			System.out.println("diem trung binh: "+dtb);
		}
		public void rank(){
			if(dtb<5){
				System.out.println(" hoc sinh yeu");
			}
			if(dtb>5&&dtb<7){
				System.out.println("hoc sinh trung binh");
			}
			if(dtb>=7&&dtb<9){
				System.out.println("hoc sinh kha");
			}
			if(dtb>=9){
				System.out.println("hoc sinh gioi");
			}
		}
		public void soSanh(HOCSINH hs){
			if(hs.dtb > getDtb()){
				System.out.println("hoc sinh diem cao hon la: "+hs.hoten);
			}
			else{
				System.out.println("hoc sinh diem cao hon la: "+getHoten());
			}
		}



	}
