// https://leetcode.com/problems/n-repeated-element-in-size-2n-array
// You are given an integer array nums with the following properties:
// - nums.length == 2 * n.
// - nums contains n + 1 unique elements.
// - Exactly one element of nums is repeated n times.
// Return the element that is repeated n times.

class Solution {
    public int repeatedNTimes(int[] nums) {
        int index = 0;
        int count = 0;
        int result = 0;
        
        while (count != nums.length / 2) {
            result = nums[index];
            
            for (int i = 0; i < nums.length; i++)
                if (nums[i] == result) count++;
            
            index++;
            if (count != nums.length / 2) count = 0;
        }
        
        return result;
    }
}
