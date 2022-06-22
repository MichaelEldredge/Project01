package com.revature.Animals;

public class Cat extends Feline {

	@Override
	public String getAnimalName() {
		return "Cat";
	}

	@Override
	public String getFood() {
		return "1/2 cup of cat food";
	}
	@Override
	public void makeNoise() {
		System.out.print("The "+this.getAnimalName()+" mews.\n");
	}

}
