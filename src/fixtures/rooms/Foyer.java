package fixtures.rooms;

import fixtures.objects.Vase;
import fixtures.objects.FrontDoor;
import fixtures.objects.Thing;



public class Foyer extends Room {


	
	public Foyer() {
		super("foyer", "The entrance to the house and the main hall.", "You enter the foyer, the floor boards creek, it is dusty and there are cobwebs all around.");
		this.addInteractive(new Vase());
		this.addInteractive(new Thing());
		this.addInteractive(new FrontDoor());
	}



}
