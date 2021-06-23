package game;

import fixtures.rooms.Bedroom;
import java.util.ArrayList;
import fixtures.rooms.Foyer;
import fixtures.rooms.Room;
import fixtures.rooms.Study;
import fixtures.rooms.UpstairsBathroom;

import fixtures.rooms.Basement;
import fixtures.rooms.Bedroom;

public class RoomManager {
	public static Room startingRoom;
	public static ArrayList<Room> rooms = new ArrayList<>();

	RoomManager()
	{
		Foyer foyer =  new Foyer();
		Study study = new Study();
		Bedroom bedroom = new Bedroom();
		UpstairsBathroom uBathroom = new UpstairsBathroom();

		Basement basement = new Basement();

		foyer.addExit(study);
		study.addExit(foyer);
		//uBathroom.addExit(uBathroom);           PLEASE DON'T MAKE AN EXIT TO ITSELF
		//bedroom.addExit(secondBedroom, secondBathroom); 
		//basement.addExit(firstFloorHall);
		
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(bedroom);
		rooms.add(uBathroom);
		rooms.add(basement);

		startingRoom = foyer;
	}
	
	

	
}
