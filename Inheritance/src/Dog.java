public class Dog extends Animal {


    private String earShape;
    private String tailShape;






    public Dog(String type, String size, double weight, String tailShape, String earShape) {
        super(type, size, weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }






    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }



    public Dog() {
        super("Mutt", "Big", 50);
    }

    public void makeNoise () {


    }



    public void bark() {
        System.out.println("Woof! ");

    }



    public void run() {
        System.out.println("Dog Running ");

    }

    public void walk() {

        System.out.println("Dog walking");
    }

    public void wagTail() {

        System.out.println("Dog wag their tails");
    }

    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walks, run and wag their tail");

        if (speed == "slow") {
            walk();
            wagTail();

        } else {
            run();
            bark();

            System.out.println();

        }



    }



    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");

    }


    public Dog(String type, double weight , String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }




}