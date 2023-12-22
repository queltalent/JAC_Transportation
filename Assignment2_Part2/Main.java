package Assignment2_Part2;

import Assignment2_Part2.com.example.Aircraft.Aircraft;
import Assignment2_Part2.com.example.Aircraft.WorldWarIIAirplane;
import Assignment2_Part2.com.example.Ferry.Ferry;
import Assignment2_Part2.com.example.Metro.Metro;
import Assignment2_Part2.com.example.Monowheel.Monowheel;
import Assignment2_Part2.com.example.Train.Train;
import Assignment2_Part2.com.example.Train.Tram;
import Assignment2_Part2.com.example.Transportation.WheeledTransportation;

public class Main {
    public static void main(String[] args) {
        WheeledTransportation bike1 = new WheeledTransportation();
        Train train1 = new Train();
        Metro metro1 = new Metro();
        Tram tram1 = new Tram();
        Monowheel monowheel1 = new Monowheel();
        Ferry ferry1 = new Ferry();
        Aircraft aircraft1 = new Aircraft();
        WorldWarIIAirplane warplane1 = new WorldWarIIAirplane();

        WheeledTransportation bike2 = new WheeledTransportation(2,30);
        Train train2 = new Train(4, 100, 10, "Beijing", "Shanghai");
        Metro metro2 = new Metro(4, 80, 8, "Verdun", "Saint Laurent", 12);
        Tram tram2 = new Tram(4, 60, 5, "A", "B", 6, 1990);
        Monowheel monowheel2 = new Monowheel(1, 15, 100);
        Ferry ferry2 = new Ferry(40, 2000);
        Aircraft aircraft2 = new Aircraft(500000, 10000);
        WorldWarIIAirplane warplane2 = new WorldWarIIAirplane(750000, 12000, true);

        WheeledTransportation bike3 = new WheeledTransportation(bike2);
        Train train3 = new Train(train2);
        Metro metro3 = new Metro(metro2);
        Tram tram3 = new Tram(tram2);
        Monowheel monowheel3 = new Monowheel(monowheel2);
        Ferry ferry3 = new Ferry(ferry2);
        Aircraft aircraft3 = new Aircraft(aircraft2);
        WorldWarIIAirplane warplane3 = new WorldWarIIAirplane(warplane2);

//        Object[] mixedObjects1 = {bike1, train1, metro1, tram1, monowheel1, ferry1, aircraft1,
//                                  bike2, train2, metro2, tram2, monowheel2, ferry2, aircraft2, warplane2};

        Object[] mixedObjects1 = new Object[20];
        mixedObjects1[0] = new WheeledTransportation(bike2);
        mixedObjects1[1] = new Train(train2);
        mixedObjects1[2] = new Metro(metro2);
        mixedObjects1[3] = new Tram(tram2);
        mixedObjects1[4] = new Monowheel(monowheel2);
        mixedObjects1[5] = new Ferry(ferry2);
        mixedObjects1[6] = new Aircraft(aircraft2);
        mixedObjects1[7] = new WorldWarIIAirplane(warplane2);

        Object[] copyMixedObjects1 = copyTheObjects(mixedObjects1);

        System.out.println("Original Array: ");
        for (Object obj : mixedObjects1) {
            if (obj != null){
                System.out.println(obj);
            }

        }
        System.out.println("\nCopied Array: ");
        for (Object obj : copyMixedObjects1) {
            if (obj != null){
                System.out.println(obj);
            }
        }
    }

    public static Object[] copyTheObjects(Object[] objects){
        Object[] copy = new Object[objects.length];
        for(int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Ferry) {
                copy[i] = new Ferry((Ferry) objects[i]);
            } else if (objects[i] instanceof Monowheel) {
                copy[i] = new Monowheel((Monowheel) objects[i]);
            } else if (objects[i] instanceof WorldWarIIAirplane) {
                copy[i] = new WorldWarIIAirplane((WorldWarIIAirplane) objects[i]);
            } else if (objects[i] instanceof Aircraft) {
                copy[i] = new Aircraft((Aircraft) objects[i]);
            } else if (objects[i] instanceof Tram) {
                copy[i] = new Tram((Tram) objects[i]);
            } else if (objects[i] instanceof Metro) {
                copy[i] = new Metro((Metro) objects[i]);
            } else if (objects[i] instanceof Train) {
                copy[i] = new Train((Train) objects[i]);
            } else if (objects[i] instanceof WheeledTransportation){
                copy[i] = new WheeledTransportation((WheeledTransportation) objects[i]);
            } else {
                copy[i] = null;
            }
        }
        return copy;
    }
}