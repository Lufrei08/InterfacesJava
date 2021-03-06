package Entities;

public class Cockatiel extends Bird implements Pet, DomesticatedAnimal {

	private String race;

	public Cockatiel(String name, String race) {
		super(name);
		this.race = race;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public void joke() {
		System.out.println("The animal is playing");

	}

	@Override
	public void fantasize() {
		System.out.println("The animal is dressed in a costume now");

	}

	@Override
	public void caress() {
		Cockatiel.super.sound();

	}

	@Override
	public void feed() {
		System.out.println("Feeding");
		
	}

	@Override
	public void takeToTheVet() {
		System.out.println("Transporting Animal");
		
	}

	@Override
	public void callToTheVet() {
		System.out.println("The vet is on the way");
		
	}

}
