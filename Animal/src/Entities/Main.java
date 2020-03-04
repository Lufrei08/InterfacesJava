package Entities;

public class Main {

	public static void main(String[] args) {
		Cockatiel Nick = new Cockatiel("Black", "Gray");
		Horse Thunder = new Horse("Thunder", 4, "15 years", "Manga Larga");
		
		Nick.caress();
		Thunder.feed();

	}

}
