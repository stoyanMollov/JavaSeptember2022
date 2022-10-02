package ArrayExersize;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] firstArray = scan.nextLine().split(" ");
        String [] secondArray = scan.nextLine().split(" ");

        for (String elementSecondArray: secondArray) {
            for (String elementFirstArray: firstArray) {
                if (elementSecondArray.equals(elementFirstArray)){
                    System.out.print(elementFirstArray + " ");
                    break;
                }
            }
        }
    }
}
