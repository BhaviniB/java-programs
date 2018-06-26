public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
public void loadProgram(String programName)
{
    System.out.print("The program"+programName+"is loading");

}
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
