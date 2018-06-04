import java.util.Scanner;

public class PDClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ievadiet skaitli: ");
		int skaitlis = input.nextInt();
		
		
		for (int i = 0; i <= skaitlis; i++)
		{
			int result = i * skaitlis;
			System.out.println(result);
		}

	}

}
