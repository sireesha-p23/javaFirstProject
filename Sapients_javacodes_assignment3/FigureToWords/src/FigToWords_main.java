import java.util.Scanner;

public class FigToWords_main {

	public static void main(String[] args) {
		System.out.println("Enter the number having digits less than 5");
		Scanner scanner=new Scanner(System.in);
		String number=scanner.next();
		FigToWords numstring=new FigToWords();
		numstring.fig_to_words(number.toCharArray());
	}

}
