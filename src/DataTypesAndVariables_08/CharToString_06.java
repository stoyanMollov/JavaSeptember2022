package DataTypesAndVariables_08;

import java.util.Scanner;

public class CharToString_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char one = scan.next().charAt(0);
        char two = scan.next().charAt(0);
        char three = scan.next().charAt(0);

        //String result = one + two + three;

        System.out.println(""+one+two+three);
    }
}
