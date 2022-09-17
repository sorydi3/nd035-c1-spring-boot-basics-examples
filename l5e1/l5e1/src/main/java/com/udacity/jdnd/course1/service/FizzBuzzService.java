package com.udacity.jdnd.course1.service;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzService {

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * @Throws IllegalArgumentException for values < 1
     */
    public String fizzBuzz(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        if(checkIfDivisibleByFive(number) && checkIfDivisibleByThree(number)){
            return "FizzBuzz";
        } else if(checkIfDivisibleByThree(number)){
            return "Fizz";
        } else if(checkIfDivisibleByFive(number)){
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }


    public boolean checkIfDivisibleByThree(int number) {

        return number % 3 == 0;
    }


    public boolean checkIfDivisibleByFive(int number) {
        return number % 5 == 0;
    }
}
