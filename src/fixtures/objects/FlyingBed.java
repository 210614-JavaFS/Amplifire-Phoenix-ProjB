package fixtures.objects;

import fixtures.Fixture;

public class FlyingBed extends Fixture implements Interactive{
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
	
	public FlyingBed()
	{
		super("cursed-mirror", "A bed floating in one side of the room..", "The bed is floating misteriously in a side of the room the reasons are unknown but, THERE SEEMS TO BE SOMETHING UNDER THE BED.");
	}

	@Override
	public void Interact() {
		System.out.println("\n"
				+ "You carefully walk over to the floating bed..\n"
				+ "You realize there is a note under it and slowly reach for it.\n"
				+ "You quickly grab the note and open it.");
		
		this.name = "Normal Bed";
		this.shortDescription = "The floating bed has dropped suddenly to the floor after you picked up the letter under it.";
		this.longDescription = "Now a normal bed in one side of the room..\n" + "The note under it reads as follows: ";
		
	}
	
	
	
}
