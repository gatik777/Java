public class Circle {


    public Circle(double radius) {

        double PI = 3.14;



        if (radius < 0) {
            System.out.println(0);

        }

        else {

            double getArea = radius * radius * PI;

        }



    }
    public class Cylinder extends Circle{
        public Cylinder(double radius , double height) {
            super(radius);


            Circle Cylinder = new Circle(radius);
            double getArea = radius * height;

            if (height < 0) {
                height = 0;

            }

            double getHeight = height;
            System.out.println(getHeight);

            double getVolume = radius * height;
            System.out.println(getVolume);

        }

    }


}






