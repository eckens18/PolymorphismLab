package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void speakTest(){
        Cat cat = new Cat();
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("Should return 'Meow'",expected,actual);
    }
}
