package fixtures.objects;

import fixtures.Fixture;

public class Cologne extends Fixture implements Interactive {


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
	
	public Cologne()
	{
		super("Cologne", "Odeon brand cologne, it's illegal in nine countries.", "60% of the time, it works every time.");
	}

	@Override
	public void Interact() {
		System.out.println("Time to musk up.  You apply the cologne.  It's a formidable scent!  It stings the nostrils... in a good way.");
	}
}