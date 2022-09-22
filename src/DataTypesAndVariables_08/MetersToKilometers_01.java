package DataTypesAndVariables_08;

import java.util.Scanner;

public class MetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double meters = Double.parseDouble(scan.nextLine());

        double kilometers = meters / 1000 ;

        System.out.printf("%.2f",kilometers);
    }
}

