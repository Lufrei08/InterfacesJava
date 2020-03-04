package Entities;

public abstract class Bird extends Animal {


	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("Flying");
	}

	public void sound() {
		System.out.println("Emitting sound");
	}
}
