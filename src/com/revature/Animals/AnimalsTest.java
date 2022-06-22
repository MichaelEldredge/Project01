package com.revature.Animals;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AnimalsTest {
	@Test 
	void testTest() {
		// assertTrue(false);
		assertTrue(true);
	}
	@Test
	void hippoEatTest() {
		Hippo hp = new Hippo();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Hippo eats 35 kg of grass.\n";
		hp.eat();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void hippoMakeNoiseTest() {
		Hippo hp = new Hippo();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin 
		String expectedOutput = "The Hippo honks.\n";
		hp.makeNoise();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void hippoSleepTest() {
		Hippo hp = new Hippo();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin 
		String expectedOutput = "The Hippo sleeps.\n";
		hp.sleep();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void hippoRoamTest() {
		Hippo hp = new Hippo();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin 
		String expectedOutput = "The Hippo roams.\n";
		hp.roam();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void hippoPictureTest() {
		Hippo hp = new Hippo();
		String expected = "";
		assertTrue(expected.equals(hp.getPicture()));
	}
	@Test
	void hippoBoundriesTest() {
		Hippo hp = new Hippo();
		String expected = "";
		assertTrue(expected.equals(hp.getBoundries()));
	}
	@Test
	void hippoLocationTest() {
		Hippo hp = new Hippo();
		String expected = "";
		assertTrue(expected.equals(hp.getLocation()));
	}
	@Test
	void dogEatTest() {
		Dog dg = new Dog();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Dog eats 1 cup of dog food.\n";
		dg.eat();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void dogMakeNoiseTest() {
		Dog dg = new Dog();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Dog barks.\n";
		dg.makeNoise();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void dogSleepTest() {
		Dog dg = new Dog();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Dog sleeps.\n";
		dg.sleep();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void dogRoamTest() {
		Dog dg = new Dog();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Dog walks.\n";
		dg.roam();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void dogPictureTest() {
		Dog dg = new Dog();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "";
		dg.getPicture();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void wolfEatTest() {
		Wolf wf = new Wolf();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Wolf eats 3 lbs of meat.\n";
		wf.eat();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void wolfMakeNoiseTest() {
		Wolf wf = new Wolf();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Wolf howls.\n";
		wf.makeNoise();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void catEatTest() {
		Cat ct = new Cat();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Cat eats 1/2 cup of cat food.\n";
		ct.eat();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void catRoamTest() {
		Cat ct = new Cat();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Cat prowls.\n";
		ct.roam();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
	@Test
	void catMakeNoiseTest() {
		Cat ct = new Cat();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		// Begin
		String expectedOutput = "The Cat mews.\n";
		ct.makeNoise();
		// End
		System.out.flush();
		System.setOut(old);
		assertTrue(expectedOutput.equals(baos.toString()));
	}
}
