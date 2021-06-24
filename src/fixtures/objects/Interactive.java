package fixtures.objects;

import game.Player;

public interface Interactive {
	
	public String printLongDescription(); 
	public String printShortDescription();
	public String printName();
	
	public void Interact(Player player);

}