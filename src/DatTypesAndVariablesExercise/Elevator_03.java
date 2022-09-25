package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        double p = Double.parseDouble(scan.nextLine());

        int courses = (int) Math.ceil(n / p);

        System.out.println(courses);
    }
}
