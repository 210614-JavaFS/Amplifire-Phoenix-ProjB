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
		// TODO Auto-generated method stub
		
	}

}
