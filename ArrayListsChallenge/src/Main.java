import java.util.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static void printActions() {

        String textBlock = """
                ""Available actions:
                
                0 - to shutdown"
                
                1 - to add item(s) to list(comma delimited list)
                
                2 - to remove any items(comma delimited list)
                
                Enter a number for which action you want to do:""";

        System.out.println(textBlock + " ");
    }

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);

                default -> flag = false;
            }

            printActions();
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }


    }

    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add items(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.remove(trimmed);
            }

        }

    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Add items(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }


        }


    }

}









