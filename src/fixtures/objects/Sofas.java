package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class Sofas extends Fixture implements Interactive {

	public Sofas() {
		super(
				"Two Sofas",
				"Comfy, but covered in something?",
				"Despite how comfortable it looked at first, as you get closer you notice it's covered in a strange slime.\n"
				+ "Not only that, the slime seems to pulsate, as if it had a heart and were breathing.\n"
				+ "You decide it's probably best not to sit on it"
		);
	}

	@Override
	public String printLongDescription() {
		String temp = this.longDescription;
		spoilTheThought();
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
	public void Interact(Player player) {
		System.out.println("You mindlessly start to sit on it, but the pulsating slime \n"
				+ "gives you the idea that maybe sitting on it would be a very bad idea.");
		spoilTheThought();

	}
	
	private void spoilTheThought() {
		this.shortDescription = "Very uncomfy";
		this.longDescription = "This is definitely not comfy looking anymore. In fact, you are quite repulsed by it now.";
	}

}
