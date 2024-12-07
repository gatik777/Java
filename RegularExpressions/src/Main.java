import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "%s%s.".formatted("Hello", "World");
        System.out.println("Using string's formatted method: " + helloWorld);

        String helloWorld2 = String.format("Hello", "World");
        System.out.println("Using Main.format : " + helloWorld2);

        format("Hello, World", "\".*%s.*\"");



    }

    private static String format(String regexp, String... args) {


        int index = 0;
        while (regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[index++]);
            System.out.println(regexp);

            String helloWorld3 = Main.format("%s %s", "Hello" , "World");
            System.out.println(helloWorld3);
        }

        return regexp;

    }




}
