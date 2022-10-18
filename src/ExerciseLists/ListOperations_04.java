package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                      .split("\\s+"))
                      .map(Integer::parseInt)
                     .collect(Collectors.toList()); // Преобразуване в списък.
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            // Валидни команди


            if (command.contains("Add")) {
                // Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Insert")) {
                // Insert {number} {index} - insert number at given index
                // "Insert 10 2"
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                //трябва да проверя дали този индекс съществува
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(index,numbers)){
                    // валиден индекс
                    numbers.add(index, numberToInsert);
                }else {
                    // индекса не е валиден
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                // Remove {index} - remove that index
                //"Remove 2"
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]);
                //трябва да проверя дали този индекс съществува
                if (isValidIndex(indexForRemove,numbers)){
                    // валиден индекс
                    numbers.remove(indexForRemove);
                }else {
                    // индекса не е валиден
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                // Shift left {count} - first number becomes last 'count' times
                // "Shift left 2"
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                // повтаряме нещо CountShiftLeft  пъти
                for (int time = 1; time <= countShiftLeft; time++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
            } else if (command.contains("Shift right")) {
                // Shift right {count} - last number becomes first 'count' times
                int countShiftRighr = Integer.parseInt(command.split("\\s+")[2]);

                for (int time = 1; time <= countShiftRighr; time++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }
            command = scanner.nextLine();
            }
            for (int number:numbers) {
            System.out.print(number + " ");
        }
    }

    // метод които проверява дали даден индекс е валиден.
    // true -> ако валиден индекс -> [0, size - 1]
    // false -> не валиден индекс.
    public static boolean isValidIndex(int index, List<Integer> numbers){
       return index >= 0 && index <= numbers.size() - 1;
    }

}
