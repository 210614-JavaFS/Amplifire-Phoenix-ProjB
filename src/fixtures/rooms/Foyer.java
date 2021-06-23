package fixtures.rooms;

import fixtures.objects.Vase;
import fixtures.objects.thing;



public class Foyer extends Room {


	
	public Foyer() {
		super("foyer", "short description of a foyer", "Long description of a foyer");
		this.addInteractive(new Vase());
		this.addInteractive(new thing());
	}



}
