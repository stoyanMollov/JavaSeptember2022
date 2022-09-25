package DataTypesAndVariables_08;

import java.util.Scanner;

public class RefactorSpecialNumber_12 {

    public class SpecialNumber_10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int digit = 0;
            int sum = 0;
            boolean isTrue = true;

            int number = Integer.parseInt(scan.nextLine());
            for (int i = 1; i <= number; i++) {
                digit = i;
                while (digit > 0) {
                    sum += digit % 10;
                    digit = digit / 10;
                }
                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%d -> %b%n", i, isTrue);
                    sum = 0;
                    i = digit;
                }
            }
        }
    }
}
