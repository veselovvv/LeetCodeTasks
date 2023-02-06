// https://leetcode.com/problems/shuffle-the-array
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var xArray = IntArray(0)
        var yArray = IntArray(0)
        val resultArray = IntArray(n*2)
        var xIndex = 0
        var yIndex = 0
        
        nums.forEachIndexed { index, element -> 
            if (index < n) xArray += element else yArray += element
        }
        
        nums.forEachIndexed { index, element -> 
            if (index % 2 == 0) {
                resultArray[index] = xArray[xIndex]
                xIndex++
            } else {
                resultArray[index] = yArray[yIndex]
                yIndex++
            }
        }
        
        return resultArray
    }
    
    // Improved solution:
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var result = intArrayOf()

        nums.forEachIndexed { index, num ->
            if (index < n) {
                result += num
                result += nums.get(n + index)
            } 
        }

        return result
    }
}
