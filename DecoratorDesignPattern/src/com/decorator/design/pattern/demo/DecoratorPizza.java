package com.decorator.design.pattern.demo;

public abstract class DecoratorPizza implements Pizza {

	Pizza pizza;
	
	public DecoratorPizza(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bakesPizza() {
	this.pizza.bakesPizza();
	}
	
}
