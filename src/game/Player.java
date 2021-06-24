package game;

import fixtures.rooms.Room;

public class Player {

	public boolean hasKey;
	public boolean willQuit;
	Room currentRoom;
	Player(){
		currentRoom = RoomManager.startingRoom;
		hasKey = false;
		willQuit = false;
	}
	
}
