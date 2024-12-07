public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Gatik ");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if(topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore && topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == false) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar ==  "Volkswagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double d1 = 20.00d;
        double d2 = 80.00d;
        double d3 = (d1 + d2) * 100.00d;
        System.out.println(d3);
        double dTotal = d3 % 40.00d;
        System.out.println("My values equal = " + dTotal);

        boolean remainder = true;
        if (d3 == 0.00){
            System.out.println(true);
        }
        if (d3 != 0.00){
            System.out.println("Got some remainder");
        }

        
    }




}