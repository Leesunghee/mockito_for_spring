package com.packtpub.junit.recap;

import org.junit.Test;
import org.omg.CORBA.DoubleHolder;

import java.util.Arrays;
import java.util.List;

import static com.packtpub.junit.recap.LessThanOrEqual.lessThanOrEqual;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by sungheelee on 2016. 3. 27..
 */
public class AssertThatTest {

    @Test
    public void test_matcher_behavior() {
        int myAge = 30;

        assertThat(myAge, equalTo(30));
        assertThat(myAge, is(30));

        assertThat(myAge, not(equalTo(33)));
        assertThat(myAge, is(not(33)));
    }

    @Test
    public void test_multiple_values() {
        double myMarks = 100.00;

        assertThat(myMarks, either(is(100.00)).or(is(90.9)));
        assertThat(myMarks, both(not(99.9)).and(not(60.00)));
        assertThat(myMarks, anyOf(is(100.00), is(1.00),is(55.00), is(88.00),is(67.8)));
        assertThat(myMarks, not(anyOf(is(0.00), is(200.00))));
        assertThat(myMarks, not(allOf(is(1.00), is(100.00), is(30.00))));
    }


    @Test
    public void verify_collection_values() throws Exception {
        List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);

        assertThat(salary, hasItem(50.00));
        assertThat(salary, hasItems(50.00, 200.00));
        assertThat(salary, not(hasItem(1.00)));

    }

    @Test
    public void verify_strings() throws Exception {
        String myName = "John Jr Dale";
        assertThat(myName, startsWith("John"));
        assertThat(myName, endsWith("Dale"));
        assertThat(myName, containsString("Jr"));
    }

    @Test
    public void lessthanOrEquals_matcher() throws Exception {

        int actualGoalScored = 2;
        int expGoalScored= 4;

        assertThat(actualGoalScored, lessThanOrEqual(expGoalScored));

        expGoalScored =2;
        assertThat(actualGoalScored, lessThanOrEqual(expGoalScored ));

        double actualDouble = 3.14;
        double expDouble = 9.00;
        assertThat(actualDouble, lessThanOrEqual(expDouble));

        String authorName = "Sujoy";
        String expAuthName = "Zachary";
        assertThat(authorName, lessThanOrEqual(expAuthName));

        int maxInt = Integer.MAX_VALUE;
        assertThat(maxInt, lessThanOrEqual(Integer.MIN_VALUE));
    }
}
