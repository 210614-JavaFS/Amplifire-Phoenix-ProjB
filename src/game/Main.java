package game;

import java.util.Scanner;

import fixtures.objects.Interactive;

public class Main {

	public static RoomManager roomManager = new RoomManager();
	public static boolean willQuit = false;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		Player player = new Player();
		player.currentRoom = RoomManager.startingRoom;
		printRoom(player);
		do
		{
			
			String[] input = collectInput();
			parse(input, player);
		} while (willQuit == false);
		scanner.close();
	}
		
	
	
	
	
	private static void printRoom(Player player) {
		System.out.println("You are in the " + player.currentRoom.name + ".\n" + player.currentRoom.longDescription);
    for(int i = 0; i < player.currentRoom.roomFeatures.size(); i++) {
			Interactive temp = player.currentRoom.roomFeatures.get(i);
			System.out.println("This room contains the following item(s) - " + temp.printName() + ": " + temp.printShortDescription());
		}
		for(int i = 0; i < player.currentRoom.getNumExits(); ++i)
		{
			System.out.println(player.currentRoom.getExit(i).name + ": " + player.currentRoom.getExit(i).shortDescription  + "\n");
		}
		System.out.println("Type 'enter [exit]', 'item', or 'quit'.\n");
	}

	
	
	private static String[] collectInput() {
		
		String temp = scanner.nextLine();
		
		if(temp.indexOf(' ') != -1)
		{
		return temp.split(" ");
		} else
		{
			String[] temp2 = {temp};
			return temp2;
		}
	}
		
	
	
	
	private static void parse(String[] command, Player player) {
		// gets first string
		switch(command[0])
		{
		// handles room switching
		case "enter":
			for(int i = 0; i < player.currentRoom.getNumExits(); ++i)	
			{
				if(command[1].equals(player.currentRoom.getExit(i).name))
				{
								player.currentRoom = player.currentRoom.getExit(i);
								printRoom(player);
								return;
				}
			}
		break;
		//handles item
		case "item":
			System.out.println(player.currentRoom.roomFeatures.get(0).printLongDescription() + "\n");
		break;
		case "quit":
			System.out.println("Exiting Program.");
			willQuit = true;
		break;
		default:
			System.out.println("Invalid Input");
		}	

	}
}