package game;

import fixtures.rooms.Bedroom;
import java.util.ArrayList;
import fixtures.rooms.Foyer;
import fixtures.rooms.Kitchen;
import fixtures.rooms.Room;
import fixtures.rooms.Study;
import fixtures.rooms.UpstairsBathroom;
import fixtures.rooms.Basement;

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
		Kitchen kitchen = new Kitchen();

		foyer.addExit(study);
		study.addExit(foyer);
		//uBathroom.addExit(uBathroom);           PLEASE DON'T MAKE AN EXIT TO ITSELF
		//bedroom.addExit(UpstairsBedroom, UpstairsBathroom); 
		//basement.addExit(firstFloorHall);
		//kitchen.addExit(diningRoom, livingRoom);
		
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(bedroom);
		rooms.add(uBathroom);
		rooms.add(basement);
		rooms.add(kitchen);

		startingRoom = foyer;
	}
	
	

	
}
