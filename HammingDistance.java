public class Solution {
    public int hammingDistance(int x, int y) {
      int bits = x ^ y;
      int difference = 0;

      while (bits != 0) {
          difference++;
          bits &= bits - 1; // clears bit
      }

      //System.out.println ("x: " + x + " y: " + y + " Bits: " + bits + " Difference: " + difference);
        return difference;
    }
}
