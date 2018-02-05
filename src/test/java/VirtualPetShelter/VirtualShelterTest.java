package VirtualPetShelter;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

public class VirtualShelterTest {

	private VirtualPet testPet = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
	private VirtualShelter shelterUnderTest = new VirtualShelter();
	private VirtualPet anotherPet = new VirtualPet("Woody", "dog", 5, 5, 5, 5);

	@Before
	public void clearList() {
		shelterUnderTest.clear();
	}

	@Test
	public void getFullPetInfo() {
		shelterUnderTest.admitPet(testPet);
		String info = shelterUnderTest.getFullPetInfo("Henry");
		Assert.assertEquals("Henry the dog has hunger of 5, thirst of 5, boredom of 5, and bathroom of 5.", info);
	}

	@Test
	public void getPartialPetInfo() {
		shelterUnderTest.admitPet(testPet);
		String info = shelterUnderTest.getNameDesc("Henry");
		Assert.assertEquals("Henry the dog.", info);
	}

	@Test
	public void showAllPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		Collection<VirtualPet> pets = shelterUnderTest.showPets();
		assertThat(pets, containsInAnyOrder(testPet, anotherPet));
	}

	@Test
	public void shouldAddPet() {
		shelterUnderTest.admitPet(testPet);
		VirtualPet retrieved = shelterUnderTest.findPet("Henry");
		assertThat(retrieved, is(testPet));
	}

	@Test
	public void shouldAddMultiplePets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		int size = shelterUnderTest.shelterSize();
		Assert.assertEquals(2, size);
	}

	@Test
	public void shouldRemovePet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.adoptPet("Henry");
		VirtualPet found = shelterUnderTest.findPet("Henry");
		assertThat(found, is(nullValue()));

	}

	@Test
	public void shouldFeedSpecificPet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.feedSpecificPet("Henry");
		int hunger = shelterUnderTest.getPetHunger("Henry");
		Assert.assertEquals(3, hunger);
	}

	@Test
	public void shouldWaterSpecificPet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.waterSpecificPet("Henry");
		int thirst = shelterUnderTest.getPetThirst("Henry");
		Assert.assertEquals(3, thirst);
	}

	@Test
	public void shouldPlaySpecificPet() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.playSpecificPet("Henry");
		int boredom = shelterUnderTest.getPetBoredom("Henry");
		Assert.assertEquals(2, boredom);
	}

	@Test
	public void shouldTakePetToBathroom() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.takeSpecificPettoBathroom("Henry");
		int bathroom = shelterUnderTest.getPetBathroom("Henry");
		Assert.assertEquals(2, bathroom);
	}

	@Test
	public void feedAllPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		shelterUnderTest.feedAllPets();
		int hunger = shelterUnderTest.getPetHunger("Henry");
		int thirst = shelterUnderTest.getPetThirst("Woody");
		Assert.assertEquals(3, hunger);
		Assert.assertEquals(6, thirst);
	}

	@Test
	public void waterAllPets() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		shelterUnderTest.waterAllPets();
		int hunger = shelterUnderTest.getPetHunger("Henry");
		int thirst = shelterUnderTest.getPetThirst("Woody");
		Assert.assertEquals(4, hunger);
		Assert.assertEquals(3, thirst);
	}

	@Test
	public void useTick() {
		shelterUnderTest.admitPet(testPet);
		shelterUnderTest.admitPet(anotherPet);
		shelterUnderTest.calltick();
		int hunger = shelterUnderTest.getPetHunger("Henry");
		int bathroom = shelterUnderTest.getPetBathroom("Henry");
		int thirst = shelterUnderTest.getPetThirst("Woody");
		int boredom = shelterUnderTest.getPetBoredom("Woody");
		Assert.assertEquals(9, bathroom);
		Assert.assertEquals(9, thirst);
		Assert.assertEquals(3, boredom);
		Assert.assertEquals(8, hunger);
	}

}
