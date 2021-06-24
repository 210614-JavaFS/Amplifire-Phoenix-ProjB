package fixtures.objects;

import fixtures.Fixture;
import game.Player;

public class FrontDoor extends Fixture implements Interactive {


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
	
	public FrontDoor()
	{
		super("front door", "The entrance to the house.", "You see a heavy door, for some inexplicable reason you need a key to open it from the inside.");
	}

	@Override
	public void Interact(Player player) {
		if(player.hasKey == true)
		{
		System.out.println("You open the door and leave the house.");
		System.out.println("Congrats! You've made it out alive!");
		player.willQuit = true;
		}
		else
		{
			System.out.println("You try to open the door but it won't budge.");
			
		}
		
	}
}
