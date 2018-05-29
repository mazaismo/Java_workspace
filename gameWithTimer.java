
package project1;

import java.util.Random;
import java.util.Scanner;

public class gameWithTimer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random rand = new Random();

		int c = 10;
// sakums ir
		for (int i = 0; i < 10; i++) {

			int a = rand.nextInt(c);
			// System.out.print(a);

			int b = rand.nextInt(c);
			// System.out.println(b);

			int operator = rand.nextInt(4);
			// System.out.println(b);

			switch (operator) {
			case 1:

				int result = a + b;
				System.out.println(a + "+" + b + "= ");
				int result1 = input.nextInt();

				if (result == result1) {
					System.out.println("correct");
				} else {
					System.out.println("wrong");
				}

				break;

			case 2:

				result = a - b;
				System.out.println(a + "-" + b + "= ");
				result1 = input.nextInt();

				if (result == result1) {
					System.out.println("correct");
				} else {
					System.out.println("wrong");
				}

				break;

			case 3:

				result = a * b;
				System.out.println(a + "*" + b + "= ");
				result1 = input.nextInt();

				if (result == result1) {
					System.out.println("correct");
				} else {
					System.out.println("wrong");
				}

				break;

			case 4:

				result = a / b;
				System.out.println(a + "/" + b + "= ");
				result1 = input.nextInt();

				if (result == result1) {
					System.out.println("correct");
				} else {
					System.out.println("wrong");
				}

				break;

			default:
				break;

			}
			
		
		}
		
		System.out.println("Paldies par speli");
		input.close();

	}

}
