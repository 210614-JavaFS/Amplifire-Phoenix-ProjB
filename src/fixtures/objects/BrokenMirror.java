package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class BrokenMirror extends Fixture implements Interactive{

	private boolean isBroken;
	
	public BrokenMirror() {
		super(
				"A Broken Mirror", 
				"Shards of glass fill the frame", 
				
				"The frame for the mirror is filled with small shards of silver glass where a mirror "
				+ "should be.\n"
				+ "It looks like it's barely held together and might fall apart at any second"
		);
		isBroken = false;
	}

	@Override
	public String printLongDescription() {
		
		return this.longDescription;
	}

	@Override
	public String printShortDescription() {
		return this.shortDescription;
	}

	@Override
	public String printName() {
		return this.name;
	}

	
	//This is the interact method
	//It should at least print something out indicating what happens when you interact with it
	//It could be that you wipe a mirror and see something, or that you simply touch it and describe what you feel.
	//It just has to be something
	
	//Optionally, you can have something change, like have the name change, or the short/long description change
	//To give you some ideas, you could interact with a pot and accidentally break it. Then the name could change from "Pot" to "Shattered Pot"
	//You could then change the short description or long description to fit it's broken state within this method using this.name or this.shortDescription
	@Override
	public void Interact(Player player) {
			if (!isBroken) {
			System.out.println("\n"
					+ "You touch the mirror.\n"
					+ "All of the pieces of glass fall on the floor with small clinking noises.\n"
					+ "There's not much left of it now");
			
			this.name = "A Mirror Frame";
			this.shortDescription = "After being touched, it's no longer the same";
			this.longDescription = "It is basically just the frame of a mirror now. Nothing special";
		}
			else {
				System.out.println("There is nothing but a mirror frame now. It's probably best not to pick up the glass shards.");
			}
		
	}

}

