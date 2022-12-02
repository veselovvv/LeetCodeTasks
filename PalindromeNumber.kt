// https://leetcode.com/problems/palindrome-number/
// Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    fun isPalindrome(x: Int) = x.toString() == x.toString().reversed()
}
