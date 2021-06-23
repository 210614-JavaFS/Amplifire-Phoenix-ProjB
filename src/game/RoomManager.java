package game;

import java.util.ArrayList;

import fixtures.rooms.Foyer;
import fixtures.rooms.Room;
import fixtures.rooms.Study;
import fixtures.rooms.UpstairsBathroom;

public class RoomManager {
	public static Room startingRoom;
	public static ArrayList<Room> rooms = new ArrayList<>();

	RoomManager()
	{
		Foyer foyer =  new Foyer();
		Study study = new Study();
		UpstairsBathroom uBathroom = new UpstairsBathroom();
		Room[] foyerExits = {study};
		Room[] studyExits = {foyer};
		Room[] uBathroomExits = {uBathroom};
		foyer.addExit(study);
		study.addExit(foyer);
		uBathroom.addExit(uBathroom);
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(uBathroom);
		startingRoom = foyer;
	}
	

	
}
