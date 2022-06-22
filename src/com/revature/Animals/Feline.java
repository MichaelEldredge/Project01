package com.revature.Animals;

abstract public class Feline implements Animal {
	@Override
	public void roam() {
		System.out.print("The "+this.getAnimalName()+" prowls.\n");
	}

}
