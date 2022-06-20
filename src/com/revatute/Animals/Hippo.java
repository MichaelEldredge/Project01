package com.revatute.Animals;

public class Hippo implements Animal {
	String animalName = "Hippo"; 
	String food = "35 kg of grass";
	public void eat() {
		System.out.print("The "+animalName+" eats "+food+".\n");
	}
	public void makeNoise() {
		System.out.print("The "+animalName+" honks.\n");
	}
	public void sleep() {
		System.out.print("The "+animalName+" sleeps.\n");
	}
	public void roam() {
		System.out.print("The "+animalName+" roams.\n");
	}
}
