package it.org.exercise.animals;

public class Delfino extends Animale implements AnimaleAquatico {

	
	@Override
	public void verso() {
		System.out.println("brtp");
		
	}

	@Override
	public void mangia() {
		System.out.println("pesci di piccole dimensioni");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando !!!");
		
	}

	
}

