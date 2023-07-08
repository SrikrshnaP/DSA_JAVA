//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class bubbleSort {
	public static void sortFunc(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j+1]<arr[j])
				{
					//Collections.swap(arr, j+1, j); - Cant be used because it is an array
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//return arr;
	}
	public static void main(String[] args)
	{
		System.out.println("ASCENDING BUBLLE SORT");
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of values to be taken as input - ");
			int n = sc.nextInt();
			int[] arr= new int[n];
			System.out.println(n);
			for(int i = 0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
		System.out.println("Array before sorting - " + Arrays.toString(arr));
		sortFunc(arr);
		System.out.println("Array after sorting - " + Arrays.toString(arr));
	}
}
