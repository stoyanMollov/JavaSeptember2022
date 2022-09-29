package DatTypesAndVariablesExercise;

import java.util.Scanner;

public class whaterFlow_07 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int linesFlow = Integer.parseInt(scan.nextLine());

        int tankCapacity = 255;
        int currentCapacity = 0;

        for (int i = 0; i < linesFlow; i++) {

            int water = Integer.parseInt(scan.nextLine());

            if (currentCapacity + water <= tankCapacity){
                currentCapacity += water;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentCapacity);
    }
}
