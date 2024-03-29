// https://leetcode.com/problems/lemonade-change/
// At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). 
// Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. 
// You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
// Note that you do not have any change in hand at first.
// Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var ourBills = mutableListOf<Int>()
        
        bills.forEach {
            ourBills.add(it)
            
            when (it) {
                10 -> {
                    if (ourBills.contains(5)) ourBills.remove(5) else return false
                }
                20 -> {
                    if (ourBills.contains(5)) {
                        if (ourBills.contains(10)) {
                            ourBills.remove(10)
                            ourBills.remove(5)
                        } else {
                            ourBills.remove(5)
                            
                            if (ourBills.contains(5)) ourBills.remove(5) else return false
                            if (ourBills.contains(5)) ourBills.remove(5) else return false
                        }
                    } else return false
                }
            }
        }
        
        return true
    }
}
