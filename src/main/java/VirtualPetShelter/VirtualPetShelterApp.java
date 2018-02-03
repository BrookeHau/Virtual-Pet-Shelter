package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualShelter myPets = new VirtualShelter();
		String optionEntered;

		System.out.println("Thank you for volunteering at Brooke's pet shelter!");

		do {
			System.out.println("This is the status of your pets:");
			System.out.println();
			for (VirtualPet pet : myPets.showPets()) {
				System.out.println("- " + pet);
			}
			System.out.println();
			System.out.println("What would you like to do next?");
			System.out.println("Press 1 to feed a pet");
			System.out.println("Press 2 to water a pet");
			System.out.println("Press 3 to play with a pet");
			System.out.println("Press 4 to take the pet to the bathroom");
			System.out.println("Press 5 to adopt a pet");
			System.out.println("Press 6 to admit a pet");
			System.out.println("Press 0 to quit");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				System.out.println("Which pet would you like to feed?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petFeed = input.nextLine();
				myPets.feedSpecificPet(petFeed);
			}
			if (optionEntered.equals("2")) {
				System.out.println("Which pet would you like to water?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petWater = input.nextLine();
				myPets.waterSpecificPet(petWater);
			}
			if (optionEntered.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String playPet = input.nextLine();
				myPets.playSpecificPet(playPet);
			}
			if (optionEntered.equals("4")) {
				System.out.println("Which pet would you like to take to the bathroom?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petBathroom = input.nextLine();
				myPets.takeSpecificPettoBathroom(petBathroom);
			}
			if (optionEntered.equals("5")) {
				System.out.println("Which pet would you like to adopt?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String adoptPet = input.nextLine();
				myPets.adoptPet(adoptPet);
				System.out.println("Thank you for adopting " + adoptPet);
			}
			if (optionEntered.equals("6")) {
				System.out.println("Enter the name of the pet you'd like to admit:");
				String admitName = input.nextLine();
				System.out.println("Enter the description of the pet:");
				String admitDesc = input.nextLine();
				myPets.admitPet(new VirtualPet(admitName, admitDesc));
				System.out.println("Thank you for adopting " + admitName);
			}
			myPets.calltick();
		} while (!(optionEntered.equals("0")));
		System.out.println("Thank you for playing, come back soon!");
		System.exit(0);

		// for(VirtualPet pet:myPets.showPets())
		// {
		// System.out.println("- " + pet);
		//
		// }

	}
}
