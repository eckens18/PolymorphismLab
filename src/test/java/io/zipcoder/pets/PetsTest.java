package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PetsTest {

    @Test
    public void speakTest() {
        Pets pets = new Pets();
        String expected = "I'm a Pet!";
        String actual = pets.speak();
        assertEquals("The test should return 'I'm a Pet!'",expected,actual);
    }

    @Test
    public void returnAnimalTest(){
        Pets pets = new Pets();
        Pets actual = pets.returnAnimal("tac","cat");
        String expectedName = "tac";
        String expectedType = "cat";
        String actualName = actual.getName();
        String actualType = actual.getType();
        assertEquals(expectedName,actualName);
        assertEquals(expectedName,actualName);

    }
}

