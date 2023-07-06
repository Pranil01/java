package mypratice;

public class PrimeNumberExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0;
		int n = 4;
		m = n/3;
		if(n==0||n==1) {
			System.out.print(n+" is not Prime Number");
		}else {
			for(i=2;i<=2;i++) {
				if (n%i==0) {
					System.out.println(n+" is not Prime Number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n+" is Prime Number");
			}
		}
		

	}

}
