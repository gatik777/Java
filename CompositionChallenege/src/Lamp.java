public class Lamp {

    private String Style;
    private boolean battery;
    private int globRating;


    public Lamp(String style, boolean battery, int globRating) {
        Style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {

        System.out.println("The lamp is being turned on ");
    }

    public void setStyle(String style) {
        Style = style;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;

    }
}
