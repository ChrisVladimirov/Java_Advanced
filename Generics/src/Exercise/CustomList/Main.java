package Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String commandName = tokens[0];
            switch (commandName) {
                case "Add":
                    String textToAdd = tokens[1];
                    customList.add(textToAdd);
                    break;
                case "Contains":
                    String searchedElement = tokens[1];
                    System.out.println(customList.contains(searchedElement));
                    break;
                case "Remove":
                    int removeInd = Integer.parseInt(tokens[1]);
                    System.out.println(customList.remove(removeInd));
                    break;
                case "Swap":
                    int firstInd = Integer.parseInt(tokens[1]);
                    int secondInd = Integer.parseInt(tokens[2]);
                    customList.swap(firstInd, secondInd);
                    break;
                case "Greater":
                    String element = tokens[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Print":
                    for (String element_ : customList) {
                        System.out.println(element_);
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
