package main;

import java.util.Random;

public class TestStudieadviesApp {
	public static void main(String[] args) {
		Random r = new Random();
		
		Student s1 = new Student("persoon 1");
		for (int i = 0; i < 8; i++) {
			s1.setCijfer(i, r.nextInt(10) + 1);
		}
		
		System.out.println(s1);
		System.out.println(Studieadviseur.krijgtPositiefStudieadvies(s1));
		System.out.println("------------------");
	}

}


/*opgave B
 * anders moet je eerst het Studieadviseur inatieren
 */

/*opgave C
 * Als je niet zeker weet of krijgtPositiefStudieadvies al een functie is en je hem duidelijker wil inatieren
 */


/*Opgave A
 * je mag geen non static variable in een static functie gebruiken
 */


