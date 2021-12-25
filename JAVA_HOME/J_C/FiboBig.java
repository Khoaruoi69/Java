
import java.math.BigInteger;
public class FiboBig{
	public static void main(String[] args){
		int n=100;
//		BigInteger s =  BigInteger.valueOf(2305843009213693951L);
	//	BigInteger s;
		BigInteger s1= BigInteger.valueOf(1);// khoi tao gia tri co s1 
	    BigInteger s2= BigInteger.valueOf(2);// khoi tao gia tri cho s2
		for(int i=1;i<=n;i++){
			if(i==1||i==2){
				System.out.println("1\n");
			}
			else{
			    BigInteger s =  s1.add(s2);// phep tinh cong 
			     s1=s2;
			     s2=s;
			     	System.out.printf ("%d\n",s);
				}
			}
		
		}
	}
