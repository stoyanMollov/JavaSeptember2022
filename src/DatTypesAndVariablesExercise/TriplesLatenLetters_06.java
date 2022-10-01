package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesLatenLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            char firstChar = (char)('a' + i);
            for (int k = 0; k < n; k++) {
                char secondChar = (char)('a' + k);
                for (int l = 0; l < n; l++) {
                    char theirChar = (char)('a' + l);
                    System.out.printf("%c%c%c%n",firstChar,secondChar,theirChar);
                }
            }
        }
    }
}
