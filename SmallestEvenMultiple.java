// https://leetcode.com/problems/smallest-even-multiple/description/

// Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

class Solution {
    public int smallestEvenMultiple(int n) {
        int n1 = n;

        while (n1 % 2 != 0 || n1 % n != 0) {
            n1++;
        }

        return n1;
    }
}
