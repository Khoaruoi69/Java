package Demok;
import java.io.*;
import java.util.Scanner;

public class HOCSINH{
	private String maso;
	private String hoten;
	private float dtb;
	// get ma so
	public String getMaso(){
		return maso;
	}
	// set ma so 
	public void setMaso(String ms){
		maso = ms;
	}
	// get hoten
	public String getHoten(){
		return hoten;
	}
	// set ho ten
	public void setHoten(String ht){
		hoten = ht;
	}
	//get dtb
	public Float getDtb(){
		return dtb;
	}
	// set dbt
	public void setDtb(Float ds){
		dtb = ds;
	}
	Scanner sc = new Scanner(System.in);
	// nhap thong tin mot hoc sinh
	public void input(){
		System.out.println("Nhap ho ten hoc sinh: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ma so sinh vien: ");
		maso = sc.nextLine();
		System.out.println("Nhap diem : ");
                dtb = sc.nextInt();
	}
	//// xuat thong tin 
	public void output(){
		System.out.println(" Ten hoc sinh : "+hoten);
		System.out.println("Ma so sinh vien: "+maso);
		System.out.println("Diem trung binh: "+dtb);
	}
	// xep hang hoc sinh theo diem trung binh
	public void rank(){
		if(dtb<5){
			System.out.println("Xep loai yeu");
		}
		else if(dtb>= 5&& dtb<=7){
			System.out.println("Xep loai trung binh");
		}
			else{
				System.out.printf("Xep loai gioi");
			}
	}
	
}


