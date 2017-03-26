//Codility Challenge
// Given N, count the number of 1's from 1 to N
class Solution {
    public int solution(int N) {
        int totalSum = 0;
       for (int i = 1; i <= N; i++) {
           String stringRep = Integer.toString(i);
           for (char c : stringRep.toCharArray()) {
                if (c == '1') {
                    totalSum++;
                    //System.out.println("Contains a 1: " + i);
                }
            }
        }
        return totalSum;
    }
}
