package it.org.exercise.animals;

public abstract  class  Animale implements AnimaleAquatico, AnimaleVolante {

	public  void dormi () {
		System.out.println("ZZZ");
	}
	
	public abstract void verso();
	
	public abstract void mangia();

	
}
