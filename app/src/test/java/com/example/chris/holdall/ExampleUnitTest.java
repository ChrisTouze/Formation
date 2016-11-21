package com.example.chris.holdall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    CalcManager c;

    @Test
    public void shouldDoAdditionWhenUseEqual() {
        c.operation("+","5");
        String res=c.operation("=","4");
        assertEquals(res, "9");
    }
    @Test
    public void shouldDoSubstractionWhenUseOperator() {
        c.operation("-","15");
        String res=c.operation("+","5");
        assertEquals(res, "10");
    }
    @Before
    public void before(){
        c = new CalcManager();
    }

}