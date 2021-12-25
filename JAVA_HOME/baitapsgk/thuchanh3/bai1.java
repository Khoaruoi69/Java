import java.util.*;

public class bai1{
	public static void main(String[] args){
		// DSHANG ds=new DSHANG();
		// ds.themDM();
		// ds.xuatDM();
		HANGDIENMAY dm=new HANGDIENMAY();
		System.out.println("Nhap hang dien may: ");
		dm.input();
		dm.output();
		HANGTHUCPHAM tp=new HANGTHUCPHAM();
		System.out.println("Nhap hang thuc pham: ");
		tp.input();
		tp.output();

// 		byte chon;
// 		Scanner doc=new Scanner(System.in);
// 		DSHANG dshh=new DSHANG();
// 		HANG h;
// 		do{
// 			System.out.println("1: Them mot mat hang vao danh sach");
// 			System.out.println("2: Xuat mat hang theo loai");
// 			System.out.println("0:EXITs");
// 			System.out.println("Chon chuc nang:  ");
// 			chon=doc.nextByte();
// 			switch(chon){
// 				case 1: 
// 						System.out.println("1: hang dien may, 2: hang thuc pham.Hay chon loai mat hang:");
// 						byte loai=doc.nextByte();
// 						if(loai==1){
// 							h=new HANGDIENMAY();

// 						}
// 						else{
// 							h=new HANGTHUCPHAM();
// 						}
// 						h.nhap();
// 						dshh.themMH();
// 						break;
// 				case 2: 
// 				        System.out.println("Xuat danh sach mat hang nao (DM/TP): ");
// 				        byte loaimh=doc.nextByte();
// 				        dshh.xuatDStheoLoai();
// 				        break;
// 				default: chon=0;break;
// 			}
// 		}while(chon!=0);
// 	}
 }
}
	class HANG{
		protected String mahang;
		protected String tenhang;
		protected float gia;
		public HANG(){
			mahang=null;
			tenhang=null;
			gia=0;
		}
		public String getMahang(){
			return mahang;
		}
		public void setMahang(String mahang){
			this.mahang=mahang;
		}
		public String getTenhang(){
			return tenhang;
		}
		public void setTenhang(String tenhang){
			this.tenhang=tenhang;
		}
		public Float getGia(){
			return gia;
		}
		public void setGia(){
			this.gia=gia;
		}
		public void input(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap ma san pham: ");
			mahang=sc.nextLine();
			System.out.println("Nhap ten san pham: ");
			tenhang=sc.nextLine();
			System.out.println("Nhap gia san pham: ");
			gia=sc.nextFloat(); 
		}
		public void output(){
			System.out.println("Ma san pham: "+mahang);
			System.out.println("Ten san pham: "+tenhang);
			System.out.println("Gia san pham: "+gia);
		}	
	}

	class HANGDIENMAY extends HANG{
		protected String tgbaohanh;
		protected float dienap;
		protected float congsuat;
		//
		public HANGDIENMAY(){
			tgbaohanh=null;
			dienap=0;
			congsuat=0;
		}
		public String getTgbaohanh(){
			return tgbaohanh;
		}
		public void setTgbaohanh(String tgbaohanh){
			this.tgbaohanh=tgbaohanh;
		}
		public Float getDienap(){
			return dienap;
		}
		public void setDienap(float dienap){
			this.dienap=dienap;
		}
		public Float getCongsuat(){
			return congsuat;
		}
		public void setCongsuat(float congsuat){
			this.congsuat=congsuat;
		}
		@Override
		public void input(){
			super.input();
			Scanner vc=new Scanner(System.in);
			System.out.println("Nhap thoi gian bao hanh: ");
			tgbaohanh=vc.nextLine();
			System.out.println("Nhap dien ap: ");
			dienap=vc.nextFloat();
			System.out.println("Nhap cong suat: ");
			congsuat=vc.nextFloat();

		}
		@Override
		public void output(){
			super.output();
			System.out.println("Thoi gian bao hanh la: "+tgbaohanh);
			System.out.println("Dien ap: "+dienap);
			System.out.println("Cong suat: "+congsuat);
		}		
	}
	class HANGTHUCPHAM extends HANG{
		protected String ngaysanxuat;
		protected String ngayhethang;

		public HANGTHUCPHAM(){
			ngaysanxuat=null;
			ngayhethang=null;
		}
		public String getNgaysanxuat(){
			return ngaysanxuat;
		}
		public void setNgaysanxuat(String ngaysanxuat){
			this.ngaysanxuat=ngaysanxuat;
		}
		public String getNgayhethang(){
			return ngayhethang;
		}
		public void setNgayhethang(){
			this.ngayhethang=ngayhethang;
		}
		@Override
		public void input(){
			super.input();
			Scanner cc=new Scanner(System.in);
			System.out.println("Nhap ngay san xuat: ");
			ngaysanxuat=cc.nextLine();
			System.out.println("Nhap ngay het hang: ");
			ngayhethang=cc.nextLine();
		}
		@Override
		public void output(){
			super.output();
			System.out.println("Ngay san xuat: "+ngaysanxuat);
			System.out.println("Ngay het hang su dung: "+ngayhethang);
		}
	}
	// class DSHANG{
	// 	// protected HANG ds[];
	// 	// protected int soluong;
	// 	// protected String dsmathang;

	// 	DSHANG HANGDIENMAY[];
	// 	DSHANG HANGTHUCPHAM[];

	// 	public void themDM(){
	// 		for(int i=1;i<HANGDIENMAY.length;i++){
	// 			HANGDIENMAY[i]=new DSHANG();
	// 			HANGDIENMAY[i].input();
	// 		}
	// 	}
	// 	public void xuatDM(){
	// 		System.out.println("hang diem may");
	// 		for(int i=1;i<HANGDIENMAY.length;i++){
	// 			HANGDIENMAY[i].output();
	// 		}
	// 	}
	// }
	


		// public void themMH(){
		// 	Scanner sc=new Scanner(System.in);
		// 	Sytem.output.println("Nhap so luong mat hang: ");
		// 	soluong=sc.nextInt();
		// 	ds=new HANG[soluong];
		// 	for(int i=1;i<soluong;i++){
		// 		System.output.println("Mat hang thu " +i);
		// 		ds[i]=HANG();
		// 		ds[i].input();
		// 	}
		// }

		// public void xuatDStheoLoai(){
		// 	byte loai;
		// 	Scanner doc=new Scanner(System.in);
		// 	loai=doc.nextByte();
		// 	if(loai==1){
		// 		System.output.println("__________");
		// 		for(int i=1;i<soluong;i++){
		// 			ds[i].output();
		// 		}

		// 	}
			
			
		

		// }
		// public void nhap(){
		// 	Scanner sc=new Scanner(System.in);
		// 	Sytem.output.println("Nhap so luong mat hang: ");
		// 	soluong=sc.nextInt();
		// 	ds=new HANG[soluong];
		// 	for(int i=1;i<soluong;i++){
		// 		System.output.println("Mat hang thu " +i);
		// 		ds[i]=HANG();
		// 		ds[i].input();
		// 	}
		// }
	//}