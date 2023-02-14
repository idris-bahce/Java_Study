package ChallangeOfInheritence;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int addToner(int tonerAmount){
        if (tonerAmount + tonerLevel >100){
            return -1;
        }
        return tonerAmount + tonerLevel;
    }
    public void printPages(int pages){

    }
}
