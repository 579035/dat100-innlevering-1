package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tast inn bruttoinntekt: ");
		String inntektTxt = input.nextLine();
		int inntekt = Integer.parseInt(inntektTxt);
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.136;
		double trinn4 = 0.166;
		double trinn5 = 0.176;
		double skatt = 0.0;
		
			if (inntekt<=208050) {
				System.out.println("ingen trinnskatt.");
			} else if (inntekt>208050) {
				double inntekt1 = inntekt>292850?84800:inntekt-208050;
				skatt+= inntekt1*trinn1;
					if (inntekt>292850) {
						double inntekt2 = inntekt>670000?377150:inntekt-292850;
						skatt += inntekt2*trinn2;
						if (inntekt>670000) {
							double inntekt3 = inntekt>937900?267900:inntekt-670000;
							skatt+= inntekt3*trinn3;
							if (inntekt>937900) {
								double inntekt4 = inntekt>1350000?412100:inntekt-937900;
								skatt+= inntekt4*trinn4;
								if (inntekt>1350000) {
									double inntekt5 = inntekt-1350000;
									skatt+= inntekt5*trinn5;
								}
							}
						}
					}
			}
			System.out.println("Trinnskatt:"+skatt);
			input.close();
	}
}