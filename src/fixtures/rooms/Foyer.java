package fixtures.rooms;

import fixtures.objects.Vase;



public class Foyer extends Room {


	
	public Foyer() {
		super("foyer", "short description of a foyer", "Long description of a foyer");
		this.addInteractive(new Vase());
	}



}
