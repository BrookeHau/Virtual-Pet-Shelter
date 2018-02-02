package VirtualPetShelter;

import org.junit.Test;
import org.junit.Assert;


import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

public class VirtualShelterTest {

	@Test
	public void setup() {
		VirtualShelter underTest = new VirtualShelter();

	}

	@Test
	public void shouldAddPet() {
		VirtualShelter underTest = new VirtualShelter();
		VirtualPet pet = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		underTest.admitPet(pet);
		VirtualPet retrieved = underTest.findPet("Henry");
		assertThat(retrieved, is(pet));
	}

	@Test
	public void shouldAddMultiplePets() {
		VirtualShelter underTest = new VirtualShelter();
		VirtualPet pet = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		VirtualPet anotherPet = new VirtualPet("Woody", "dog", 5, 5, 5, 5);
		underTest.admitPet(pet);
		underTest.admitPet(anotherPet);
		int size = underTest.shelterSize();
		Assert.assertEquals(2, size);
	}

	@Test
	public void shouldRemovePet() {
		VirtualShelter underTest = new VirtualShelter();
		VirtualPet pet = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		VirtualPet anotherPet = new VirtualPet("Woody", "dog", 5, 5, 5, 5);
		underTest.admitPet(pet);
		underTest.adoptPet("Henry");
		VirtualPet found = underTest.findPet("Henry");
		assertThat(found, is(nullValue()));

	}
	
	@Test
	public void shouldFeedSpecificPet() {
		VirtualShelter underTest = new VirtualShelter();
		VirtualPet pet = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		underTest.feedSpecificPet(pet);
		int hunger = underTest.getHunger(pet);
		Assert.assertEquals(3, hunger);

	}
}
