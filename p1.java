import java.util.Scanner;

class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage: ");
		float per = sc.nextFloat();
		
		if(per == 33){
			System.out.println("Pass");
		}
		else{
			if(per > 33 && per <= 50){
				System.out.println("D Grade");
			}
			else{
				if(per > 50 && per <= 65){
					System.out.println("C Grade");
				}
				else{
					if(per > 65 && per <= 80){
						System.out.println("B Grade");
					}
					else{
						if(per < 80 && per <= 90){
							System.out.println("A Grade");
						}
						else{
							if(per < 90 && per <= 100){
								System.out.println("A+ Grade");
							}
							else{
								System.out.println("Invalid");
							}
						}
					}
				}
			}
		}
	}
}