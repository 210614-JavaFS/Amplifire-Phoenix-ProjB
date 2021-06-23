package fixtures.objects;

import fixtures.Fixture;

public class Skeleton extends Fixture implements Interactive {
	
	public String printLongDescription() {
		return this.longDescription;
	}

	public String printShortDescription()
	{
		return this.shortDescription;
	}
	
	public String printName()
	{		
		return this.name;
	}

	public Skeleton()
	{
		super("Skeleton", "A pile of bones", "An old skeleton on the floor. When you get closer you notice a note that says, \"Find the key to escape the house!\"");
		
	}

}
