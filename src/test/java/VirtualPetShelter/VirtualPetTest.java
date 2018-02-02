package VirtualPetShelter;

import org.junit.Test;
import org.junit.Assert;


public class VirtualPetTest {

	@Test
	public void shouldmakeClass() {
		VirtualPet underTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldIncreaseHungerBy2() {
		VirtualPet underTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		underTest.feedPet();
		int hunger = underTest.getHunger();
		Assert.assertEquals(3, hunger);
	}

	@Test
	public void changeBathroomAndThirst() {
		VirtualPet underTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		underTest.feedPet();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		Assert.assertEquals(7, bathroom);
		Assert.assertEquals(6, thirst);
		Assert.assertEquals(5, boredom);
	}

	@Test
	public void changesForWateringPet() {
		VirtualPet underTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		underTest.waterPet();
		int hunger = underTest.getHunger();
		int bathroom = underTest.getBathroom();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		Assert.assertEquals(7, bathroom);
		Assert.assertEquals(3, thirst);
		Assert.assertEquals(5, boredom);
		Assert.assertEquals(4, hunger);		
	}

	@Test
	public void shouldPrintFullPetInfo() {
		VirtualPet underTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		String printString = underTest.toString();
		Assert.assertEquals("Henry dog 5 5 5 5", printString);
	}
	
	@Test 
	public void changesForPlay(){
		VirtualPet petTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		petTest.playWithPet();
		int hunger = petTest.getHunger();
		int bathroom = petTest.getBathroom();
		int thirst = petTest.getThirst();
		int boredom = petTest.getBoredom();
		Assert.assertEquals(5, bathroom);
		Assert.assertEquals(7, thirst);
		Assert.assertEquals(2, boredom);
		Assert.assertEquals(6, hunger);
	}
	
	@Test
	public void changesForTick(){
		VirtualPet petTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		petTest.tick();
		int hunger = petTest.getHunger();
		int bathroom = petTest.getBathroom();
		int thirst = petTest.getThirst();
		int boredom = petTest.getBoredom();
		Assert.assertEquals(9, bathroom);
		Assert.assertEquals(9, thirst);
		Assert.assertEquals(3, boredom);
		Assert.assertEquals(8, hunger);
	}
	
	@Test
	public void getName(){
		VirtualPet petTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
		String name = petTest.getName();
		Assert.assertEquals("Henry", name);
	}
	
//	@Test
//	public void getOverallHealth(){
//		VirtualPet petTest = new VirtualPet("Henry", "dog", 5, 5, 5, 5);
//	String health = petTest.getHealth();
//	Assert.assertEquals("Feeling so so", health);
//	}
}
