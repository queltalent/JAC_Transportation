package Assignment2_Part2.com.example.Train;
import Assignment2_Part2.com.example.Metro.Metro;

public class Tram extends Metro {
    private int yearOfCreation;
    private long serialNumber;
    private static long serialNumberCounter = 30000;

    public Tram() {
        super();
        this.yearOfCreation = 2011;
        this.serialNumber = getNextSerialNumber();
    }

    public Tram(int numberOfWheels, double maximumSpeed,
                int numberOfVehicles, String startingStation, String destinationStation, int totalNumberOfStops,
                int yearOfCreation) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation,
                destinationStation, totalNumberOfStops);
        this.yearOfCreation = yearOfCreation;
        this.serialNumber = getNextSerialNumber();
    }

    public Tram(Tram other) {
        super(other);
        this.yearOfCreation = other.yearOfCreation;
        this.serialNumber = getNextSerialNumber();
    }

    private static long getNextSerialNumber() {
        return serialNumberCounter++;
    }

    public String toString(){
        return "Tram - Serial #" + serialNumber + " - has " + numberOfWheels * numberOfVehicles +
                " wheels, has a maximum speed of " + maximumSpeed + " km/hr. It has " + numberOfVehicles +
                " vehicles, and its starting and destination stations are " + startingStation + " and " + destinationStation +
                " and it has " + super.getTotalNumberOfStops() + " stops. It was created in " + yearOfCreation;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tram that = (Tram) obj;
        return this.numberOfWheels == that.numberOfWheels && Double.compare(that.maximumSpeed, this.maximumSpeed) == 0 &&
                this.numberOfVehicles == that.numberOfVehicles && this.startingStation.equals(that.startingStation) &&
                this.destinationStation.equals(that.destinationStation) && this.getTotalNumberOfStops() == that.getTotalNumberOfStops() &&
                this.yearOfCreation == that.yearOfCreation;
    }

}
