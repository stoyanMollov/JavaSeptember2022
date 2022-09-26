package DataTypesAndVariables;

import java.util.Scanner;

public class ReversChars_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char chOne = scan.nextLine().charAt(0);
        char chTwo = scan.nextLine().charAt(0);
        char chThree = scan.nextLine().charAt(0);

        String result = ""+chThree + " " + chTwo + " " + chOne;

        System.out.println(result);
    }
}
