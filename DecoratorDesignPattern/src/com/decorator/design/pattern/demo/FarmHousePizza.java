package com.decorator.design.pattern.demo;

public class FarmHousePizza extends DecoratorPizza{

	public FarmHousePizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void bakesPizza() {
		System.out.println("Baked Pizza is ready" + "with farm house topings");
		
	}
	
}
