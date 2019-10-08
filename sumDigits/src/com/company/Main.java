package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(145));
    }

    public static int sumDigits(int number){
        if (number >= 10){
            int sum = 0;
            while (number > 0){
                int digit = number%10;
                sum += digit;

                number /= 10;
            }
            return sum;

        } else{
            return -1;
        }

    }
}
