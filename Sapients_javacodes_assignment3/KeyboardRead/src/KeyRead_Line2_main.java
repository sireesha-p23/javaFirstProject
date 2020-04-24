import java.util.Scanner;

public class KeyRead_Line2_main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		int n=scanner.nextInt();
		System.out.println("Enter the numbers");
		KeyRead_Line2 list=new KeyRead_Line2();
		list.read(n);
		System.out.println("The numbers you entered are :");
		list.display();
		list.sort();
		System.out.println("Enter the value to search");
		int key=scanner.nextInt();
		list.find(key);
	}
}
