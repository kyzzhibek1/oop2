
public class Tablet extends Device {
    private boolean hasStylus;

    public Tablet(String type, double price, double weight, boolean hasStylus) {
        super(type, price, weight);
        this.hasStylus = hasStylus;
    }

}
