import java.util.Scanner;

public class HumanPlayer implements Player {
	Scanner input = new Scanner(System.in);

	@Override
	public int[] makeMove() {

		int x = GetInput("ievadi rindu: ");
		int y = GetInput("ievadi kolonu: ");

		return new int[] { x, y };

	}

	private int GetInput(String text) {

		int value = -1;
		do {
			System.out.print(text);
			value = input.nextInt();

		} while (value < 0 || value > 2);

		return value;
	}

}
