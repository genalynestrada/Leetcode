//Codility Challenge
// Given an array such as [1, 1, 0, 0, 0] which represents either a heads or a tails of a coin
// Count the minimum number of "reverses" to get all the coins facing one direction
class Solution {
    public int solution(int[] A) {
        int heads = 0;
        int tails = 0;
        int minReverse = 0;

        //counts heads vs tails
        for (int i : A) {
            if (i == 0) {
                heads++;
            } else if (i == 1) {
                tails++;
            }
        }
        return Math.min(heads, tails);
    }
}
