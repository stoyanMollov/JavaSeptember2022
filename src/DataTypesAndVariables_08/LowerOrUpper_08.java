package DataTypesAndVariables_08;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch = scan.nextLine().charAt(0);

        if (Character.isUpperCase(ch)){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
