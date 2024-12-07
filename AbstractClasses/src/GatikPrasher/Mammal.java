package GatikPrasher;

public abstract class Mammal extends Animal {


    @Override
    public void move(String speed) {

        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");

    }

    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }
}
