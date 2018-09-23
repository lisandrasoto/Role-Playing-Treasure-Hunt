/*
*File: RolePlayingGame.java
*Author: Lisandra Soto
*Purpose: To develop a game using the swicth function
*User can Input N,E,S and W.
*/

import java.util.Scanner;

public class RolePlayingGame {	
    public static void main(String[] args)  { 	

System.out.println("Tresure Hunt Pirate Role Playing Game");

char direction = 'N';
 Scanner scannerIn = new Scanner(System.in);

System.out.println("Enter the Direction to find yourself to paradise (N,E,S,W):");
direction = scannerIn.next().charAt(0);


switch (direction) {
	  case 'N': case 'n':
		System.out.println("Head south to see");
		System.out.println("Who lives in a pinapple under the sea");
		break;
	case 'E': case 'e': 
		System.out.println("You should have ran south");
		System.out.println("This area is haunted");
		System.out.println("Go before you have to stay forever");
		break;
	case '7': case 's':
		System.out.println("You Made it !");
		System.out.println("The Promise Land!");
		break;		
	case 'W': case 'w':
		System.out.println("Why dont you head east huh?");
		System.out.println("Heard good things await you when you try again");
		break;	
	default:
		System.out.println("Please enter a valid entry (N,E,S,W)");
	}
		

    }
}
