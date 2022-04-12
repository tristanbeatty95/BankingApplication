import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		//int a = scan.nextInt();
		char c = scan.next().charAt(0);
		System.out.println("value = " + c);
		
	}

}
