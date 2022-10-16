package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine() // "1 2 3 4 5 5 5 6"
                                .split(" ")) // ["1", "2", "3", "4", "5", "5", "5", "6"]
                                .map(Integer::parseInt) // [1, 2, 3, 4, 5, 5, 5, 6] -> масив от цели числа
                                .collect(Collectors.toList()); // {1, 2, 3, 4, 5, 5, 5, 6} -> списък от цели числа

        String command = scanner.nextLine();
        // stop: command == end
        // continues: command != end
        while(!command.equals("end")){

            if (command.contains("Delete")){
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForRemove));
            } else if (command.contains("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, element);
            }
            command = scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
