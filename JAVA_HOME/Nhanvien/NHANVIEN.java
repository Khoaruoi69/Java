import java.io.*;
import java.util.*;

p class NHANVIEN{
	private int sl;
	private String maso;
	private String hoten;
	private float luong;
	private float hesoluong;
// constructor chuan
	public NHANVIEN(){
		super();
	}
	// costructor co tham so
	public NHANVIEN(int sl,String maso, String hotem,float luong,float hesoluong){
		sl=sl;
		maso=maso;
		hoten=hoten;
		luong=luong;
		hesoluong=hesoluong;
	}
	// sao chep
	public NHANVIEN(NHANVIEN n){
		this.sl=sl;
		this.maso=n.maso;
		this.hoten=n.hoten;
		this.luong=n.luong;
		this.hesoluong=n.hesoluong;
	}
/// set,get................
	public int getSl(){
		return sl;
	}
	public void setSl(int sl){
		this.sl=sl;
	}
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
	public float getLuong(){
		return luong;
	}
	public void setLuong(float luong){
		this.luong=luong;
	}
	public float getHesoluong(){
		return hesoluong;
	}
	public void setHesoluong(float hesoluong){
		this.hesoluong=hesoluong;
	}
    public void nhapsl(){
    	Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien: ");
		sl=sc.nextInt();
    }
	/// nhap thong tin nhan vien
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maso=sc.nextLine();
		System.out.println("nhap ho ten: ");
		hoten=sc.nextLine();
		System.out.println("nhap luong co ban: ");
		luong=sc.nextFloat();
		System.out.println("nhap he so luong: ");
		hesoluong=sc.nextFloat();
	}
	//// xuat thong tin 
	public void output(){
		System.out.println("ma so: "  +maso);
		System.out.println("ho ten: "  +hoten);
		System.out.println("luong chinh thuc: "+ luong*hesoluong);
	}
}