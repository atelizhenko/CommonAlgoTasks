/**
 * Algorithm:
 * 1. Loop through each character in the string containing the roman numerals.
 * 2. Compare the value of the current roman symbol with the value of the roman symbol to its right.
 *    2.1 If the current value is greater than or equal to the value of the symbol to the right, add the current symbol’s value to the total.
 *    2.2 If the current value is smaller than the value of the symbol to the right, subtract the current symbol’s value from the total.
 */
public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "MCMXCIV";
        System.out.printf("Inout: %s%n", input);
        System.out.printf("Output: %d%n", romanToInteger.romanToInt(input));
    }

    private int getArabic(char r) {
        return switch (r) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int arabic = getArabic(s.charAt(i));
            if (i + 1 != s.length()) {
                int nextArabic = getArabic(s.charAt(i + 1));
                if (arabic >= nextArabic) {
                    sum += arabic;
                } else {
                    sum -= arabic;
                }
            } else {
                sum += arabic;
            }
        }
        return sum;
    }
}
