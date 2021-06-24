package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class Skeleton extends Fixture implements Interactive {
	
	public Skeleton() {
		super("A Skeleton", "A pile of bones.", "You see an old dusty skeleton laying on the floor. Judging from "
				+ "the looks of it, it must have been here for awhile!");
	}

	public String printLongDescription() {
		return this.longDescription;
	}

	public String printShortDescription() {
		return this.shortDescription;
	}
	
	public String printName() {		
		return this.name;
	}

	@Override
	public void Interact(Player player) {
		
		System.out.println("When you get closer you see a note that says, \"Find a key to escape the Haunted House!\"");
		
	}
}
