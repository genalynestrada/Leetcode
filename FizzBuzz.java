public class Solution {
    public List<String> fizzBuzz(int n) {
       ArrayList<String> stringNum = new ArrayList<String>(n);

        for(int i = 1; i <= n; ++i){

            if (i % 3 == 0 && i % 5 == 0){
              stringNum.add("FizzBuzz");
            } else if (i % 3 == 0){
              stringNum.add("Fizz");
            } else if (i % 5 == 0) {
              stringNum.add("Buzz");
            } else {
              stringNum.add(Integer.toString(i));
            }
        }
        return stringNum;

    }
}
