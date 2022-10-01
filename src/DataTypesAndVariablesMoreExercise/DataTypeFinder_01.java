package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        while (!scan.equals("END")){
            if(isNumber(scan)){
                if(isInt(scan)){
                    System.out.println(scan + " is integer type");
                }
                else{
                    System.out.println(scan + " is floating point type");
                }
            }
            else{
                if(scan.length() == 1){
                    System.out.println(scan + " is character type");
                }
                else if(scan.equalsIgnoreCase("true") || scan.equalsIgnoreCase("false")){
                    System.out.println(scan + " is boolean type");
                }
                else{
                    System.out.println(scan + " is string type");
                }
            }
            scan = scanner.nextLine();
        }
    }

    private static boolean isInt(String input) {
        try{
            int n = Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    private static boolean isNumber(String input) {
        try{
            double n = Double.parseDouble(input);
        }
        catch (NumberFormatException e){
            return false;
        }
        return  true;
    }

}
