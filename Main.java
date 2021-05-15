package ingq;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void showNumbers() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int size = 1;// cate numere o sa aiba lista plec de la 1 sa nu fie goala.
		int option = 0; // poti sa alegi daca vrei sa afisezi cel mai mic sau cele mai mici 2 numere
		int number = 0; // cu asta adaug in lista
		int lowestNumber = Integer.MAX_VALUE; // plec de aici pt ca e cel mai mare nr de tip int
		int secondLowestNumber = 0;
		boolean bool = true;
		boolean bool1 = true;// asta este pentru a trata exceptiile si a avea un input corect.
		Scanner sc = new Scanner(System.in);
		// AICI CITESC SIZE merge bine zic eu.Si tratez exceptiile.
		while (bool) {
			try {
				System.out.println("Introdu size-ul listei(sa fie pozitiv si mai mare ca 0)");
				size = Integer.parseInt(sc.nextLine());
				if (size <= 1) {
					bool = true;
				} else
					bool = false;
			} catch (NumberFormatException e) {
				System.out.println("Introdu un numarrrrrrrrrrr!!!1");
				bool = true;
			}
			;
		}
		// Aici citesc numberele ce intra in lista .Si tratez exceptiile.
		while (!bool) {
			try {
				System.out.println("Introdu numarul :");
				number = Integer.parseInt(sc.nextLine());
				for (int i = 1; i < size; i++) {
					list.add(number);
					while (bool1) {
						try {
							System.out.println("Introdu un numar:");
							number = Integer.parseInt(sc.nextLine());
							System.out.println("Numarul a fost adaugat:");
							bool1 = false;
						} catch (NumberFormatException e) {
							System.out.println("Introdu un numarr!!!");
							bool1 = true;
						}
						;
					}
					bool1=true;
				}
				bool = true;
			} catch (NumberFormatException e) {
				System.out.println("Introdu un numarrrrrrrrrrr!!!1");
				bool = false;
			}
			;
		}
		list.add(number);
		System.out.println("Numerele au fost adaugate");

		for (int i = 0; i < size; i++) { // o problema de implementare aici este daca adaug numai numere mai mari in
											// lista
			if (lowestNumber > list.get(i)) { // gen 1 , 2 ,3 ,10 ,20 etc , atunci secondLowestNumber o sa fie egal cu
												// max_value;
				secondLowestNumber = lowestNumber; // da cazu asta este destul de rar asa ca nu o sa-l tratez.
				lowestNumber = list.get(i);
			}
		}
		while (bool) {
			try {
				System.out.println("alege 0 pt cel mai mic numar si 1 pentru cele 2 mai mici numere");
				option = Integer.parseInt(sc.nextLine());
				if ((option == 1) || (option == 0))
					bool = false;
				else
					bool = true;
			} catch (NumberFormatException e) {
				System.out.println("Introdu un numarrrrrrrrrrr!!!1");
				bool = true;
			}
			;
		}
		if (option == 0) {
			System.out.println("Cel mai mic numar este :" + lowestNumber);
		} else {
			System.out.println("Cel mai mici 2 numere sunt :" + lowestNumber + " si " + secondLowestNumber);
		}

	}

	public static void main(String[] args) {

		showNumbers();

	}

}
