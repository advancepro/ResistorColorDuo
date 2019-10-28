package main;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;

    @Before
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    public void testBrownAndBlack() {
        String[] input = { "brown", "black" };
        int expected = 10;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }
    @Test
    public void testBlueAndGrey() {
        String[] inpu = {"blue", "grey"};
        int expected = 68;
        int actual = resistorColorDuo.valu(inpu);

        assertEquals(expected, actual);
    }
    @Test
    public void testYellowAndViolet() {
        String[] inp = { "yellow", "violet" };
        int expected = 47;
        int actual = resistorColorDuo.val(inp);

        assertEquals(expected, actual);
    }
    @Test
    public void testOrangeAndOrange() {
        String[] in = { "orange", "orange" };
        int expected = 33;
        int actual = resistorColorDuo.va(in);

        assertEquals(expected, actual);
    }
    @Test
    public void testBrownGreen() {
        String[] i = { "brown", "green"};
        int expected = 15;
        int actual = resistorColorDuo.v(i);

        assertEquals(expected, actual);
    }
    //@Ignore("Remove to run test")
    @Test
    public void testBrownGreenViolet() {
        String[] ii = { "brown", "green", "violet" };
        int expected = 15;
        int actual = resistorColorDuo.vv(ii);

        assertEquals(expected, actual);
    }
    @Ignore("Remove to run test")
    @Test
    public void testRedOrangeViolet() {
        String[] iii = { "red", "orange", "violet" };
        int expected = 12;
        int actual = resistorColorDuo.vvv(iii);

        assertEquals(expected, actual);
    }

}