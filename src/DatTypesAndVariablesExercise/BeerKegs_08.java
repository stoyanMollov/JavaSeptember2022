package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double maxValue = 0;
        String biggerKeg = "";

        for (int i = 0; i < n; i++) {
            String nameOfKeg = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int high = Integer.parseInt(scan.nextLine());

            double value = Math.PI * radius * radius * high;

            if (value > maxValue){
                maxValue = value;
                biggerKeg = nameOfKeg;
            }
        }
        System.out.println(biggerKeg);
    }
}
