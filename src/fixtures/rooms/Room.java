package fixtures.rooms;

import java.util.ArrayList;

import fixtures.Fixture;
import fixtures.objects.Interactive;

public abstract class Room extends Fixture{

	private ArrayList<Room> Exits;
	public ArrayList<Interactive> roomFeatures;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		roomFeatures = new ArrayList<Interactive>();
		Exits = new ArrayList<Room>();
	}

	public ArrayList<Room> getExits() {
		return Exits;
	}
		
	//Returns a Room object given the index of the
	public Room getExit(int choice) {
		return Exits.get(choice);
	}
	
	//Returns a ROom object given the name of the Room.
	//This method assumes that the room is
	public Room getExit(String roomName) {
		Room room = null;
		Room tempRooms;
		for(int i = 0; i < Exits.size(); i++) {
			tempRooms = Exits.get(i);
			if (tempRooms.name.contains(roomName)) {
				return tempRooms;
			}
		}
		
		//TODO: Make this a proper exception thrown, 
		//		otherwise this code will break if it meets this error 
		//		and this will be the only hint as to why
		System.out.println("ERROR: Could not find room");
		return room;
	}
	
	public int getNumExits() {
		return Exits.size();
	}
	
	
	
	//Adds an exit to the arraylist Exits
	public void addExit(Room exit) {
		Exits.add(exit);
	}
	
	public void addInteractive(Interactive item) {
		roomFeatures.add(item);
	}

	public boolean hasInteractive(String itemName) {
		for(int i = 0; i < roomFeatures.size(); i++) {
			if (roomFeatures.get(i).printName().equals(itemName))
				return true;
		}
		return false;
	}
	
	
	public Interactive getInteractive(String itemName) {
		
		for(int i = 0; i < roomFeatures.size(); i++) {
			if (roomFeatures.get(i).printName().equals(itemName))
				return roomFeatures.get(i);
		}
		System.out.println("ERROR: We could not find that item");
		return null;
	}
}
