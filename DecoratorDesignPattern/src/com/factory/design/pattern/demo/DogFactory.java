package com.factory.design.pattern.demo;

public class DogFactory {

	public static Dog getDog(String criteria){
		System.out.println(criteria);
		switch (criteria) {
		case "samll":
			return new Poddle();
		case "big":
			return new RottleWiella();
		case "working":
			return new SieberianHusky();
		default:
				return new Poddle();
		}
	}
	
}
