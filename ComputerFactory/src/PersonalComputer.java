public class PersonalComputer extends Products {

    private Monitor.ComputerCase computerCase;
    private Monitor monitor;
    private Monitor.MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer,
                            Monitor.ComputerCase computerCase,
                            Monitor monitor,
                            Monitor.MotherBoard motherBoard) {


        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;

    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");

    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();

        powerUp();



    }






//    public Monitor.ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Monitor.MotherBoard getMotherboard() {
//
//        return motherBoard;
//
//
//    }




}
