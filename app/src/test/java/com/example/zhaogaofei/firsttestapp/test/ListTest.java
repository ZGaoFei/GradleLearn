package com.example.zhaogaofei.firsttestapp.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhaogaofei on 2017/11/14.
 */

public class ListTest {

    private TestList list;

    @Before
    public void setUp() throws Exception {
        list = new TestList();
    }

    @Test
    public void sum() throws Exception {
        list.testList();
    }
}
