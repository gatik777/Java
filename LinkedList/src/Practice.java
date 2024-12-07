import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {

        var Gadgets = new LinkedList<>();

        Gadgets.add(0, "Mobile");
        Gadgets.add(1, "Tablet");
        Gadgets.add(2, "Laptop");

        Gadgets.remove(1);
        System.out.println(Gadgets);
    }
}
