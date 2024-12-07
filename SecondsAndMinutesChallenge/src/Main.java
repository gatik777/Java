public class Main {

    public static void main(String[] args) {
        getDurationString(1,23,9);
        getDurationString(0);
    }

    public static void getDurationString(int seconds) {
        if(seconds >= 0){
            System.out.println(seconds + " seconds");
        } if(seconds <= 0){
            System.out.println("Invalid value");
        }
    }


    public static void getDurationString(int hours, int minutes, int seconds) {

        if(minutes >= 0 || seconds >= 0 || seconds <= 59){
            System.out.println(hours + " hour "  + minutes + " minutes " + seconds + " seconds " );
        }
        if(minutes <= 0){
            System.out.println("Sorry, Invalid value");
        }
    }




}
