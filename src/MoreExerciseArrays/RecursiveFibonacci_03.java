package MoreExerciseArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long first = 0;
        long second = 1;
        long third = second + first;
        for (int i = 0; i < n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        System.out.println(first);
    }
}