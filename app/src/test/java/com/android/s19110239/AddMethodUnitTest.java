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
public class AddMethodUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumbers() {
        assertThat(mCalculator.add(2d, 3d), is(equalTo(5d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        assertThat(mCalculator.add(-3d, 2d), is(equalTo(-1d)));
    }
    @Test
    public void addTwoNumbersFloats() {
        assertEquals(mCalculator.add(1.111f, 1.111d), 2.222, 0.001);
    }

    @Test
    public void addTwoNumbersFloatsNegative() {
        assertEquals(mCalculator.add(-2.123f, 1.111d), -1.012, 0.001);
    }

    @Test
    public void addTwoNumbersFloatsNegative1() {
        assertEquals(mCalculator.add(-2.123f, -1.111d), -3.234, 0.001);
    }
}
