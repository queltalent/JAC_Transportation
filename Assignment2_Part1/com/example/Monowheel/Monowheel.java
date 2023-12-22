package Assignment2_Part1.com.example.Monowheel;

import Assignment2_Part1.com.example.Transportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
    private double maximumWeight;
    private long serialNumber;
    private static long serialNumberCounter = 55000;

    public Monowheel() {
        super();
        this.numberOfWheels = 1;
        this.maximumWeight = 100;
        this.serialNumber = getNextSerialNumber();
    }

    // Parameterized constructor
    public Monowheel(int numberOfWheels, double maximumSpeed, double maximumWeight) {
        super(numberOfWheels, maximumSpeed);  // Call the parameterized constructor of the superclass
        this.maximumWeight = maximumWeight;
        this.serialNumber = getNextSerialNumber();  // Assign unique serial number
    }

    // Copy constructor
    public Monowheel(Monowheel other) {
        super(other.numberOfWheels, other.maximumSpeed);  // Use the superclass constructor to copy values
        this.maximumWeight = other.maximumWeight;
        // Note: We assign a new serial number to ensure uniqueness
        this.serialNumber = getNextSerialNumber();
    }

    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString() {
        return "Monowheel - Serial #" + serialNumber +
                ", Number of Wheels: " + numberOfWheels +
                ", Maximum Speed: " + maximumSpeed + " km/hr" +
                ", Maximum Weight: " + maximumWeight + " kg";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monowheel that = (Monowheel) obj;
        return numberOfWheels == that.numberOfWheels &&
                Double.compare(that.maximumSpeed, maximumSpeed) == 0 &&
                Double.compare(that.maximumWeight, maximumWeight) == 0;
    }
}
