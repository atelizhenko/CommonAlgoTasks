import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 15;
        System.out.printf("Input: n = %d%n", n);
        System.out.printf("Output: %s%n", fizzBuzz.fizzBuzz(n));
    }
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                 fizzBuzzList.add("FizzBuzz");
             } else if (i % 3 == 0) {
                 fizzBuzzList.add("Fizz");
             } else if (i % 5 == 0) {
                 fizzBuzzList.add("Buzz");
             } else {
                 fizzBuzzList.add(String.valueOf(i));
             }
        }

        return fizzBuzzList;
    }
}
