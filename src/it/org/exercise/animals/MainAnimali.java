package it.org.exercise.animals;

import java.util.Scanner;

public class MainAnimali {

	public static void main(String[] args) {
		
		Animale animale = null;
		
		Scanner scan = new Scanner(System.in);
		boolean scelta = false;
		while (!scelta) {
		System.out.println("Seleziona un numero fra 1, 2, 3 e 4 "
				+ "per sapere come dormono,"
				+ " mangiano e "
				+ "il verso dei seguenti animali e sapere "
				+ "se nuotano o volano\n"+
							  "1) Il cane\n"
							+ "2) il passerotto\n"
							+ "3) L' aquila\n"
							+ "4) il delfino");
		int sceltaAnimale = scan.nextInt();
		switch(sceltaAnimale) {
		case 1: {
			animale = new Cane();
			scelta = true;
			break;
		}
		case 2: {
			animale = new Passerotto();
			scelta = true;
			break;
		}
		case 3: {
			animale = new Aquila();
			scelta = true;
			break;
		}
		case 4: {
			animale = new Delfino();
			scelta = true;
			break;
		}
		default: {
			System.out.println("Per favore scegli un animale per continuare");
		}
		
		}
		}
		if (animale != null) {
			animale.dormi();
			animale.mangia();
			animale.verso();
		}
		
		
		
		
		
		
		
		
}
}
