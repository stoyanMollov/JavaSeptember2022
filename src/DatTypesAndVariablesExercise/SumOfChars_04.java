package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int end = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < end; i++) {
            char ch = scan.nextLine().charAt(0);
            sum += ch;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
