public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this.duplex = duplex;
    }

    public Printer(int tonerLevel , boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {


        int tempAmount = tonerAmount + tonerLevel;

        if (tonerAmount > 100 || tonerAmount < 0) {
            tonerLevel += tonerAmount;
            return -1;

        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        return jobPages;
    }
}
