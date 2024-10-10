package it.org.exercise.animals;

public class Aquila extends Animale implements AnimaleVolante
{

	
	@Override
	public void verso() {
		System.out.println("Viva L 'America");
		
	}

	@Override
	public void mangia() {
		System.out.println("Animali di piccole taglie");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto Volando!!!");
		
	}

}

