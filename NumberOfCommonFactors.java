// https://leetcode.com/problems/number-of-common-factors/description/

// Given two positive integers a and b, return the number of common factors of a and b.
// An integer x is a common factor of a and b if x divides both a and b.

class Solution {
    public int commonFactors(int a, int b) {
        int result = 0;

        if (a < b) {
            for (int x = 1; x <= a; x++)
                if (a % x == 0 && b % x == 0) result++;
        } else {
            for (int x = 1; x <= b; x++)
                if (a % x == 0 && b % x == 0) result++;
        }

        return result;
    }
}
