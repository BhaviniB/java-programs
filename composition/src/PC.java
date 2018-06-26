public class PC {


private Case theCase;
private Monitor theMonitor;
private Motherboard theMotherBoard;

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherBoard() {
        return theMotherBoard;
    }

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {

        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }
}

//advantage over inheritance, multiple inheritance is not supported but is made possible with the help of composition

