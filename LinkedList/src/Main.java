import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add(0, "New Delhi");
        placesToVisit.add(1, "Mandi");
        placesToVisit.add(2, "Kullu and Manali");


        addMoreElements(placesToVisit);

//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);


//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Wallace");


        list.offer("Mumbai");


        System.out.println("First Element = " + list.getFirst());


        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Mandi");

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s3 = list.remove();
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1);

        String p2 = list.poll();
        System.out.println(p2);

        String p3 = list.poll();
        System.out.println(p3);

        list.push("Delhi");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));

        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;

        }

        System.out.println("Trip ends at " + list.getLast());

    }

    public static void testIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("New Delhi")) {
                iterator.add("Bhardwaj Lake");
            }
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.previous());

        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());


    }

}