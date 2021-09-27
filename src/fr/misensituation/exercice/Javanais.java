package fr.misensituation.exercice;

import java.util.*;

public class Javanais {
	//String c = "bonjour";

	static String voyelles = "aeiouyAEIOUY";

	static String consonnes = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";

	// Verifier si la lettre est une voyelle
	public static boolean estUneVoyelle(char c) {
		return (voyelles.indexOf(c) != -1);
	}

	// Verifier si la lettre est une consonne
	public static boolean estUneConsonne(char c) {
		return (consonnes.indexOf(c) != -1);
	}

	//Insertion de "av"
	public static String insereSyllabe(String mot, String syllabe) {
		String nouveauMot = mot;
		ArrayList<Character> liste_voyelles = new ArrayList<Character>();

		if (voyelles.indexOf(mot.charAt(0)) != -1) {
			liste_voyelles.add(mot.charAt(0));
			nouveauMot = syllabe + mot;
		}

		for (int i = 0; i < mot.length() - 1; i++) { // je parcours le mot
			if (estUneConsonne(mot.charAt(i))) {
				if (estUneVoyelle(mot.charAt(i + 1))) {
					if (liste_voyelles.contains(mot.charAt(i + 1))) {
					}
				}
			}
		}
		return nouveauMot;
	}

	public static void main(String[] args) {
		String mot;
		String syl = "av";
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un mot puis appuyer sur 'Entrée' : ");
		mot = sc.next();
		System.out.println("Nouveau mot javanais avec la syllabe '" + syl + " ' : " + insereSyllabe(mot,syl));

	}

}