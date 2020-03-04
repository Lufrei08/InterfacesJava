package Entities;

public abstract class Mammal extends Animal {

	private int qtdTeat;
	

	public Mammal(String name, int qtdTeat) {
		super(name);
		this.qtdTeat = qtdTeat;
	}

	public int getQtdTeat() {
		return qtdTeat;
	}

	public void setQtdTeat(int qtdTeat) {
		this.qtdTeat = qtdTeat;
	}

	public void breastfeed() {
		System.out.println("Feeding");
	}
	
	public void sound() {
		System.out.println("Emitting sound");
	}
}
