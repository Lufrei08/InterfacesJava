package Entities;

public abstract class Animal {

	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println("Emitting sound");
	}

}
