public class Laptop extends Device {
    private String operatingSystem;
    private int ram;

    public Laptop(String type, double price, double weight, String operatingSystem, int ram) {
        super(type, price, weight);
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

}
