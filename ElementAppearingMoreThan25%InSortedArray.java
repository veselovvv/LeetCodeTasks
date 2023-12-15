// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 0;
        int index = 0;
        
        while (true) {
            var element = arr[index];
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) count++;
            }

            if (count > arr.length / 4) return element;
            
            count = 0;
            index++;
        }
    }
}
