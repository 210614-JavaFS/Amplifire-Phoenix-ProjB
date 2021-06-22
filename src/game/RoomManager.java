package game;

import fixtures.rooms.Bedroom;
import fixtures.rooms.Foyer;
import fixtures.rooms.Room;
import fixtures.rooms.Study;

public class RoomManager {
	public static Room startingRoom;
	public static Room[] rooms = new Room[9];

	RoomManager()
	{
		Foyer foyer =  new Foyer();
		Study study = new Study();
		Bedroom bedroom = new Bedroom();
		Room[] foyerExits = {study};
		Room[] studyExits = {foyer};
		//Room[] bedroomExits = {bathroom, otherBedroom};
		foyer.setExits(foyerExits);
		study.setExits(studyExits);
		//bedroom.setExits(bedroomExits);
		rooms[0] = foyer;
		rooms[1] = study;
		rooms[8] = bedroom;
		startingRoom = foyer;
	}
	

	
}
