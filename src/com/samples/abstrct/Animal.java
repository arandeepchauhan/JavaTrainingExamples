package com.samples.abstrct;

public abstract class Animal {
	abstract void speak();
	Animal() {
	}
	public void walk()
	{
		System.out.println("I can Walk");
	}

}
class Dog extends Animal {



	void speak() {
		System.out.println("I am a Dog");

	}
	public static void main(String args[])
		{
			//Animal a=new Animal();
			Animal dog=new Dog();

			dog.walk();
}

}
