package com;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by bfhuang on 4/15/17.
 */
public class TestTest {

    @org.junit.Test
    public void testName() throws Exception {
        assertThat(1, is(1));

    }
}
