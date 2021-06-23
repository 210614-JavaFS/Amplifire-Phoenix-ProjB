package fixtures.rooms;

import fixtures.objects.Skeleton;

public class Basement extends Room{
	
	public Basement() {
		super("Basement", "A dark dusty basement", "You are in a large dimmly lit room, with everything around you covered in dust. "
				+ "On the otherside of the room you can see some stairs leading to the floor above.");
		this.addInteractive(new Skeleton());

	}

}
