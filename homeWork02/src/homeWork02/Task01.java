package homeWork02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nameSurnameInput;
		String nameInput;
		String surnameInput;

		/*
		 * Uzrakstît programmu klasç HelloUser, kas 1) Aicina lietoâju ievadît kâdu
		 * vârdu un uzvârdu vienâ rindâ ar atstarpi
		 */

		System.out.println("Ievadiet kâdu vârdu un uzvârdu vienâ rindâ ar atstarpi: ");
		nameSurnameInput = input.nextLine();

		// 2) Sadala vârdu un uzvârdu divos mainîgajos.

		int nameLengt = nameSurnameInput.lastIndexOf(' ');

		nameInput = nameSurnameInput.substring(0, nameLengt);
		surnameInput = nameSurnameInput.substring(nameLengt + 1);

		// 3) Vârdu pârveido tâ lai tas sâktos ar lielo burtu un visi pârçjie bûtu mazie
		// burti

		nameInput = nameInput.substring(0, 1).toUpperCase() + nameInput.substring(1).toLowerCase();

		// 4) Uzvârdu pârveido lai tas viss sastâvçtu no lielajiem burtiem

		surnameInput = surnameInput.substring(0).toUpperCase();

		// 5) Izvada uz ekrâna pârveidotot vârdu un uzvârdu, katru savâ rindiòâ
		// ievietotu single quote pçdiòâs(')

		System.out.println("'" + nameInput + "'");
		System.out.println("'" + surnameInput + "'");

		/*
		 * Hint: Lîdzîgi kâ String klases metode length() atgrieþ String garumu, tâ
		 * metode indexOf atgrieþ kâda noteikta simbola indeksu, kuru jau varam izmantot
		 * substring metodç. Tie kas vçlas iet dziïâk. Pievienojiet programmai gadîjumu
		 * apstrâdi, ja lietotâjs ievadot vârdu sâkumâ ievada atstarpi(vairâkas
		 * atstarpes), starp vârdu un uzvârdu ieliek vairâkas atstarpes, apskatiet
		 * gadîjumu, ja cilvçkam ir divi uzvârdi. Kïûdu apstrâde(ievada tikai vârdu)
		 * 
		 */

	}

}
