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
				System.out.println("Which pet would you like to feed? Or type 'all' to feed all pets");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petFeed = input.nextLine();
				if (petFeed.equalsIgnoreCase("all")) {
					myPets.feedAllPets();
					System.out.println("Thanks for feeding all the pets! Here's their current status: ");
					for (VirtualPet pet : myPets.showPets()) {
						System.out.println(" - " + pet);
					}

				} else {
					myPets.feedSpecificPet(petFeed);
					System.out.println("Thanks for feeding " + petFeed + "!\nHere's their current status: "
							+ myPets.getFullPetInfo(petFeed));
				}

			}
			if (optionEntered.equals("2")) {
				System.out.println("Which pet would you like to water? Or type 'all' to water all pets");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petWater = input.nextLine();
				if (petWater.equalsIgnoreCase("all")) {
					myPets.waterAllPets();
					System.out.println("Thanks for watering all the pets! Here's their current status: ");
					for (VirtualPet pet : myPets.showPets()) {
						System.out.println(" - " + pet);
					}
				} else {
					myPets.waterSpecificPet(petWater);
					System.out.println("Thanks for watering " + petWater + "!\nHere's their current status: "
							+ myPets.getFullPetInfo(petWater));
				}

			}
			if (optionEntered.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String playPet = input.nextLine();
				myPets.playSpecificPet(playPet);
				System.out.println("Thanks for playing with " + playPet + "!\nHere's their current status: "
						+ myPets.getFullPetInfo(playPet));
			}
			if (optionEntered.equals("4")) {
				System.out.println("Which pet would you like to take to the bathroom?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String petBathroom = input.nextLine();
				myPets.takeSpecificPettoBathroom(petBathroom);
				System.out.println("Thanks for taking  " + petBathroom
						+ " to the bathroom!\nHere's their current status: " + myPets.getFullPetInfo(petBathroom));
			}
			if (optionEntered.equals("5")) {
				System.out.println("Which pet would you like to adopt?");
				for (VirtualPet pet : myPets.showPets()) {
					System.out.println("- " + pet);
				}
				String adoptPet = input.nextLine();
				System.out.println("Thank you for adopting " + myPets.getNameDesc(adoptPet));
				myPets.adoptPet(adoptPet);
			}
			if (optionEntered.equals("6")) {
				System.out.println("Enter the name of the pet you'd like to admit:");
				String admitName = input.nextLine();
				System.out.println("Enter the description of the pet:");
				String admitDesc = input.nextLine();
				myPets.admitPet(new VirtualPet(admitName, admitDesc));
				System.out.println("Thank you for admitting " + admitName + "! Here is their current status "
						+ myPets.getFullPetInfo(admitName));
			}
			myPets.calltick();
		} while (!(optionEntered.equals("0")));
		System.out.println("Thank you for playing, come back soon!");
		System.exit(0);

	}
}
