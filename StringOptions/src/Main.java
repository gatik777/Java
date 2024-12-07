public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");


        StringBuilder helloWorldBuilder = new StringBuilder("Hello + World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder();

        printInformation(emptyStart);
        printInformation(emptyStart32);


        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);



    }




    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("String = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());

    }
}