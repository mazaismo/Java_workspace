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
		 * Uzrakstît programmu klasç DateValidator kas prasa lietotâjam ievadît datumu
		 * un mçnesi(atseviðíâs rindâs). Abi ðie lielumi tiek ievadîti kâ skaitïi
		 * atseviðíâ rindâ.
		 */

		System.out.println("ievadiet ludzu datutmu: ");
		date = input.nextInt();

		System.out.println("ievadiet ludzu menesi: ");
		month1 = input.nextInt();

		/*
		 * 1) Veiciet pârbaudi vai datums ir derîgs konkrçtajam mçnesim. Piemçram,
		 * datums = 31 un mçnesis 4 nav derîga kombinâcija, jo aprîlî ir tikai 30
		 * dienas.
		 */

		// 2) Ja kâds no ievadîtajiem datiem nav derîgs, tad izvadam kïûdas paziòojumu

		// 3) Ja Ievadîtie dati ir derîgi(eksistçjoð datums un mçnesis), tad izvadam to
		// uz ekrâna

		// aizstâjot mçneða numuru ar tâ mçneða vârdu.
		// Piemçram, ievada 5 un 2, tad programa izvada “5. februâris”

		

			if (date <= month[month1 - 1]) {
				System.out.println("ievaditais datums ir " + date + "." + monthName[month1 - 1] + " 2018");
			} else {
				System.out.println("ievaditais datums ir nepareizs!!!");
				
			}

		

		/*
		 * Tie kas vçlas iet dziïâk. Pievienojiet treðo lauku pie ievades, kas ir gads.
		 * Ðeit papildus jâpârbauda vai tas ir “îsais” vai “garais” gads, attiecîgi
		 * daþos gados 29 un 2 bûs derîga kombinâcija, bet daþos nebûs. Mçneðu
		 * nosaukumus var glabât masîvâ lai nav jâraksta 12 if statement.
		 */

	}

}
