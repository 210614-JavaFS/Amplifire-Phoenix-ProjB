package fixtures.objects;

import fixtures.Fixture;

public class Thing extends Fixture implements Interactive{

	public Thing() {
		super(
				"thing", 
				"This is a thing", 
				
				"This is a really detailed look at the thing. "
				+ "This thing has thing like properties and thing-like qualities. It truly is a thing. "
				+ "You wouldn't believe it if I told you, but here I am telling you. I hope you believe me"
		);
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

	
	//This is the interact method
	//It should at least print something out indicating what happens when you interact with it
	//It could be that you wipe a mirror and see something, or that you simply touch it and describe what you feel.
	//It just has to be something
	
	//Optionally, you can have something change, like have the name change, or the short/long description change
	//To give you some ideas, you could interact with a pot and accidentally break it. Then the name could change from "Pot" to "Shattered Pot"
	//You could then change the short description or long description to fit it's broken state within this method using this.name or this.shortDescription
	@Override
	public void Interact() {
		System.out.println("\n"
				+ "You touch this thing.\n"
				+ "You can't believe it. It is indeed a thing.\n"
				+ "Despite it all, you're still yourself.");
		
		this.name = "A soiled Thing.";
		this.shortDescription = "After being touched, it's no longer the same :(";
		
		
	}

}

