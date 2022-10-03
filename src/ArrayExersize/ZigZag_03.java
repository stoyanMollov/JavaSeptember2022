package ArrayExersize;

import java.util.Scanner;

public class ZigZag_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        String [] firstArray = new String[rows];
        String [] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
             String [] numbers = scan.nextLine().split(" ");
             String firstNumber = numbers[0];
             String secondNumber = numbers[1];

             if (row % 2 == 0){
                 secondArray[row-1] = firstNumber;
                 firstArray[row-1] = secondNumber;
             }else{
                 firstArray[row-1] = firstNumber;
                 secondArray[row-1] = secondNumber;
             }
        }
        // отпечатваме масив от текстове
        //1. for по index
        //2. foreach по елементи
        //3. String.join() само за масив от стрингове

        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
