package fixtures.rooms;

import fixtures.objects.BrokenMirror;

public class FirstFloorBathroom extends Room {

	public FirstFloorBathroom() {
		super(
				"Bathroom", 
				"A dirty and unkept bathroom", 
				"A small and moldy bathroom. The bathtub and toilet's are cracked and covered in mildew and fungi. They don't seem like they are usable anymore.\n"
				+ "There is a sink attached to the wall with "
		);
		
		this.addInteractive(new BrokenMirror());
		this.longDescription = this.longDescription + this.getInteractive("mirror").printName().toLowerCase() + ".";
		
	}

}
