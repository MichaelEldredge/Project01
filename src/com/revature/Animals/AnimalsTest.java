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
		assertTrue(expected.equals(hp.picture));
	}
	@Test
	void hippoBoundriesTest() {
		Hippo hp = new Hippo();
		String expected = "";
		assertTrue(expected.equals(hp.boundries));
	}
	@Test
	void hippoLocationTest() {
		Hippo hp = new Hippo();
		String expected = "";
		assertTrue(expected.equals(hp.location));
	}
}
