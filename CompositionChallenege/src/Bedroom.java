public class Bedroom {


    private String wall1;
    private String wall2;
    private String wall3;
    private String wall4;
    Bed bed = new Bed();
    Ceiling ceiling = new Ceiling();

    public Bedroom(String wall1, String wall2, String wall3, String wall4, Bed bed, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    Lamp lamp = new Lamp("Blue", true , 36);

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;

    }

    public Bed Make() {
        return bed;
    }
}
