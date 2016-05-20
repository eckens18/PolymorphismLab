package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    @Test
    public void speakTest(){
        Bird bird = new Bird();
        String expected = "Cheep";
        String actual = bird.speak();
        assertEquals("Should return 'Cheep'",expected,actual);

    }
}
