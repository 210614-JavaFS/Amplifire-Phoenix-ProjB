package game;

import fixtures.rooms.Bedroom;
import java.util.ArrayList;
import fixtures.rooms.Foyer;
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
		UpstairsHallway upstairsHallway = new UpstairsHallway();

		foyer.addExit(study);
		foyer.addExit(upstairsHallway);
		study.addExit(foyer);
		//uBathroom.addExit(uBathroom);           PLEASE DON'T MAKE AN EXIT TO ITSELF
		bedroom.addExit(upstairsHallway); 
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
		rooms.add(upstairsHallway);
		rooms.add(master);

		startingRoom = basement;
	}
	
	

	
}
