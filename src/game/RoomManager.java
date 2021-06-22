package game;

import java.util.ArrayList;

import fixtures.rooms.Foyer;
import fixtures.rooms.Room;
import fixtures.rooms.Study;

public class RoomManager {
	public static Room startingRoom;
	public static ArrayList<Room> rooms = new ArrayList<>();

	RoomManager()
	{
		Foyer foyer =  new Foyer();
		Study study = new Study();
		Room[] foyerExits = {study};
		Room[] studyExits = {foyer};
		foyer.addExit(study);
		study.addExit(foyer);
		rooms.add(foyer);
		rooms.add(study);
		startingRoom = foyer;
	}
	

	
}
