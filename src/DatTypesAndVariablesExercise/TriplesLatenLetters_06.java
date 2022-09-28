package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesLatenLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (char i = 'a'; i < 'a' + n; i++) {
            for (char k = 'a'; k < 'a' + n; k++) {

                for (char l = 'a'; l < 'a' + n; l++) {
                    System.out.println(""+i+k+l);
                }
            }
        }
    }
}
