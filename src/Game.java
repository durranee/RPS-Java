import java.util.Scanner;


public class Game {

	
	public static void main (String[] args){
		System.out.println("hello again world");
		String choice = getInput();
		System.out.println("You entered " + choice + ".");
	}
	
	static String getInput(){
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter your choice, type \'Rock\', \'Paper\' or \'Scissors\': ");
		String userInput = input.next();
		
		return userInput;
	}
}
