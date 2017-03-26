public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        int tempVal = 0;
        
        for (int num : nums) {
            if (num == 1) {
                tempVal++;
            } else {
                tempVal = 0;
            }
            maxNum = Math.max (maxNum, tempVal);
        }
        return maxNum;
    }
}
