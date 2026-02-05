package AeroVigilProblem;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();

        try {
            System.out.println("Enter flight details");
            String input = sc.nextLine();

            String[] details = input.split(":");

            String flightNo = details[0];
            String flightName = details[1];
            int passengers = Integer.parseInt(details[2]);
            
            double fuel = Double.parseDouble(details[3]);

            util.validateFlightNumber(flightNo);
            
            util.validateFlightName(flightName);
            util.validatePassengerCount(flightName, passengers);

            double fuelRequired =
                    util.calculateFuel(fuel, flightName);

            System.out.println(
                "Fuel required to fill the tank: " +
                fuelRequired + " liters");

        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

	}

}
