public class Main {
    public static void main(String[] args) {
        calculateScore(75);

    }

    public static int calculateScore(String playerName, int score){

        System.out.println("The new score is " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed player scored " + score + " points ");
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;


    }
}



