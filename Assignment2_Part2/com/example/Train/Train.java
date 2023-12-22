package Assignment2_Part2.com.example.Train;

import Assignment2_Part2.com.example.Transportation.WheeledTransportation;

public class Train extends WheeledTransportation {
    protected int numberOfVehicles;
    protected String startingStation;
    protected String destinationStation;
    protected long serialNumber;
    private static long serialNumberCounter = 10000;

    public Train(){
        this.numberOfVehicles = 5;
        this.startingStation = "Toronto";
        this.destinationStation = "Montreal";
        this.serialNumber = getNextSerialNumber();
    }

    public Train(int numberOfWheels, double maximumSpeed,int numberOfVehicles,String startingStation,String destinationStation) {
        super(numberOfWheels,maximumSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.startingStation = startingStation;
        this.destinationStation = destinationStation;
        this.serialNumber = getNextSerialNumber();
    }
    public Train(Train other) {
        super(other);
        this.numberOfVehicles = other.numberOfVehicles;
        this.startingStation = other.startingStation;
        this.destinationStation = other.destinationStation;
        this.serialNumber = getNextSerialNumber();
    }

    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString(){
        return "Train - Serial #" + serialNumber + " - has " + numberOfWheels * numberOfVehicles +
                " wheels, has a maximum speed of " + maximumSpeed + " km/hr. It has " + numberOfVehicles +
                " vehicles, and its starting and destination stations are " + startingStation + " and " + destinationStation;

    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train that = (Train) obj;
        return this.numberOfWheels == that.numberOfWheels && Double.compare(that.maximumSpeed, this.maximumSpeed) == 0 &&
                this.numberOfVehicles == that.numberOfVehicles && this.startingStation.equals(that.startingStation) &&
                this.destinationStation.equals(that.destinationStation);
    }
}

