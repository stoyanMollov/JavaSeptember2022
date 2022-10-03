package ArrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotation; i++) {
            int firstElement = numbers[0];

            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];

            }
            numbers[numbers.length - 1] = firstElement;
        }

        for (int number :numbers) {
            System.out.print(number + " ");
        }
    }
}
