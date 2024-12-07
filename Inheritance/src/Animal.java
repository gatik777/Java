public class Animal {
    protected String type;
    private String size;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    private double weight;

    public Animal() {


    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed) {
        System.out.println(type + " moves " + speed);
    }


    public void makeNoise() {
    }
}
