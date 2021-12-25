import java.util.*;
import java.io.*;
public class phanso{
	public static void main(String[] args){
	   intput();

		tuMau ps2 = new tuMau(t,m);
		ps2.intput();
		ps2.output();
		ps2.rutGon();


		tuMau ps1 = new tuMau(t,m);
		ps1.intput();
		ps1.output();
		ps1.rutGon();

		ps.congHaiPs(ps1);

	}
}

	  class tuMau{
	 	private int tu;
	 	private int mau;
	 	public tuMau(){
	 		tu =0;
	 		mau =1;
	 	}
        public tuMau(int t,int m){
        	super();
        	this.tu=t;
        	this.mau=m;
        }
        public tuMau(tuMau ps){
        	this.tu=ps.tu;
        	this.tu=ps.mau;
        }

	 public int getTu(){
	 	return tu;
	 }
	 public void setTu(int t){
	 	this.tu=t;
	 }
	 public int getMau(){
	 	return mau;
	 }
	 public void setMau(int m){
	 	this.mau=m;
	 }
	public void intput(){
	    Scanner sc = new Scanner(System.in);
	 	System.out.println("Nhap tu: ");
	 	tu=sc.nextInt();
	 	System.out.println("Nhap mau: ");
	 	mau=sc.nextInt();
	 }
	 public void output(){
	 	System.out.println("Phan so la: "+tu+""+mau);
	 }
	 public int Ucln(int a,int b){
	 	while(a!=b){
	 		if(a-b>0){
	 		return a -b;
	 	}
	 	else{
	 		return b-a;
	 	}
	 } return a;
 
	 	}
	 	
	 	
	 public void rutGon(){
	 	int i = Ucln(tu,mau);
	 	int a= (int)tu/ i;
	 	int b=(int )mau/i;
	 	System.out.println(+a+"/"+b);
	 }
	 public tuMau congHaiPs(tuMau ps){
	 	tuMau tong = new tuMau();
	 	tong.ts = this.tu*ps.mau + ps.tu*this.mau;
	 	tong.ms =  this.mau*ps.mau;
		tong.rutGon();
	 	//System.out.println( +this.getTu()*ps.getMau() + ps.getTu()*this.getMau()+"/"+this.getMau()*ps.getMau());
	 }
}