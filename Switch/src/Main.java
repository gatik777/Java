public class Main {

    public static void main(String[] args) {

        printDayOFWeek(1);
        char charValue = 'F';
        switch (charValue){
            case'A':
                System.out.println("A is Able");
                break;

            case 'B':
                System.out.println("B is Baker");
                break;

            case 'C':
                System.out.println("C is Charlie");
                break;

            case 'D':
                System.out.println("D is Dog");
                break;

            case 'E':
                System.out.println("E is Easy");
                break;

            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }


    }

        public static String getQuarter(String month){
            return switch (month) {
                case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
                case "APRIL", "MAY", "JUNE" -> "2nd";
                case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
                case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
                default -> {
                    String badResponse = month + " is bad";
                    yield badResponse;
                }
            };
    }

    public static void printDayOFWeek(int day){
        switch(day){
            case 0:
                System.out.println("1 stands for Sunday");
                break;

            case 1:
                System.out.println("2 stands for Monday");
                break;
            case 2:
                System.out.println("3 stands for Tuesday");
                break;
            case 3:
                System.out.println("4 stands for Wednesday");
                break;
            case 4:
                System.out.println("5 stands for Thursday");
                break;
            case 5:
                System.out.println("6 stands for Friday");
                break;

        }

        if(day < 0 && day > 6){
            System.out.println("Invalid Value");
        }







    }



}


