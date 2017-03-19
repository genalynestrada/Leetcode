public class Solution {
    public int findComplement(int num) {
      String stringNum = Integer.toBinaryString(num) ;
      String inverted = stringNum.replaceAll("0", "x").replaceAll("1", "0").replaceAll("x", "1"); //inverted bits

      System.out.println("stringNum: " + stringNum + " inverted: " + inverted);

      return Integer.parseInt(inverted, 2);
    }
}
