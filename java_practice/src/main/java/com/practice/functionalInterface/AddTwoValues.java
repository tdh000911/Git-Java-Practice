package com.practice.functionalInterface;

public class AddTwoValues {


    public int addTwoVariables(int a, int b) {

        MyFuncInterface myFuncInterface = (x, y) -> x+y;

        return myFuncInterface.apply(a, b);
    }
}
