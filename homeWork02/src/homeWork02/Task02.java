package homeWork02;

import java.lang.reflect.Array;
import java.util.Scanner;;

public class Task02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int date;
		int month1;
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		
		
		/*
		 * Uzrakst�t programmu klas� DateValidator kas prasa lietot�jam ievad�t datumu
		 * un m�nesi(atsevi���s rind�s). Abi �ie lielumi tiek ievad�ti k� skait�i
		 * atsevi��� rind�.
		 */

		System.out.println("ievadiet ludzu datutmu: ");
		date = input.nextInt();

		System.out.println("ievadiet ludzu menesi: ");
		month1 = input.nextInt();

		/*
		 * 1) Veiciet p�rbaudi vai datums ir der�gs konkr�tajam m�nesim. Piem�ram,
		 * datums = 31 un m�nesis 4 nav der�ga kombin�cija, jo apr�l� ir tikai 30
		 * dienas.
		 */

		// 2) Ja k�ds no ievad�tajiem datiem nav der�gs, tad izvadam k��das pazi�ojumu

		// 3) Ja Ievad�tie dati ir der�gi(eksist�jo� datums un m�nesis), tad izvadam to
		// uz ekr�na

		// aizst�jot m�ne�a numuru ar t� m�ne�a v�rdu.
		// Piem�ram, ievada 5 un 2, tad programa izvada �5. febru�ris�

		

			if (date <= month[month1 - 1]) {
				System.out.println("ievaditais datums ir " + date + "." + monthName[month1 - 1] + " 2018");
			} else {
				System.out.println("ievaditais datums ir nepareizs!!!");
				
			}

		

		/*
		 * Tie kas v�las iet dzi��k. Pievienojiet tre�o lauku pie ievades, kas ir gads.
		 * �eit papildus j�p�rbauda vai tas ir ��sais� vai �garais� gads, attiec�gi
		 * da�os gados 29 un 2 b�s der�ga kombin�cija, bet da�os neb�s. M�ne�u
		 * nosaukumus var glab�t mas�v� lai nav j�raksta 12 if statement.
		 */

	}

}
