public class Main {
    public static void main(String[] args) {

        String helloWorld = "%s%s.".formatted("Hello", "World");
        String helloWorld2 = String.format("Hello", "World");

        System.out.println(helloWorld);
        System.out.println(helloWorld2);
    }
}