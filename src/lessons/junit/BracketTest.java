package lessons.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketTest {

    Bracket bracket = new Bracket();

    @Test
    public void testBalancedBrackets(){
        assertTrue(bracket.isBalanced("{[()]}()"));
    }

    @Test
    public void testUnbalancedBrackets(){
        assertFalse(bracket.isBalanced("{[(])}()"));
    }

    @Test
    public void testEmptyString(){
        assertTrue(bracket.isBalanced(""));
    }


}