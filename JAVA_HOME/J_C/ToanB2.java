import java.util.Scanner;
public class ToanB2{
	public static void main(String[] args){
		int a[] = new int [10];
	//	int a[] = {1,4,5,7,8,9,2,3,10,6};
		Scanner sc = new Scanner (System.in);
	 for (int i = 0; i < 10; i++) {
	 	System.out.println("a["+i+"] = ");
	 	a[i] = sc.nextInt();
    }
	 for (int i = 0; i <  10; i++) {
        for (int j = i + 1; j <  10; j++) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    System.out.println("Mang da sap xep : ");
    for(int i = 0; i<10;i++){
    	System.out.printf("%d \n", a[i]);
    }
}
}