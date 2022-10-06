package ArrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class ToIntegers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (index == numbers.length - 1){
                System.out.print(currentNumber + " ");
                break;
            }
            boolean isTop = false;
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber ){
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
