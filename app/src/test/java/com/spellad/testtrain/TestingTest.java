package com.spellad.testtrain;

import junit.framework.TestCase;

/**
 * Created by m7md07sn on 31/01/2017.
 */
public class TestingTest extends TestCase {
    Testing testing;

    public void setUp() throws Exception {
        super.setUp();
        testing = new Testing();
    }

    public void testCompare() throws Exception {

        int a = 10,
                b = 20;

        boolean f = testing.compare(a, b);
        boolean expected = false;
//        assertFalse(f);
        assertEquals(expected, f);
    }

    public void testSum() throws Exception {

        int a=10,b=20;
        assertEquals(testing.sum(a,b),30);

    }

    public void testPrintStr() throws Exception {

        assertEquals("Hello",testing.printStr());

    }

}