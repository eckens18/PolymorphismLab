package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void speakTest(){
        Dog dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();
        assertEquals("Should return 'Woof'",expected,actual);
    }
}
