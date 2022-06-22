package com.revature.Animals;

public class Hippo implements Animal {
	String animalName = "Hippo"; 
	String food = "35 kg of grass";
	@Override
	public void makeNoise() {
		System.out.print("The "+this.animalName+" honks.\n");
	}
	@Override
	public String getAnimalName() {
		return animalName;
	}
	@Override
	public String getFood() {
		return food;
	}
}
