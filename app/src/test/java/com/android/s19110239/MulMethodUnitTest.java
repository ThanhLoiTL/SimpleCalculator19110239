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
public class MulMethodUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void mulTwoNumbers() {
        assertThat(mCalculator.mul(2d, 3d), is(equalTo(6d)));
    }
    @Test
    public void mulTwoNumbersWithNegativeResult() {
        assertThat(mCalculator.mul(-3d, 2d), is(equalTo(-6d)));
    }

    @Test
    public void mulTwoNumbersFloats() {
        assertEquals(mCalculator.mul(2.5f, 1.1d), 2.75, 0.001);
    }

    @Test
    public void mulTwoNumbersFloatsWithNegativeResult() {
        assertEquals(mCalculator.mul(-1.5f, 2d), -3, 0.001);
    }
    @Test
    public void mulTwoNumbersZero() {
        assertEquals(mCalculator.mul(2d, 0), 0, 0.001);
    }
}
