package com.revature.Animals;

public interface Animal {
	String animalName = ""; 
	String food = "";
	String picture = "";
	String boundries = "";
	String location = "";
	public static void eat() {
		System.out.print("The "+animalName+" eats "+food+".\n");
	}
	public static void makeNoise() {
		System.out.print("The "+animalName+" makes noise.\n");
	}
	public static void sleep() {
		System.out.print("The "+animalName+" sleeps.\n");
	}
	public static void roam() {
		System.out.print("The "+animalName+" roams.\n");
	}
}
