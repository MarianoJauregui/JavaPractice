import generalPractices.codewars.kyu7.Fighter;
import generalPractices.codewars.kyu7.TwoFightersOneWinner;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("Lew", TwoFightersOneWinner.declareWinner
                (new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));

        assertEquals("Harry", TwoFightersOneWinner.declareWinner
                (new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));

        assertEquals("Harald", TwoFightersOneWinner.declareWinner
                (new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));

        assertEquals("Harald", TwoFightersOneWinner.declareWinner
                (new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));

        assertEquals("Harald", TwoFightersOneWinner.declareWinner
                (new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));

        assertEquals("Harald", TwoFightersOneWinner.declareWinner
                (new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}
