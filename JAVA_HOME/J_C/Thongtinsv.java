
import java.util.Scanner;
public class Thongtinsv {
    public static void main(String[] args) {
    	
		Scanner sv = new Scanner(System.in);
		String hoTen;
		System.out.print("Nhap ho ten: "); 
		hoTen = sv.nextLine();
		String massv;
		System.out.print("Nhap ma so: ");
		massv = sv.nextLine();
		float DTB;
		System.out.print("Nhap diem trung binh: ");
		DTB = sv.nextFloat();
		
		//xuat
		System.out.println("\nHo ten: " + hoTen);
		System.out.println("Ma so sinh vien : " + massv);
		System.out.println("Diem trung binh: " + DTB);
    }
}