package game;

import java.util.Scanner;

import fixtures.objects.Ghost;
import fixtures.objects.Interactive;

public class Main {

	public static RoomManager roomManager = new RoomManager();
	public static Scanner scanner = new Scanner(System.in);
	
	private static int numberOfRoomsTraversed;
	
	public static void main(String[] args) {
	
		
		Player player = new Player();
		player.currentRoom = RoomManager.startingRoom;
		printRoom(player);
		do
		{
			String[] input = collectInput();
			parse(input, player);
		} while (player.willQuit == false);
		scanner.close();
	}
		
	
	
	
	
	private static void printRoom(Player player) {
		System.out.println("You are in the " + player.currentRoom.name + ".\n" + player.currentRoom.longDescription);
		System.out.println();
		int numberOfFeatures = player.currentRoom.roomFeatures.size();
		System.out.println("This room contains the following item" + (numberOfFeatures > 1? "s" : "") + ":");
	    for(int i = 0; i < numberOfFeatures; i++) {
				Interactive temp = player.currentRoom.roomFeatures.get(i);
				System.out.println(temp.printName() + " - " + temp.printShortDescription());
			}
	    System.out.println("");
	    System.out.println("Connected rooms: ");
			for(int i = 0; i < player.currentRoom.getNumExits(); ++i) {
				System.out.println(player.currentRoom.getExit(i).name + " - " + player.currentRoom.getExit(i).shortDescription);
			}
			System.out.println();
			System.out.println("Type \"enter [room]\", \"look [item]\", \"interact [item]\", or \"quit\".\n".toUpperCase());
		}
		
	private static void printItem(Interactive item) {
		System.out.println(item.printName() + " - " + item.printShortDescription());
		System.out.println("\n");
		System.out.println(item.printLongDescription());
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
		switch(command[0].toLowerCase()){
		// handles room switching
		case "enter":
			if(command.length < 2) {
				System.out.println("You need a room to enter. Trying entering a room");
				break;
			}			
			for(int i = 0; i < player.currentRoom.getNumExits(); ++i){
				if(player.currentRoom.getExit(i).name.toLowerCase().contains(command[1].toLowerCase())){
					numberOfRoomsTraversed++;
					player.currentRoom = player.currentRoom.getExit(i);
					if(numberOfRoomsTraversed == 3)
						player.currentRoom.addInteractive(new Ghost());
					
					printRoom(player);
					return;
				}
			}
		break;
		
		
		//handles item
		case "look":
			if(command.length < 2) {
				System.out.println("You need a target to look at. Trying looking at an object");
				break;
			}
			if (player.currentRoom.hasInteractive(command[1])) {
				printItem(player.currentRoom.getInteractive(command[1]));
			}
		break;
		
		case "interact":
			if(command.length < 2) {
				System.out.println("You need a target to interact with. Trying interacting with an object");
				break;
			}
			if(player.currentRoom.hasInteractive(command[1])) {
				player.currentRoom.interactWithInteractive(command[1], player);
			}
		break;
		
		case "":
			System.out.println();
			printRoom(player);
		break;
		
		case "quit":
			System.out.println("Exiting Program.");
			player.willQuit = true;
		break;
		default:
			System.out.println("Invalid Input");
		}	

	}
}