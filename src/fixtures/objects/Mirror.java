package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class Mirror extends Fixture implements Interactive {

	public String printLongDescription() {
		return this.longDescription;
	}

	public String printShortDescription() {
		return this.shortDescription;
	}

	public String printName() {
		return this.name;
	}
	
	public Mirror() {
		super("Mirror", "A mirror on the back of the bathroom door.", "This mirror has someone living in it.  A hand beckons to you.");
	}

	@Override
	public void Interact(Player player) {
		System.out.println("You touch the mirror.  Your hand sinks in, and it is very cold");
		
		this.name = "An otherworldly mirror";
		this.shortDescription = "You have just met Hong the ghost.  Don't worry, he's nice.";
		this.longDescription = "You have just put your hand into a portal to another world.  It should be cold.";
	}

}
