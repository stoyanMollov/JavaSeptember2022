package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesLatenLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (char i = 'a'; i < n; i++) {
                char firstLetter = (char) (i + 97);
            for (char j = 'a'; j < n; j++) {
                char secondLetter = (char) (j + 97);
                for (char k = 'a'; k < n; k++) {
                    char thirdLetter = (char) ( k + 97);
                    System.out.print(  "%c%c%c%n",i, j, k);
                }

            }

        }

    }
}
