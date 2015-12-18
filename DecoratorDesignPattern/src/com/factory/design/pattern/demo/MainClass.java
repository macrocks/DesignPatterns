package com.factory.design.pattern.demo;

public class MainClass {

	public static void main(String[] args) {
		
		 // create a small dog
	    Dog dog = DogFactory.getDog("small");
	    dog.Bark();
	 
	    // create a big dog
	    dog = DogFactory.getDog("big");
	    dog.Bark();
	 
	    // create a working dog
	    dog = DogFactory.getDog("working");
	    dog.Bark();
		
		
	}

}
