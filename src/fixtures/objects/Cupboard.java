package fixtures.objects;

import fixtures.Fixture;

public class Cupboard extends Fixture implements Interactive{
	private String message ="You stand up in front of the cupboard. \\nSUDDENLY, the cupboard doors open and.. THE CUPS START FLYING TOWARDS YOU!!\\n\\n"
			+ "Luckily none of them harmed you.. HA! Take that ghost!! \\n";
	
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
	
	public Cupboard()
	{
		super("Cupboard", "A cupboard full of cups and vases.", "This cupboard looks suspiciously clean for an abandoned house. You swear it was open when you came into the room. ");
	}

	@Override
	public void Interact() {
		System.out.println(this.message);
		this.message ="You stare at the empty cupboard and can just remember all the cups flying towards you..";
	}
}
