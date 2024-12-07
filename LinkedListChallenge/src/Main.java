import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    record Place(String name , int distance ) {

        @Override
        public String toString() {
            return String.format("%s (%d)", name , distance);
        }
    }

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place NewDelhi = new Place("New Delhi", 498);
        addPlace(placesToVisit, NewDelhi);
        System.out.println(placesToVisit);

        var iterator = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop) {
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch(menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    break;

                    case "B":
                    System.out.println("User wants to go backward");
                    break;

                    case "M":
                    printMenu();
                    break;

                    case "L":
                    printMenu();
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }




    }

    private static void addPlace(LinkedList<Place> list ,  Place place) {

        if (list.contains(place)) {

            System.out.println("Found duplicate : " + place);
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name()));
            System.out.println("Found duplicate: " + place);
            return;
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            matchedIndex++;
        }

        list.add(place);


    }


    private static void printMenu() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);

        System.out.println();
    }
}