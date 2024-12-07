public class EnhancedPlayer {

    private String fullName;

    private int healthPercentage;

    private String weapon;

    public EnhancedPlayer(String fullName) {
        this (fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = 1;
        }

        this.weapon = weapon;
    }
}
