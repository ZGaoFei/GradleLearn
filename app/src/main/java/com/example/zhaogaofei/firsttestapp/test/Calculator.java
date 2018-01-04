package com.example.zhaogaofei.firsttestapp.test;


import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public double divide(int num1, int num2) {
        return num1 / num2;
    }

    public double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public void printList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("item is :" + i);
        }

        List<String> list1 = list.subList(0, 9);
        System.out.println("====" + list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("====" + list1.get(i));
        }
    }

    public void printString() {

    }
}
