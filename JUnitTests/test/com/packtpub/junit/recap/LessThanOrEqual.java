package com.packtpub.junit.recap;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * Created by sungheelee on 2016. 3. 27..
 */
public class LessThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {

    private final Comparable<T> expValue;

    public LessThanOrEqual(T expValue) {
        this.expValue = expValue;
    }


    @Override
    public boolean matches(Object t) {
        int compareTo = expValue.compareTo((T)t);
        return compareTo > -1;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(" less than or equal(<=)" + expValue);

    }

    public static <T extends Comparable<T>> Matcher<T> lessThanOrEqual(T t) {
        return new LessThanOrEqual(t);
    }
}
