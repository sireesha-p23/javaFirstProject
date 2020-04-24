import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int[] numbers;
	
	// read() method to read numbers from the console
	
	void read(int n)
	{
		int[] arr=new int[n];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		this.numbers=arr;
	}
	
	// display() method to display the numbers taken as input
	
	void display()
	{
		System.out.println(Arrays.toString(this.numbers));
	}
	
	// sort() method to sort the numbers
	
	void sort()
	{
		Arrays.sort(this.numbers);
		System.out.println("The sorted elements are :");
		display();
	}
	
	// find() method to check whether the specific key value is in present in the numbers taken as input
	
	void find(int key)
	{
		int index=Arrays.binarySearch(this.numbers,key);
		if(index>=0)
			System.out.println("Successful search!! Value is found at position "+(index+1));
		else
			System.out.println("Unsuccessful search!!");
	}
}
