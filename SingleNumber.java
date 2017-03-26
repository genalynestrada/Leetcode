public class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;

        for (int currentNum : nums) {
            singleNum ^= currentNum;
        }
    
        return singleNum;
    }
}
