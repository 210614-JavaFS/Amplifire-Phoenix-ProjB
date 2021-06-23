package game;


import fixtures.rooms.Bedroom;
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
		Bedroom bedroom = new Bedroom();
		Room[] foyerExits = {study};
		Room[] studyExits = {foyer};
		//Room[] bedroomExits = {secondBedroom, secondBathroom};

		foyer.addExit(study);
		study.addExit(foyer);
		//bedroom.addExit(secondBedroom, secondBathroom); 
		rooms.add(foyer);
		rooms.add(study);
		rooms.add(bedroom);

		startingRoom = foyer;
	}
	

	
}
