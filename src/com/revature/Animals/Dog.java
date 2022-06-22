package com.revature.Animals;

public class Dog extends Canine {

	public void makeNoise(){
		System.out.print("The Dog barks.\n");		
	}
	@Override
	public String getAnimalName() {
		return "Dog";
	}
	@Override
	public String getFood() {
		return "1 cup of dog food";
	}


}
