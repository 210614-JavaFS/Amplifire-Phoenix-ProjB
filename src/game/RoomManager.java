  
package game;

import fixtures.rooms.Bedroom;
import fixtures.rooms.FirstFloorBathroom;

import java.util.ArrayList;
import fixtures.rooms.Foyer;
import fixtures.rooms.Kitchen;
import fixtures.rooms.MasterBedroom;
import fixtures.rooms.Room;
import fixtures.rooms.Study;
import fixtures.rooms.UpstairsBathroom;
import fixtures.rooms.UpstairsHallway;
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
		MasterBedroom master = new MasterBedroom();
		Basement basement = new Basement();
		Kitchen kitchen = new Kitchen();
		UpstairsHallway upstairsHallway = new UpstairsHallway();
		FirstFloorBathroom dBathroom = new FirstFloorBathroom();

		foyer.addExit(study);
		foyer.addExit(upstairsHallway);
		study.addExit(foyer);
		//uBathroom.addExit(uBathroom);           PLEASE DON'T MAKE AN EXIT TO ITSELF
		bedroom.addExit(upstairsHallway); 
		foyer.addExit(dBathroom);
		dBathroom.addExit(foyer);
		//kitchen.addExit(diningRoom, livingRoom);
		basement.addExit(foyer);
		upstairsHallway.addExit(foyer);
		upstairsHallway.addExit(master);
		upstairsHallway.addExit(uBathroom);
		upstairsHallway.addExit(bedroom);
		master.addExit(upstairsHallway);
		uBathroom.addExit(upstairsHallway);           
		bedroom.addExit(upstairsHallway); 
		
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(bedroom);
		rooms.add(uBathroom);
		rooms.add(basement);
		rooms.add(kitchen);
		rooms.add(upstairsHallway);
		rooms.add(master);
		rooms.add(dBathroom);

		startingRoom = basement;
	}
	
	

	
}
