import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testNegativeAge() {
        String result = Main.calculateAgeCategory(-2);
        assertEquals("Invalid", result);
    }

    @Test
    public void testChildAge() {
        String result = Main.calculateAgeCategory(6);
        assertEquals("Child", result);
    }

    @Test
    public void testTeenagerAge() {
        String result = Main.calculateAgeCategory(15);
        assertEquals("Teenager", result);
    }

    @Test
    public void testAdultAge() {
        String result = Main.calculateAgeCategory(40);
        assertEquals("Adult", result);
    }

    @Test
    public void testSeniorAge() {
        String result = Main.calculateAgeCategory(88);
        assertEquals("Senior", result);
    }

}