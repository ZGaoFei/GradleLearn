package com.example.zhaogaofei.firsttestapp.test;

import java.util.ArrayList;

/**
 * Created by zhaogaofei on 2017/11/14.
 */

public class TestList {

    public void testList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("=======list1=======" + list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("===before===list2========" + list2.get(i));
        }

        list1.clear();

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("===after===list2========" + list2.get(i));
        }
    }
}
