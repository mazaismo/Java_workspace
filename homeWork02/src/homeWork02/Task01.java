package homeWork02;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nameSurnameInput;
		String nameInput;
		String surnameInput;
		
		
		
		/*
		Uzrakst�t programmu klas� HelloUser, kas
		1) Aicina lieto�ju ievad�t k�du v�rdu un uzv�rdu vien� rind� ar atstarpi
		*/
		
		System.out.println("Ievadiet k�du v�rdu un uzv�rdu vien� rind� ar atstarpi: ");
		nameSurnameInput = input.nextLine();
		
		int nameLengt = nameSurnameInput.lastIndexOf(' ');
		
		 // 2) Sadala v�rdu un uzv�rdu divos main�gajos.
		nameInput = nameSurnameInput.substring(0, nameLengt);
		surnameInput  = nameSurnameInput.substring(nameLengt + 1);
		
		System.out.println(nameInput);
		
		// 3) V�rdu p�rveido t� lai tas s�ktos ar lielo burtu un visi p�r�jie b�tu mazie burti
		
		
		//4) Uzv�rdu p�rveido lai tas viss sast�v�tu no lielajiem burtiem
		
		
		
		//5) Izvada uz ekr�na p�rveidotot v�rdu un uzv�rdu, katru sav� rindi�� ievietotu single quote p�di��s(')
		
		
		/*
		Hint: L�dz�gi k� String klases metode length() atgrie� String garumu, t� metode indexOf
		atgrie� k�da noteikta simbola indeksu, kuru jau varam izmantot substring metod�.
		Tie kas v�las iet dzi��k. Pievienojiet programmai gad�jumu apstr�di, ja lietot�js ievadot
		v�rdu s�kum� ievada atstarpi(vair�kas atstarpes), starp v�rdu un uzv�rdu ieliek vair�kas
		atstarpes, apskatiet gad�jumu, ja cilv�kam ir divi uzv�rdi. K��du apstr�de(ievada tikai v�rdu)
		
		*/
		
		
		
		
		
		

	}

}
