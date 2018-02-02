package VirtualPetShelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public void admitPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public int shelterSize() {
		return pets.size();
	}

}
