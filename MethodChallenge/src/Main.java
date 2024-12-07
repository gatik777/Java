public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Gatik", 2);
        calculateHighScorePosition(600);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition ){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int Score) {

        System.out.println("The score is " + Score);
        if(Score >= 1000){
            return 1;
        }
        if(Score >= 500 && Score < 1000){
            return 2;
        }
        if(Score >= 100 && Score < 500){
            return 3;
        }else{
            return 4;
        }

    }

    }
