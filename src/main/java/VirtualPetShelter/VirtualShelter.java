package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualShelter() {
		pets.put("Henry", new VirtualPet("Henry", "dog with an old soul, and a charmer", 5, 4, 7, 3));
		pets.put("Woody", new VirtualPet("Woody", "energetic and playful dog", 2, 4, 4, 6));
		pets.put("Kitty", new VirtualPet("Kitty", "cat that loves to play fetch", 3, 3, 5, 4));
		pets.put("Leigh Ann", new VirtualPet("Leigh Ann", "teacup pig", 5, 4, 7, 3));
	}

	public void admitPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public int shelterSize() {
		return pets.size();
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void feedSpecificPet(String petName) {
		pets.get(petName).feedPet();
	}

	public int getPetHunger(String pet) {
		return pets.get(pet).getHunger();
	}

	public void waterSpecificPet(String pet) {
		pets.get(pet).waterPet();
	}

	public int getPetThirst(String pet) {
		return pets.get(pet).getThirst();
	}

	public void playSpecificPet(String pet) {
		pets.get(pet).playWithPet();
	}

	public int getPetBoredom(String pet) {
		return pets.get(pet).getBoredom();
	}

	public void takeSpecificPettoBathroom(String pet) {
		pets.get(pet).takePetToBathroom();
	}

	public int getPetBathroom(String pet) {
		return pets.get(pet).getBathroom();
	}

	public String getFullPetInfo(String testPet) {
		return pets.get(testPet).toString();
	}

	public String getNameDesc(String pet) {
		return pets.get(pet).showNameDesc();
	}

	public Collection<VirtualPet> showPets() {
		return pets.values();
	}

	public void clear() {
		pets.clear();
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
		}
	}

	public void calltick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}

	}

}
