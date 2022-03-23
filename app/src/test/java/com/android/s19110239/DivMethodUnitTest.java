package com.android.s19110239;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DivMethodUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void divTwoNumbers() {
        assertThat(mCalculator.div(4d, 2d), is(equalTo(2d)));
    }

    @Test
    public void divTwoNumbersWithFloatsResult() {
        assertEquals(mCalculator.div(-3d, 1.888d), -1.58898, 0.01);
    }

    @Test
    public void divTwoNumbersWithFloatsResult1() {
        assertEquals(mCalculator.div(0, -3d), 0, 0.01);
    }

    @Test
    public void divTwoNumbersZeroWithPositiveResult() {
        assertThat(mCalculator.div(2, 0), is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void divTwoNumbersZeroWithNegativeResult() {
        assertThat(mCalculator.div(-2d, 0), is(equalTo(Double.NEGATIVE_INFINITY)));
    }
    @Test
    public void divTwoNumbersZeroWithNaNResult() {
        assertThat(mCalculator.div(0, 0), is(equalTo(Double.NaN)));
    }
}
