// https://leetcode.com/problems/pass-the-pillow/description/
// There are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially. 
// Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing 
// the pillow in the opposite direction.
// For example, once the pillow reaches the nth person they pass it to the n - 1th person, then to the n - 2th person and so on.
// Given the two positive integers n and time, return the index of the person holding the pillow after time seconds.

class Solution {
    public int passThePillow(int n, int time) {
        int timeLeft = time;
        int currentPosition = 1;
        boolean isGoingForward = true;
        boolean isStart = true;

        while (timeLeft > 0) {
            if (isStart && currentPosition == 1) {
                isStart = false;
            }

            if (isGoingForward) {
                currentPosition += 1;
            } else {
                currentPosition -= 1;
            }

            if (currentPosition == n) {
                isGoingForward = false;
            }

            if (currentPosition == 1 && !isStart) {
                isGoingForward = true;
            }

            timeLeft -= 1;
        }

        return currentPosition;
    }
}
