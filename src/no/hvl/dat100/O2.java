package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		int i = 1;
		while (i <=10) {
			System.out.println("Tast inn resultat: ");
			String gradeTxt = input.nextLine();
			int grade = Integer.parseInt(gradeTxt);
			
			if (grade>100) {
				System.out.println("Ugyldig resultat, vennligst tast inn på nytt.");
			} else if (grade>=90) {
				System.out.println("Karakter: A");
				i++;
			} else if (grade>=80) {
				System.out.println("Karakter: B");
				i++;
			} else if (grade>=60) {
				System.out.println("Karakter: C");
				i++;
			} else if (grade>=50) {
				System.out.println("Karakter: D");
				i++;
			} else if (grade>=40) {
				System.out.println("Karakter: E");
				i++;
			} else if (grade>=0) {
				System.out.println("Karakter: F");
				i++;
			} else {
				System.out.println("Ugyldig resultat, vennligst tast inn på nytt.");
			}
		}
		input.close();
	}
}