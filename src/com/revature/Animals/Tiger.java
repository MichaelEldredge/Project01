package com.revature.Animals;

public class Tiger extends Feline {

	@Override
	public String getAnimalName() {
		return "Tiger";
	}

	@Override
	public String getFood() {
		return "15 lbs of meat";
	}
	@Override
	public void makeNoise(){
		System.out.print("The "+this.getAnimalName()+" growls.");
	}

}