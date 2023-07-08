import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class iterative {
	public static int binarySearch(ArrayList<Integer> list, int n)
	{
		Collections.sort(list);
		int lb=0, ub=list.size();
		while(lb<ub)
		{
			int mid = lb + ((ub-lb)/2);
			if(list.get(mid)==n)
			{
				return mid;
			}
			if(list.get(mid)>n)
			{
				ub = mid-1;
			}
			else if(list.get(mid)<n)
			{
				lb = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
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
		System.out.println("Value is at location - "+binarySearch(list, n));
	}
}
