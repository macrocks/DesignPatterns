package com.decorator.design.pattern.demo;

public class MainClass {

	public static void main(String[] args) {


		Pizza pizza =new BakedPizza();
		pizza.bakesPizza();
		//  Baked Pizza is ready
		pizza= new FarmHousePizza(new BakedPizza());
		pizza.bakesPizza();
		
		//Baked Pizza is readywith farm house topings
	}

}
