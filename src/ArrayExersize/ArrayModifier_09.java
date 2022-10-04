package ArrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scan.nextLine();

        while(!command.equals("end")){
            if (command.contains("swap")){

            } else if (command.contains("multiply")) {
                //multiply
            } else if (command.equals("decrease")) {
                //decrease
            }
            command = scan.nextLine();
        }
    }
}
