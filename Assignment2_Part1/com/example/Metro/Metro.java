package Assignment2_Part1.com.example.Metro;

import Assignment2_Part1.com.example.Train.Train;

public class Metro extends Train {
    private int totalNumberOfStops;
    private long serialNumber;
    private static long serialNumberCounter = 25000;

    public Metro(){
        this.totalNumberOfStops = 10;
        this.serialNumber = getNextSerialNumber();
    }

    public Metro(int numberOfWheels, double maximumSpeed,
                 int numberOfVehicles, String startingStation, String destinationStation,
                 int totalNumberOfStops) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation, destinationStation);
        this.totalNumberOfStops = totalNumberOfStops;
        this.serialNumber = getNextSerialNumber();
    }
    public Metro(Metro other) {
        super(other);
        this.totalNumberOfStops = other.totalNumberOfStops;
        this.serialNumber = getNextSerialNumber();
    }
    public int getTotalNumberOfStops(){
        return totalNumberOfStops;
    }

    // Next serial number method
    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString(){
        return "Metro - Serial #" + serialNumber + " - has " + numberOfWheels * numberOfVehicles +
                " wheels, has a maximum speed of " + maximumSpeed + " km/hr. It has " + numberOfVehicles +
                " vehicles, and its starting and destination stations are " + startingStation + " and " + destinationStation +
                " and it has " + totalNumberOfStops + " stops. ";

    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Metro that = (Metro) obj;
        return this.numberOfWheels == that.numberOfWheels && Double.compare(that.maximumSpeed, this.maximumSpeed) == 0 &&
                this.numberOfVehicles == that.numberOfVehicles && this.startingStation.equals(that.startingStation) &&
                this.destinationStation.equals(that.destinationStation) && this.totalNumberOfStops == that.totalNumberOfStops;
    }
}