public class Main {
    public static void main(String[] args) {
        Monitor.ComputerCase theCase = new Monitor.ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 * 1440");

        Monitor.MotherBoard theMotherBoard = new Monitor.MotherBoard("BJ-200", "Asus", 4, 6 , "2.44");

        PersonalComputer thePC = new PersonalComputer("2208" , "Dell", theCase , theMonitor , theMotherBoard);

        

    }



}
