package fixtures.objects;

import fixtures.Fixture;

public class Vase extends Fixture implements Interactive {

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

	public Vase()
	{
		super("Vase", "An unassuming vase.", "A dusty ornate vase made of porcelein.");
		
	}

	@Override
	public void Interact() {
		System.out.println("You look into the vase, there is debris in the vase that looks like some kind of decayed plants.");
	}
}
