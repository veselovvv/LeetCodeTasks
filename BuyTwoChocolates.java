// https://leetcode.com/problems/buy-two-chocolates/description/?envType=daily-question&envId=2023-12-20
// You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
// You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
// Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.

class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = prices[0];
        int min1Index = 0;
        int min2 = prices[1];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min1 && i != 1) {
                min1 = prices[i];
                min1Index = i;
            }
        }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min2 && i != min1Index) min2 = prices[i];
        }

        int moneyLeft = money - (min1 + min2);

        if (moneyLeft >= 0) return moneyLeft;
        else return money;
    }
}
