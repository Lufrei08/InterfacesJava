package Entities;

public class Horse extends Mammal implements DomesticatedAnimal {

	private String age;
	private String race;

	public Horse(String name, int qtdTeat, String age, String race) {
		super(name, qtdTeat);
		this.age = age;
		this.race = race;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
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
