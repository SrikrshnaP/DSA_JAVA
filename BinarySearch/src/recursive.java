import java.util.ArrayList;
import java.util.Scanner;

public class recursive {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values to be taken as input - ");
		int x = sc.nextInt();
		System.out.println(x);
		for(int i = 0; i<x; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Enter the value to be searched");
		int n = sc.nextInt();
		System.out.println("Value is at location - "+binarySearch(0, list.size(), n));
	}

	private static int binarySearch(int lb, int ub, int n) {
		// TODO Auto-generated method stub
		if(lb==ub)
		{
			if(list.get(lb)==n)
				return lb;
			return -1;
		}
		else
		{
			int mid = lb + ((ub-lb)/2);
			if(list.get(mid)==n) return mid;
			else if(list.get(mid)>n) return binarySearch(lb, mid-1, n);
			else if(list.get(mid)<n) return binarySearch(ub+1, lb, n);
		};
		//return null;
		return -1;
	}
}
