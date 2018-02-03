package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualShelter myPets = new VirtualShelter();
		
		System.out.println("Thank you for volunteering at Brooke's pet shop!");
		System.out.println("This is the status of your pets:");
		System.out.println();
		for(VirtualPet pet: myPets.showPets()){
			System.out.println(pet);
		}
		
		System.out.println("What would you like to do next?");
		System.out.println("Press 1 to feed a pet");
		System.out.println("Press 2 to water a pet");
		System.out.println("Press 3 to play with a pet");
		System.out.println("Press 4 to take the pet to the bathroom");
		System.out.println("Press 5 to adopt a pet");
		System.out.println("Press 6 to admit a pet");
		System.out.println("Press 0 to quit");
		String optionEntered = input.nextLine();
		
		if(optionEntered.equals("0")){
			System.out.println("Thank you for playing!  See you soon!");
			System.exit(0);
		}		
		
		
	
	}

}
