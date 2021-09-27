package fr.misensituation.exercice;

import java.util.*;

public class Javanais {

	//Insertion de "av"
	public static String inser(String mot, String syllabe){
		List<Character> consonnes = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z');
		List<Character> voyelles = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
		char[] tab_lettres = mot.toCharArray();

		String mot_final = "";

		for (int i = 0; i < tab_lettres.length; i++) {
			if(consonnes.contains(tab_lettres[i])){ // on verifie  si c'est une consonne
				// c'est une consonne
				if(voyelles.contains(tab_lettres[i + 1])){ //si oui on verifie le caractère suivant si c'est une voyelle
					// si le caractere suivant est une voyelle
					mot_final = mot_final + tab_lettres[i] + syllabe;
				} else {
					mot_final = mot_final + tab_lettres[i];
				}
			} else {
				if(i == 0){
					mot_final = syllabe;
				}
				// le caractere est une voyelle
			}
		}

		return mot_final;
	}


	public static void main(String[] args) {
		String mot;
		String syl = "av";
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un mot puis appuyer sur 'Entrée' : ");
		mot = sc.next();
		System.out.println("Nouveau mot javanais avec la syllabe '" + syl + " ' : " + inser(mot,syl));
	}

}
