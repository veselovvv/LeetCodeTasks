// https://leetcode.com/problems/buy-two-chocolates/description/?envType=daily-question&envId=2023-12-20
// You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
// You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
// Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.

class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var min1 = prices[0]
        var min1Index = 0
        var min2 = prices[1]
        var index = 0

        prices.forEach { price ->
            if (price < min1 && index != 1) {
                min1 = price
                min1Index = index
            }
            index++
        }

        index = 0

        prices.forEach { price ->
            if (price < min2 && index != min1Index) min2 = price
            index++
        }

        val moneyLeft = money - (min1 + min2)

        return if (moneyLeft >= 0) moneyLeft else money
    }
}
