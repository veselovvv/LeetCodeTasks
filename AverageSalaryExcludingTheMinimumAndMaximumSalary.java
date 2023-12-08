// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
// You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        double sum = 0;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) min = salary[i];
            if (salary[i] > max) max = salary[i];
        }

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != min && salary[i] != max) {
                sum += Double.valueOf(salary[i]);
            }
        }

        return sum / (salary.length - 2);
    }
}
