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
		System.out.println();
		int numberOfFeatures = player.currentRoom.roomFeatures.size();
		System.out.println("This room contains the following item" + (numberOfFeatures > 1? "s" : "") + ":");
	    for(int i = 0; i < numberOfFeatures; i++) {
				Interactive temp = player.currentRoom.roomFeatures.get(i);
				System.out.println(temp.printName() + " - " + temp.printShortDescription());
			}
	    System.out.println("");
	    System.out.println("Exits: ");
			for(int i = 0; i < player.currentRoom.getNumExits(); ++i) {
				System.out.println(player.currentRoom.getExit(i).name + " - " + player.currentRoom.getExit(i).shortDescription  + "\n");
			}
			System.out.println("Type \"enter [exit]\", \"look [item]\", \"interact [item]\", or \"quit\".\n");
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
		switch(command[0].toLowerCase())
		{
		// handles room switching
		case "enter":
			for(int i = 0; i < player.currentRoom.getNumExits(); ++i)	
			{
				if(player.currentRoom.getExit(i).name.contains(command[1].toLowerCase()))
				{
								player.currentRoom = player.currentRoom.getExit(i);
								printRoom(player);
								return;
				}
			}
		break;
		
		
		//handles item
		case "look":
			if (player.currentRoom.hasInteractive(command[1])) {
				printItem(player.currentRoom.getInteractive(command[1]));
			}
		break;
		
		case "interact":
			if(player.currentRoom.hasInteractive(command[1])) {
				player.currentRoom.interactWithInteractive(command[1]);
			}
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