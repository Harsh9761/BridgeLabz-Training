package SmartTrafficFineCollectionSystem;

import java.util.*;

public class TrafficSystem {

    public static void main(String[] args) {

        Map<String, List<Violation>> map = new HashMap<>();

        try {
            addViolation(map, "PB10AB1234", new Violation("Signal Jump"));
            addViolation(map, "PB10AB1234", new RepeatViolation("Overspeed"));
            addViolation(map, "DL05CD5678", new Violation("No Helmet"));

            generateReport(map);

        } catch (InvalidVehicleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void addViolation(Map<String, List<Violation>> map,
                             String vehicleNo,
                             Violation v)
            throws InvalidVehicleException {

        if (vehicleNo == null || vehicleNo.isEmpty())
            throw new InvalidVehicleException("Invalid Vehicle Number");

        map.computeIfAbsent(vehicleNo, k -> new ArrayList<>()).add(v);
    }

    static void generateReport(Map<String, List<Violation>> map) {

        System.out.println("---- Monthly Report ----");

        for (String vehicle : map.keySet()) {

            double total = 0;
            System.out.println("Vehicle: " + vehicle);

            for (Violation v : map.get(vehicle)) {
                System.out.println("Fine: " + v.getFine());
                total += v.getFine();
            }

            System.out.println("Total Fine: " + total);
            System.out.println();
        }
    }
}