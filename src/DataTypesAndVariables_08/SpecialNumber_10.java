package DataTypesAndVariables_08;

import java.util.Scanner;

public class SpecialNumber_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {

            int digit = i;
            int sum = 0;

            while(digit > 0){
                sum += digit % 10;
                digit = digit / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11 ){
                System.out.printf("%d -> True%n",i);
            }else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
