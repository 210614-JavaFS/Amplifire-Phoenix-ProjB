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
		super("HongGhost", "Woah, a mysterious floating white figure.", "A lost soul named Hong Wu that can't leave this world until he's found his cologne.");
	}

	@Override
	public void Interact() {
		// TODO Auto-generated method stub
		
	}
}
