// leetcode.com/problems/calculate-money-in-leetcode-bank/description/
// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, 
// he will put in $1 more than the previous Monday.
// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

class Solution {
    public int totalMoney(int n) {
        int days = n;
        int daysToMonday = 0;
        int putInPreviousMonday = 0;
        int putInPreviousDay = 0;
        int result = 0;

        while (days != 0) {
            if (daysToMonday == 0) {
                result += putInPreviousMonday + 1;
                putInPreviousMonday = putInPreviousMonday + 1;
                putInPreviousDay = putInPreviousMonday;
                daysToMonday += 6;
            } else {
                result += putInPreviousDay + 1;
                putInPreviousDay = putInPreviousDay + 1;
                daysToMonday--;
            }

            days--;
        }

        return result;
    }
}
