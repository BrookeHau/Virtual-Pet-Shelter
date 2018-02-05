package VirtualPetShelter;

public class VirtualPet {

	private String petName;
	private int petHunger;
	private int petThirst;
	private int petBoredom;
	private int petBathroom;
	private String description;

	public VirtualPet(String petName, String description, int petHunger, int petThirst, int petBoredom,
			int petBathroom) {

		this.petName = petName;
		this.description = description;
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBoredom = petBoredom;
		this.petBathroom = petBathroom;

	}

	public VirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
		this.petHunger = 5;
		this.petThirst = 5;
		this.petBoredom = 5;
		this.petBathroom = 5;
	}

	public void feedPet() {
		petHunger -= 2;
		petThirst += 1;
		petBathroom += 2;

	}

	public int getHunger() {
		return petHunger;
	}

	public String showNameDesc() {
		return petName + " the " + description + ".";
	}

	@Override
	public String toString() {
		return petName + " the " + description + " has hunger of " + petHunger + ", thirst of " + petThirst
				+ ", boredom of " + petBoredom + ", and bathroom of " + petBathroom + ".";
	}

	public int getBathroom() {
		return petBathroom;
	}

	public int getThirst() {
		return petThirst;
	}

	public int getBoredom() {
		return petBoredom;
	}

	public void waterPet() {
		petHunger -= 1;
		petThirst -= 2;
		petBathroom += 2;
	}

	public void playWithPet() {
		petThirst += 2;
		petBoredom -= 3;
		petHunger += 1;
	}

	public void tick() {
		petHunger += 3;
		petThirst += 4;
		petBoredom -= 2;
		petBathroom += 4;
	}

	public String getName() {
		return petName;
	}

	public void takePetToBathroom() {
		petBathroom -= 3;
	}

}
