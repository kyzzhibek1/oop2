import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        List<Device> devices = new ArrayList<>();

        System.out.print("Enter the number of devices you want to create (between 1 and 20): ");
        int numDevices = scanner.nextInt();

        double totalPrice = 0;
        double totalWeight = 0;

        for (int i = 0; i < numDevices; i++) {
            int deviceType = rand.nextInt(3);
            double price = 500 + rand.nextDouble() * 500;
            double weight = 100 + rand.nextDouble() * 900;

            if (deviceType == 0) {
                devices.add(new Smartphone("Smartphone", price, weight, 5.0 + rand.nextDouble(), 12 + rand.nextInt(36)));
            } else if (deviceType == 1) {
                devices.add(new Laptop("Laptop", price, weight, "Windows", 8 + rand.nextInt(8)));
            } else {
                devices.add(new Tablet("Tablet", price, weight, rand.nextBoolean()));
            }

            totalPrice += price;
            totalWeight += weight;
        }

        Set<String> distinctTypes = new HashSet<>();
        for (Device device : devices) {
            distinctTypes.add(device.getType());
        }

        System.out.println("Number of distinct device types: " + distinctTypes.size());
        System.out.println("Total price of all devices: " + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight);
    }
}
