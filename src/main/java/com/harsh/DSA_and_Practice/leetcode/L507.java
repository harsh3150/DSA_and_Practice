package com.harsh.DSA_and_Practice.leetcode;

public class L507 {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sumDivisor = 1;

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumDivisor += i;
                sumDivisor += num / i;
            }
        }

        return sumDivisor == num ? true : false;
    }
}
