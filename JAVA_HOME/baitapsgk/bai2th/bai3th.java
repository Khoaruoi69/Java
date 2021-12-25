import java.io.*;
import java.util.*;
public class bai3th{
	public static void main(String[] args){
		COODINATE td = new COODINATE();
		td.nhapToaDo();
		td.diemDoiXung();
		td.inToaDo();


	}
}
class COODINATE{
	private int  x,y;
	//khoi tao chuan
	public COODINATE(){
		x=0;
		y=0;
	}
	// khoi tao 2 tham so
	public COODINATE(int x, int y){
		x=x;
		y=y;
	}
	// khoi tao phan so tu 1 phan so da cho
	// con goi la khoi tap sap chep
	public COODINATE(COODINATE c){
		this.x=c.x;
		this.y=c.y;
	}
	public void nhapToaDo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do x: ");
		x=sc.nextInt();
		System.out.println("Nhap tung do y: ");
		y=sc.nextInt();
		
	}
	public void diemDoiXung(){
		int x1;
		x1=0-this.x;
		System.out.println("Diem doi xung qua truc hoanh la: "  +x1);
	}
	public void inToaDo(){
		System.out.println("Toa do diem A("+x+","+y+") ");
	}
}