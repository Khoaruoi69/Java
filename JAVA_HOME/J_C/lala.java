/**
 * @(#)lala.java
 *
 *
 * @author 
 * @version 1.00 2021/3/6
 */


public class lala{
	public static void main(String[] args){
		int a[]=new int[10];
		int a[]= {1,3,6,5,2,8,9,4,7,10};
		int S=a[0];
		for(int i=1;i<=9;i++){
			if(S>a[i]){
				System.out.print(a[i]);
				S=a[i];
			}
		}
	}
}