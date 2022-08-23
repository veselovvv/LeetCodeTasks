// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

class Solution {
    fun average(salary: IntArray): Double {
        var max = salary[0]
        var min = salary[0]
        var sum = 0.0
        
        salary.forEach {
            if (it > max) max = it
            if (it < min) min = it
        }
        
        val salaryWithoutMaxAndMin = salary.filter { it != max && it != min }
        
        salaryWithoutMaxAndMin.forEach {
            sum += it.toDouble()
        }
        
        return (sum / salaryWithoutMaxAndMin.size.toDouble())
    }
}
