/*
Nguyen Dang Anh Khoa. 19DTHD4
mssv: 1911066166
Bài 3: (ArrayIndexOutOfBoundsException) Viết chương trình theo yêu cầu sau:
 Tạo một mảng với 100 số nguyên ngẫu nhiên
 Yêu cầu người dùng nhập vào chỉ số phần tử muốn xuất giá trị, nếu chỉ số nhập vào
vượt giới hạn số lượng phần tử mảng, hiển thị thông báo.
 */
package bai3;
import java.util.*;
/**
 *
 * @author Khoa
 */
public class bai3 {
    public static void main (String[] args){
        Mang m =new Mang();
        m.input();
        m.output();
        m.lay();
}
}
class Mang{
    int n;
    int a[] ;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
         n= sc.nextInt();
         a = new int[n];
        Random rand = new Random();
        for(int i=0; i<n; i++){
        a[i]=rand.nextInt(100);
        }
    }
    public void output(){
        System.out.println(" Xuat mang:");
        for(int i=0; i<n; i++){
        System.out.print("\t"+a[i]);
        }
        }
    public void lay(){
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.println("\nNhap chi so phan tu muon xuat gia tri: ");
        k = sc.nextInt();
        for(int i=0;i<n;i++){
            try{
            if(a[i]==a[k]){
                System.out.println("chi so phan tu "+k+" co gia tri " +a[k]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.exit(0);
        }
        }
    }
    }
  
    
