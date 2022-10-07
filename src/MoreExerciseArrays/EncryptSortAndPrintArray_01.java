package MoreExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String sequence = scan.next();
            int length = sequence.length();
            int sum = 0;
            for (int j = 0; j < sequence.length(); j++) {
                char currentChar = sequence.charAt(j);
                if(isVowel(currentChar)){
                    sum += currentChar*length;
                }else {
                    sum += currentChar / length;
                }
            }
            numbers[i] = sum;
        }   
        Arrays.sort(numbers);

        for (int element:
             numbers) {
            System.out.println(element);
        }
    }
    public static boolean isVowel(char a){
        String vowel = "aeiouAEIOU";
        return vowel.contains(a + "");
    }
    public static boolean isConsanant(char a){
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(a + "");
    }
}
