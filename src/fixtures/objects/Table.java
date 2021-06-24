package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class Table extends Fixture implements Interactive{
	
	public Table() {
		super("Table", "A dusty old table", "Inching closer to the table there seems to be a note on it with something inside");
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
	
	@Override
	public void Interact(Player player) {
		System.out.println("\n" + "The note reads...  \n"
							+ "you found your way out \n \n"
							+ "There is a key inside of the note. \n" 
							+ "You pick up the key.");
		player.hasKey = true;
		this.longDescription = "Must get to the door now.";
	}
	
}
