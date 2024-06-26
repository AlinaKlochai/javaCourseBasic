package lessons.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCountFromTextTest {

    LetterCountFromText count = new LetterCountFromText();

    @Test
    void testCountLetter() {
        assertEquals(3,count.countLetter("Hello World"));
    }

    @Test
    void testCountLetterZero() {
        assertEquals(0,count.countLetter("Hbnhtjrwx"));
    }

    @Test
    void testCountLetterEmpty() {
        assertEquals(0,count.countLetter(""));
    }


}