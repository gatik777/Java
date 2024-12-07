public class Products {

    private String model;
    private String manufacturer;
    private String motherboard;
    private int width;
    private int height;
    private int depth;

    public Products(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.motherboard = motherboard;
    }




}

class Monitor extends Products {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x , int y, String color) {
        System.out.println(String.format("Drawing pixel at %d,%d in color %s " , x , y, color));

    }

    public Monitor(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);

    }





static class MotherBoard extends Products {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;


    }




    public void LoadProgram(String programName, String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        System.out.println("Program: " + programName + "is now loading...");


    }



    public MotherBoard(String model, String manufacturer){
        super(model, manufacturer);
    }
}


static class ComputerCase extends Products {

        private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;

    }

    public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }

    public void pressPowerButton() {
        System.out.println("Power button pressed");

    }

    }



}









