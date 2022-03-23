package com.android.s19110239;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FactMethodUnitTest {
    private Calculator mCalculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void factNumber() {
        assertThat(mCalculator.fact(5d), is(equalTo(120d)));
    }
    @Test
    public void factNumberFloat() {
        assertThat(mCalculator.fact(0.5d), is(equalTo(Double.NaN)));
    }
    @Test
    public void factNegativeNumber() {
        assertThat(mCalculator.fact(-2d), is(equalTo(Double.NaN)));
    }
    @Test
    public void factNumberZero() {
        assertThat(mCalculator.fact(0), is(equalTo(1d)));
    }

    @Test
    public void factBigNumber() {
        thrown.expect(StackOverflowError.class);
        mCalculator.fact(10000);
    }
}
