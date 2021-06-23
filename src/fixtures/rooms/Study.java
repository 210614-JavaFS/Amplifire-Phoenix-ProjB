package fixtures.rooms;

import fixtures.objects.Cologne;


public class Study extends Room {

	
	
	public Study() {
		super("study", "A well furnished study.", "It contains many leatherbound books and smells of rich mohagany.");
		this.addInteractive(new Cologne());
	}



}