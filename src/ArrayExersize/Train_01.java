package ArrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] wagons = new int[n];

        for (int wagon = 0; wagon < n; wagon++) {
            int countPeople = Integer.parseInt(scan.nextLine());
            wagons[wagon] = countPeople;
        }
        int sum = 0;
        for (int number:wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
