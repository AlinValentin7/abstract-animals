package it.org.exercise.animals;

public class Passerotto extends Animale implements AnimaleVolante{

	
	@Override
	public void verso() {
		System.out.println("Cip Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Semi e molliche");
		
	}

	

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
