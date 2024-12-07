import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number # " + counter + ": ");
            counter++;
            String nextNumber = scanner.nextLine();

            try {

                double number = Double.parseDouble(nextNumber);


//                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
                System.out.println("The sum of the 5 numbers = " + sum);
            } catch (NumberFormatException nfe){
                    System.out.println("Invalid Number");

            }


        }
    }
}