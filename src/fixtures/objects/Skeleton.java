package fixtures.objects;

import fixtures.Fixture;

public class Skeleton extends Fixture implements Interactive {
	
	public Skeleton() {
		super("A Skeleton", "A pile of bones.", "You see an old dusty skeleton laying on the floor. When you get "
				+ "closer you see a note that says, \"Find a key to escape the Haunted House!\"");
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
	public void Interact() {
		
		
	}
}
