import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Integer Equivalent: " + integerEquivalent);
    }

    public static int romanToInteger(String s) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int result = 0;
        int i = 0;

        while (i < s.length()) {
            for (int j = 0; j < romans.length; j++) {
                if (s.startsWith(romans[j], i)) {
                    result += values[j];
                    i += romans[j].length();
                    break;
                }
            }
        }

        return result;
    }
}
