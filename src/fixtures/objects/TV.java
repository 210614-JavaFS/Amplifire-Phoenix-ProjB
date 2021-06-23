package fixtures.objects;

import fixtures.Fixture;

public class TV extends Fixture implements Interactive {


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
	
	public TV()
	{
		super("TV", "A large flatscreen television.", "A 50 inch Sceptre flat screen television, I wonder what's there to watch.");
	}
}
