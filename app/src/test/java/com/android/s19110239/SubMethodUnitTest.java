package com.android.s19110239;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class SubMethodUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void subTwoNumbers() {
        assertThat(mCalculator.sub(10d, 5d), is(equalTo(5d)));
    }

    @Test
    public void subWorksWithNegativeResult() {
        assertThat(mCalculator.sub(-3d, 2d), is(equalTo(-5d)));
    }
    @Test
    public void subTwoNumbersFloats() {
        assertEquals(mCalculator.sub(1.111f, 1.111d), 0, 0.001);
    }

    @Test
    public void subTwoNumbersFloatsWithNegativeResult() {
        assertEquals(mCalculator.sub(-2.123f, 1.111d), -3.234, 0.001);
    }

    @Test
    public void subTwoNumbers1() {
        assertEquals(mCalculator.sub(-1.111f, -2.123d), 1.013, 0.001);
    }
}