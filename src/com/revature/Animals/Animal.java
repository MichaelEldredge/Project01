package com.revature.Animals;

public interface Animal {
	public String getAnimalName();
	public String getFood();
	public default String getPicture() {
		return "";
	}
	public default String getBoundries() {
		return "";
	}
	public default String getLocation() {
		return "";
	}
	public default void eat() {
		System.out.print("The "+this.getAnimalName()+" eats "+this.getFood()+".\n");
	}
	public default void makeNoise() {
		System.out.print("The "+this.getAnimalName()+" makes noise.\n");
	}
	public default void sleep() {
		System.out.print("The "+this.getAnimalName()+" sleeps.\n");
	}
	public default void roam() {
		System.out.print("The "+this.getAnimalName()+" roams.\n");
	}
}
