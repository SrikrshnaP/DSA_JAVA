import java.util.Scanner;

public class binary {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int a = sc.nextInt();
		binary(a);
	}

	private static void binary(int a) {
		// TODO Auto-generated method stub
		int count = 1;
		while(a>1) 
		{
			count += 1;
			a=a/2;
		}
		System.out.println("The Number of Digits are - " + count);
	}
}
