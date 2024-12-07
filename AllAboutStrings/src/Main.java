public class Main {
    public static void main(String[] args) {

        printInformation("Hello World ");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d%n ", helloWorld.indexOf('r'));

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");

        }

    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {

            System.out.println("String is empty");
            return;
        }


        if (string.isBlank()) {
            System.out.println("String is blank");

        }




        System.out.printf("First Char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}