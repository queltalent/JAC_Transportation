package Assignment2_Part1.com.example.Transportation;

public class WheeledTransportation {
    protected int numberOfWheels;
    protected double maximumSpeed;
    protected long serialNumber;
    private static long serialNumberCounter = 9000;

    public WheeledTransportation(){
        this.numberOfWheels = 2;
        this.maximumSpeed = 150;
        this.serialNumber = getNextSerialNumber();
    }
    public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.serialNumber = getNextSerialNumber();
    }
    public WheeledTransportation(WheeledTransportation other) {
        this.numberOfWheels = other.numberOfWheels;
        this.maximumSpeed = other.maximumSpeed;
        this.serialNumber = getNextSerialNumber();
    }

    // Next serial number method
    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString(){
        return "WheeledTransportation - Serial #" + serialNumber + " - has " + numberOfWheels +
                " wheels, has a maximum speed of " + maximumSpeed + " km/hr.";

    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WheeledTransportation that = (WheeledTransportation) obj;
        return numberOfWheels == that.numberOfWheels &&
                Double.compare(that.maximumSpeed, maximumSpeed) == 0;
    }
}
