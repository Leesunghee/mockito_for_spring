package com.packtpub.junit.recap;

import org.junit.Test;

import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by sungheelee on 2016. 3. 27..
 */
public class AssertionTest {

    @Test
    public void assert_same_test() {

        Integer anInt = new Integer(5);
        Integer anotherInt = anInt;

        assertNotSame(anInt, anotherInt);

    }

    @Test(expected = RuntimeException.class)
    public void test_exception_condition() {
        throw new RuntimeException();
    }
}
