// https://leetcode.com/problems/robot-return-to-origin
// There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes 
// its moves. You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 
// 'U' (up), and 'D' (down). Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);

            if (ch == 'L') x--;
            else if (ch == 'R') x++;
            else if (ch == 'U') y++;
            else if (ch == 'D') y--;
        }
        
        return x == 0 && y == 0;
    }
}
