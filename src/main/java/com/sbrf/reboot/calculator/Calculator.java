package com.sbrf.reboot.calculator;

public class Calculator {
    public static int getAddition(int i, int i1) {
        return i+i1;
    }

    public static int getSubtraction(int i, int i1) {
        return i-i1;
    }

    public static int getMultiplication(int i, int i1) {
        return i*i1;
    }

    public static float getDivision(int i, int i1) {
        return (float)i / (float)i1;
    }

    public static int getMax(int i, int i1) {
        return Math.max(i,i1);
    }

    public static int getMin(int i, int i1) {
        return Math.min(i,i1);
    }

    public static int getPow(int i, int i1) {
        return (int)Math.pow(i,i1);
    }
}
