public class Main {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 10; count < 3 && i <= 50; i++) {
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                i++;

            if(count == 3){
                System.out.println("Found 3, exiting for loop");
                break;

            }

    }



            if(i == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return false;
        }

        if(wholeNumber == 2) {
            return wholeNumber == 2;
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }

        for(int primeNumber = 3; primeNumber < wholeNumber;){
            break;
        }


            return true;
        }




        return true;

    }


}