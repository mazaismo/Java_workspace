import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ievadiet �etrst�ra pirmo malu");
		int FirstInt = input.nextInt();
		
		System.out.println("ievadiet �etrst�ra otro malu");
		int SecoundtInt = input.nextInt();
		input.close();
		
		Rectangle rectangle1 = new Rectangle(FirstInt, SecoundtInt);
		
		

	System.out.println("Fig�ras laukums ir " + rectangle1.Area());
	System.out.println("Fig�ras perimetrs ir " + rectangle1.Perimeter());
	System.out.println("Fig�ras dotie lielumi ir " + rectangle1.toString());
	
	
	
	
		
		
	}

}
