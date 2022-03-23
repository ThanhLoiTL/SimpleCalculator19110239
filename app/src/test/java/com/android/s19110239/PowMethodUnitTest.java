package com.android.s19110239;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PowMethodUnitTest {
    private Calculator mCalculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void powNormal() {
        assertThat(mCalculator.pow(2d, 3d), is(equalTo(8d)));
    }

    @Test
    public void powNumbersFloats() {
        assertEquals(mCalculator.pow(2.3d, 2.2d), 6.24886d, 0.0001);
    }

    @Test
    public void powNumberZero() {
        assertEquals(mCalculator.pow(2d, 0), 1, 0.0001);
    }

//    @Test
//    public void powBigNumbers() throws Exception{
//        thrown.expect(StackOverflowError.class);
//        mCalculator.pow(200000d, 100000d);
//    }

    @Test
    public void powNegativeNumbers() {
        assertEquals(mCalculator.pow(-2d, -3d), -0.125d, 0.001);
    }
}
