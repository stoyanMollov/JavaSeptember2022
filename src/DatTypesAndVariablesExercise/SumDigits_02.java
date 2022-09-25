package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int lastDigit = 0;
        int sum = 0;

        while(number > 0){

            lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
