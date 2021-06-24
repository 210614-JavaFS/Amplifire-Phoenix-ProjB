  
package game;

import fixtures.rooms.Bedroom;
import fixtures.rooms.Dining;
import fixtures.rooms.FirstFloorBathroom;

import java.util.ArrayList;
import fixtures.rooms.Foyer;
import fixtures.rooms.Kitchen;
import fixtures.rooms.LivingRoom;
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
		LivingRoom livingRoom = new LivingRoom();
		Dining diningRoom = new Dining();

		foyer.addExit(study);
		foyer.addExit(upstairsHallway);
		study.addExit(foyer);
		bedroom.addExit(upstairsHallway); 
		foyer.addExit(dBathroom);
		foyer.addExit(diningRoom);
		dBathroom.addExit(foyer);
		kitchen.addExit(diningRoom);
		basement.addExit(foyer);
		upstairsHallway.addExit(foyer);
		upstairsHallway.addExit(bedroom);
		upstairsHallway.addExit(master);
		upstairsHallway.addExit(uBathroom);
		master.addExit(upstairsHallway);
		livingRoom.addExit(kitchen);
		livingRoom.addExit(foyer);
		foyer.addExit(livingRoom);
		kitchen.addExit(livingRoom);
		uBathroom.addExit(upstairsHallway);           
		bedroom.addExit(upstairsHallway); 
		diningRoom.addExit(kitchen);
		diningRoom.addExit(foyer);
		foyer.addExit(basement);
		
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(bedroom);
		rooms.add(uBathroom);
		rooms.add(basement);
		rooms.add(kitchen);
		rooms.add(upstairsHallway);
		rooms.add(master);
		rooms.add(dBathroom);
		rooms.add(diningRoom);

		startingRoom = basement;
	}
	
	

	
}
