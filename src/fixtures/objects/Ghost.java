package fixtures.objects;

import fixtures.Fixture;

public class Ghost extends Fixture implements Interactive {

	private int timesTalkedTo;
	private boolean identityKnown;
	
	public Ghost() {
		super(
				"A Hazy Spot",
				"???",
				"As you get closer, the hazy spot becomes clearer. This isn't a thing, he's a person!\n"
				+ "He is the ghost of former Amplifire-Phoenix squad member, Hong Wu.\n"
				+ "He had been kidnapped from the squad and went missing.\n"
				+ "At least.... that's what you've been told."
		);
		
		timesTalkedTo = 0;
		identityKnown = false;
	}
	
	public void revealId() {
		this.name = "Hong Wu";
		this.shortDescription = "Former Squad member";
		this.longDescription = "It's the former squad member Hong Wu! He's not actually dead, of course, but you've been listening to too many ghost stories. \n"
				+ "Besides, he made this cool haunted house for you! Though he does seem a bit different somehow? Like he's maybe learned some actual magic?";
	}
	
	@Override
	public String printLongDescription() {
		String temp = this.longDescription;
		
		revealId();
		identityKnown = true;
		
		return temp;
	}

	@Override
	public String printShortDescription() {
		return this.shortDescription;
	}

	@Override
	public String printName() {
		return this.name;
	}

	@Override
	public void Interact() {

		if(!identityKnown)
			printLongDescription();
		
		switch (timesTalkedTo) {
		case 0: 
			System.out.println("\"Ha! You look like you've seen a ghost : )\"\n"
					+ "\"I made this haunted house and I hope you enjoy. If you need I can give you a hint. All you have to do is ask\"");
			timesTalkedTo++;
		break;
		////
		case 1: 
			System.out.println("\"Fine, I'll give you a hint.\"\n"
					+ "\"I left a useful hint under a bed upstairs : )\"");
			timesTalkedTo++;
		break;
		////
		case 2: 
			System.out.println("\"I left a useful hint under a magical bed upstairs : )\"");
			timesTalkedTo++;
		break;
		////
		default:
			System.out.println("\"Alright, I'll make it easy for you\"\n"
					+ "\"A good way to leave is to find something to eat.\"");
			timesTalkedTo++;
		break;
		
		
		}
		
	}

}
