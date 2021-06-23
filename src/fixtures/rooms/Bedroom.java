package fixtures.rooms;

import fixtures.objects.TV;


public class Bedroom extends Room {

	
	
	public Bedroom() {
		super("Bedroom", "Room containing a bed.", "This room contains a King sized bed on a frame facing the entry door.");
		this.addInteractive(new TV());
	}



}
