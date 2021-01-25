package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void multipleUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void unevenNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void balancedBracketsWithTextAfterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsWithTextBeforeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void balancedBracketsWithTextBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedBracketsWithTextBeforeAndAfterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[unchCo]de"));
    }

    @Test
    public void unbalancedBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("La]unchCo[de"));
    }

    /*
     * Note: the following instructions: "That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest." brought me to this test, but the answer key says
     * that this test should instead return true. Up to the student how they want to interpret.
     */
    @Test
    public void nestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

}
