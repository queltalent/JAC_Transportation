package Assignment2_Part2.com.example.Ferry;

public class Ferry {
    protected double maximumSpeed;
    protected double maximumLoad;
    protected long serialNumber;
    private static long serialNumberCounter = 70000;

    public Ferry() {
        this.maximumSpeed = 50;
        this.maximumLoad = 5000;
        this.serialNumber = getNextSerialNumber();
    }

    public Ferry(double maximumSpeed, double maximumLoad) {
        this.maximumSpeed = maximumSpeed;
        this.maximumLoad = maximumLoad;
        this.serialNumber = getNextSerialNumber();
    }

    public Ferry(Ferry other) {
        this.maximumSpeed = other.maximumSpeed;
        this.maximumLoad = other.maximumLoad;
        this.serialNumber = getNextSerialNumber();
    }
    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString() {
        return "Ferry - Serial #" + serialNumber + " - Maximum Speed: " + maximumSpeed +
                " km/hr, Maximum Load: " + maximumLoad + " tons";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ferry other = (Ferry) obj;
        return Double.compare(other.maximumSpeed, maximumSpeed) == 0 &&
                Double.compare(other.maximumLoad, maximumLoad) == 0;
    }
}
