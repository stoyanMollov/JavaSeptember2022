package DataTypesAndVariables_08;

import java.util.Scanner;
public class ConcatNames_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        String symbols = scan.nextLine();

        System.out.println(nameOne+symbols+nameTwo);

    }
}
