package Assignment2_Part1;

import Assignment2_Part1.com.example.Aircraft.Aircraft;
import Assignment2_Part1.com.example.Aircraft.WorldWarIIAirplane;
import Assignment2_Part1.com.example.Ferry.Ferry;
import Assignment2_Part1.com.example.Metro.Metro;
import Assignment2_Part1.com.example.Monowheel.Monowheel;
import Assignment2_Part1.com.example.Train.Train;
import Assignment2_Part1.com.example.Train.Tram;
import Assignment2_Part1.com.example.Transportation.WheeledTransportation;

public class MainDriver {
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

        Object[] mixedObjects1 = {bike1, train1, metro1, tram1, monowheel1, ferry1, aircraft1,
                                  bike2, train2, metro2, tram2, monowheel2, ferry2, aircraft2, warplane2};
        Object[] mixedObjects2 = {bike2, train2, metro2, tram2, monowheel2, ferry2, ferry2,
                                  bike1, train1, metro1, tram1, monowheel1, ferry1, ferry1,
                                  bike3, train3, metro3, tram3, monowheel3, ferry3};
        Object[] mixedObjects3 = {bike1, train1, metro1, tram1, monowheel1, ferry1, aircraft1,
                                  bike2, train2, metro2, tram2, monowheel2, ferry2};

        System.out.println(bike1 + "\n" + train1 + "\n" + metro1 + "\n" + tram1 + "\n" + monowheel1 + "\n" + ferry1  + "\n" + aircraft1  + "\n" + warplane1 + "\n");
        System.out.println(bike2 + "\n" + train2 + "\n" + metro2 + "\n" + tram2 + "\n" + monowheel2 + "\n" + ferry2  + "\n" + aircraft2  + "\n" + warplane2 + "\n");
        System.out.println(bike3 + "\n" + train3 + "\n" + metro3 + "\n" + tram3 + "\n" + monowheel3 + "\n" + ferry3  + "\n" + aircraft3  + "\n" + warplane3 + "\n");

        System.out.println("bike1.equals(warplane1) : " + bike1.equals(warplane1));
        System.out.println("metro1.equals(metro2) : " + metro1.equals(metro2));
        System.out.println("bike1.equals(monowheel1) : " + bike1.equals(monowheel1));
        System.out.println("tram2.equals(tram3) : " + tram2.equals(tram3));
        System.out.println();

        findLeastAndMostExpensiveAircraft(mixedObjects1);
        findLeastAndMostExpensiveAircraft(mixedObjects2);
        findLeastAndMostExpensiveAircraft(mixedObjects3);

    }
    public static void findLeastAndMostExpensiveAircraft(Object[] objects) {
        Aircraft leastExpensive = null;
        Aircraft mostExpensive = null;

        for (Object obj : objects) {
            if (obj instanceof Aircraft) {
                Aircraft current = (Aircraft) obj;
                if (leastExpensive == null || current.getPrice() < leastExpensive.getPrice()) {
                    leastExpensive = current;
                }
                if (mostExpensive == null || current.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = current;
                }
            }
        }

        if (leastExpensive != null) {
            System.out.println("Least Expensive Aircraft: " + leastExpensive);
        } else {
            System.out.println("No Aircraft found for least expensive comparison.");
        }

        if (mostExpensive != null) {
            System.out.println("Most Expensive Aircraft: " + mostExpensive);
        } else {
            System.out.println("No Aircraft found for most expensive comparison.");
        }
    }
}