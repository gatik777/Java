import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int validNum = 0;
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit");
            String nextEntry = scanner.nextLine();
            try {
                Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }

                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            }
            catch (NumberFormatException nfe) {
                break;
            }

            if (loopCount > 0 ) {
                System.out.println("min = " + min + ", max " + max);
            }


        }







    }
}