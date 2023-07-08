import java.util.ArrayList;
import java.util.Scanner;

public class ascending {
	public static void main(String[] args)
	{
		System.out.println("ASCENDING INSERTION SORT");
		ArrayList<Integer> arr= new ArrayList<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of values to be taken as input - ");
			int n = sc.nextInt();
			System.out.println(n);
			for(int i = 0; i<n; i++)
			{
				arr.add(sc.nextInt());
			}
		}
		System.out.println("Array before sorting - " + arr);
		System.out.println("Array after sorting - " + insertionSort(arr));
	}

	private static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		int key = 0;
		for(int j = 1; j<arr.size(); j++)
		{
			key = arr.get(j);
			int i = j -1;
			while(i>=0 && arr.get(i)>key)
			{
				arr.set(i+1, arr.get(i));
				i = i -1;
			}
			arr.set(i+1, key);
		}
		return arr;
	}
}
