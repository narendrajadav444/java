import java.util.Scanner;//import the scanner class

class valUser
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);//create a Scanner Object
		System.out.println("Enter Username: ");
		
		String userName = scan.nextLine();//Read user input
		System.out.println("User Name is: " + userName);
	}
}
