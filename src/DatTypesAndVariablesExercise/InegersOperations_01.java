package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class InegersOperations_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int forthNumber = Integer.parseInt(scan.nextLine());

        int addingNumber = firstNumber + secondNumber;
        int divideNumbers = addingNumber / thirdNumber;
        int multiply = divideNumbers * forthNumber;

        System.out.println(multiply);
    }
}
