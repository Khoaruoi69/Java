import java.io.*;
import java.util.*;
public class soChu {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Nhap a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Mang sau khi chuyen doi:");
		for(int i = 0; i < n; i++){
			System.out.println("a["+i+"] = " + a[i] + " = " + (char)a[i]); // ep kieu int sang char
		}
    }
}