package no.hvl.dat100;

import java.util.Scanner;

public class O3	{  
    public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.println("Tast inn positivt heltall: ");
		String nTxt = input.nextLine();
		int n = Integer.parseInt(nTxt);
		System.out.println(n+"! = "+regnFakultet(n));
		input.close();
    }
    public static int regnFakultet(int n) {
    	int fakultet = 1;
    	for (int i =1; i<= n; i++) {
    		fakultet = fakultet*i;
    	}
    	return fakultet;
    }
}