package fixtures.rooms;

import fixtures.objects.FlyingBed;

public class MasterBedroom extends Room{
	
	public MasterBedroom() {
		super("Master Bedroom","A fairly empty Master Bedroom",
				" Behind you,to the west, is the door you came in from which leads to the second floor hallway.\n" +
				" In front of you to the east there is a window. It seems there are bars outside making it imposible to escape from here.\n"
				+" To your right to the south there is a bed.. It looks there is something underneath the bed. BE CAREFUL!\n"
				);
		this.addInteractive(new FlyingBed());
		
			}
}
