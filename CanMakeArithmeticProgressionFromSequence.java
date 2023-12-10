// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
// A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
// Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] firstDifferences = new int[0];
        int[] secondDifferences = new int[0];
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int previousInt = sorted[0];

        for (int index = 1; index < sorted.length; index++) {
            int element = sorted[index];
            firstDifferences = addToArray(firstDifferences, element - previousInt);
            previousInt = element;
        }

        int[] reversed = new int[sorted.length];

        for (int i = 0; i < sorted.length; i++) {
            reversed[i] = sorted[sorted.length - 1 - i];
        }
        
        previousInt = reversed[0];
        for (int index = 1; index < reversed.length; index++) {
            int element = reversed[index];
            secondDifferences = addToArray(secondDifferences, element - previousInt);
            previousInt = element;
        }

        for (int first : firstDifferences) {
            for (int second : secondDifferences) {
                if (Math.abs(first) != Math.abs(second)) return false;
            }
        }

        return true;
    }

    int[] addToArray(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }
}
