package Assignment2_Part2.com.example.Aircraft;

public class WorldWarIIAirplane extends Aircraft{
    private boolean twinEngine;
    private long serialNumber;
    private static long serialNumberCounter = 80000;

    public WorldWarIIAirplane() {
        super();
        this.twinEngine = false;
        this.serialNumber = getNextSerialNumber();
    }

    public WorldWarIIAirplane(double price, double maximumElevation, boolean twinEngine) {
        super(price, maximumElevation);
        this.twinEngine = twinEngine;
        this.serialNumber = getNextSerialNumber();
    }

    public WorldWarIIAirplane(WorldWarIIAirplane other) {
        super(other);
        this.twinEngine = other.twinEngine;
        this.serialNumber = getNextSerialNumber();
    }

    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString() {
        return "World War II Airplane - Serial #" + serialNumber + " - Price: $" + price +
                ", Maximum Elevation: " + maximumElevation + " meters, Twin Engine: " + twinEngine;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        WorldWarIIAirplane other = (WorldWarIIAirplane) obj;
        return twinEngine == other.twinEngine;
    }
}
