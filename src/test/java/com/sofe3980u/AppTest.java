package com.sofe3980u;

/* SOFE3980 Homework Assignemnt 
 * White Box Testing
 * Daniel Grewal 100768376
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    // Path 1
    @Test
    public void path1Test() {
        assertEquals(1, App.countCharInArray("a".toCharArray(), 'a'));
    }

    // Path 2
    @Test
    public void path2Test() {
        assertEquals(1, App.countCharInArray("az".toCharArray(), 'z'));
    }

    // Path 3
    @Test
    public void path3Test() {
        assertEquals(1, App.countCharInArray("b".toCharArray(), 'b'));
    }

    // Path 4
    @Test
    public void path4Test() {
        assertEquals(0, App.countCharInArray("a".toCharArray(), 'b'));
    }

    // Path 5
    @Test
    public void path5Test() {
        assertEquals(1, App.countCharInArray("ab".toCharArray(), 'b'));
    }
}
