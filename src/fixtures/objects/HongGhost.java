package fixtures.objects;

import fixtures.Fixture;

public class HongGhost extends Fixture implements Interactive {


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
	
	public HongGhost()
	{
		super("HongGhost", "A floating white figure.", "A lost soul that can't leave until he's found his cologne.");
	}
}
