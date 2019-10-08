package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(1,true));
    }

    public static boolean shouldWakeUp(int hourOfDay, boolean isBarking) {

        if (hourOfDay < 8 || hourOfDay > 24 && isBarking) {
            return true;

        } else {
            return false;
        }
    }
}
