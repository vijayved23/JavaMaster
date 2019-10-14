package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int total = 0;
	    for (int i = 1; i <=1000; i ++){
	        if (i%5 == 0 && i%3 == 0){
                System.out.println("The number is " + i);
                total = total + i;
                count ++;
                if (count == 5) {
                    System.out.println("Your total is " + total);
                    break;
                }
            }

        }
    }
}
