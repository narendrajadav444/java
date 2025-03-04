import java.util.Scanner;

class  primeNumber
{
	public static void main(String []args)
	{
		Scanner obj = new Scanner(System.in);
		int n, i, flag  = 0;
		System.out.println("Enter positive value: ");
		n = obj.nextInt();
		if(n == 0 || n == 1)
			flag =1;
		for(i = 2; i <= n/2; ++i)
		{
			if(n % i == 0)
			{
				flag = 1 ;
				break;
			}
		}
		if(flag == 0)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}
}