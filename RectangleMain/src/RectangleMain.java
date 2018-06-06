import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ievadiet èetrstûra pirmo malu");
		int FirstInt = input.nextInt();
		
		System.out.println("ievadiet èetrstûra otro malu");
		int SecoundtInt = input.nextInt();
		input.close();
		
		Rectangle rectangle1 = new Rectangle(FirstInt, SecoundtInt);
		
		

	System.out.println("Figûras laukums ir " + rectangle1.Area());
	System.out.println("Figûras perimetrs ir " + rectangle1.Perimeter());
	System.out.println("Figûras dotie lielumi ir " + rectangle1.toString());
	
	
	
	
		
		
	}

}
