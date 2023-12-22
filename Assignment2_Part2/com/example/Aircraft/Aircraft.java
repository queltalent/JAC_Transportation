package Assignment2_Part2.com.example.Aircraft;

public class Aircraft {
    protected double price;
    protected double maximumElevation;
    protected long serialNumber;
    private static long serialNumberCounter = 75000;

    public Aircraft(){
        this.price = 200000;
        this.maximumElevation = 11000;
        this.serialNumber = getNextSerialNumber();
    }

    public Aircraft(double price, double maxElevation){
        this.price = price;
        this.maximumElevation = maxElevation;
        this.serialNumber = getNextSerialNumber();
    }

    public Aircraft(Aircraft other){
        this.price = other.price;
        this.maximumElevation = other.maximumElevation;
        this.serialNumber = getNextSerialNumber();
    }

    public double getPrice(){
        return price;
    }

    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString() {
        return "Aircraft - Serial #" + serialNumber + " - Price: $" + price +
                ", Maximum Elevation: " + maximumElevation + " meters";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aircraft other = (Aircraft) obj;
        return Double.compare(other.price, this.price) == 0 &&
                Double.compare(other.maximumElevation, this.maximumElevation) == 0;
    }
}
