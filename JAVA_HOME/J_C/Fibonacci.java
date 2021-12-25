public class Fibonacci{
	public static void main(String[] args){
		int n=100;
		int s;/// luu so thu ...
		int s1=1;
		int s2=1;
		for(int i=1;i<=n;i++){
			if(i==1||i==2){
				System.out.println("1\n");/// in 1 1
			}
			else{
				 s=s1+s2;
			     s1=s2;
			     s2=s;
			     	System.out.printf("%d\n",s);
				}
			}
		
		}
	}