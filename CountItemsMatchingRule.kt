// https://leetcode.com/problems/count-items-matching-a-rule/
// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule 
// represented by two strings, ruleKey and ruleValue. Return the number of items that match the given rule.

class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var count = 0
        
        val index = when (ruleKey) {
            "type" -> 0
            "color" -> 1
            else -> 2
        }
        
        items.forEach {
            if (it[index] == ruleValue) count++
        }
        
        return count
    }
}
