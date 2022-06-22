package com.revature.Animals;

public abstract class Canine implements Animal{
	@Override
	public void roam() {
		System.out.print("The "+getAnimalName()+" walks.\n");
	}
}
