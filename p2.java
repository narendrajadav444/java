import java.util.*;
class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3: ");
		int num3 = sc.nextInt();
		 if(num1 > num2 && num1 > num3){
			 System.out.println("Number 1 is big");
		 }
		 else{
			 if(num2 > num1 && num2 > num3){
				 System.out.println("Number 2 is big");
			 }
			 else{
				 System.out.println("Number 3 is big");
			 }
		 }
	}
}