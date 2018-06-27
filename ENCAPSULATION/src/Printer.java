public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {

        if(tonerLevel<-1&& tonerLevel<=100){
        this.tonerLevel = tonerLevel;}
        else  {
            this.tonerLevel=-1;
              }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }


    public int addToner(int tonerAmt){

        if(tonerAmt>0 && tonerAmt<=100)
        {
            if(this.tonerLevel+tonerAmt>100)
            {
                return -1;

            }
            this.tonerLevel+=tonerAmt;
            return this.tonerLevel;

        }

        else return -1;


    }

    public  int printPages(int pages){


    int pagesToPrint=pages;
    if(this.isDuplex){
        pagesToPrint/=2;
        System.out.print("printing in duplex mode");


    }

    this.numberOfPagesPrinted+=pagesToPrint;
    return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
