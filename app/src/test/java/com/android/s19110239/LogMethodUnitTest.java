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
public class LogMethodUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }


    @Test
    public void logNormal() {
        assertEquals(mCalculator.log(2d, 5d), 2.3219d, 0.0001d);
    }

    @Test
    public void logWithBaseFloat() {
        assertEquals(mCalculator.log(0.5d, 2.5d), -1.3219d, 0.0001d);
    }

    @Test
    public void logWithBaseIsOne() {
        assertThat(mCalculator.log(1d, 2.5d), is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void logWithLogNumberNegative() {
        assertThat(mCalculator.log(2d, -2d), is(equalTo(Double.NaN)));
    }

    @Test
    public void logWithBaseNegative() {
        assertThat(mCalculator.log(-2d, 0.5d), is(equalTo(Double.NaN)));
    }
}
