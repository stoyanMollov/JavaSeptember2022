package DataTypesAndVariables_08;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExtractSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigDecimal result = BigDecimal.valueOf(0);

        for (int i = 0; i < n; i++) {
            BigDecimal input = new BigDecimal(scan.nextLine());
            result = result.add(input);
        }
        System.out.println(result);
    }
}
