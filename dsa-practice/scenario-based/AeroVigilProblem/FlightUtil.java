package AeroVigilProblem;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException {

        try {
            if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
                throw new InvalidFlightException(
                        "The flight number " + flightNumber + " is invalid");
            }
            return true;
        } catch (InvalidFlightException e) {
            throw e;
        }
    }

    public void validateFlightName(String flightName)
            throws InvalidFlightException {

        try {
            if (!(flightName.equals("SpiceJet")
                    || flightName.equals("IndiGo")
                    || flightName.equals("Vistara"))) {

                throw new InvalidFlightException(
                        "The flight name " + flightName + " is invalid");
            }
        } catch (InvalidFlightException e) {
            throw e;
        }
    }

    public void validatePassengerCount(String flightName, int passengers)
            throws InvalidFlightException {

        try {
            if ((flightName.equals("SpiceJet") && passengers > 200) ||
                (flightName.equals("IndiGo") && passengers > 220) ||
                (flightName.equals("Vistara") && passengers > 180)) {

                throw new InvalidFlightException(
                        "The passenger count " + passengers +
                        " is invalid for " + flightName);
            }
        } catch (InvalidFlightException e) {
            throw e;
        }
    }

    public double calculateFuel(double currentFuelLevel, String flightName)
            throws InvalidFlightException {

    	try {
            double maxCapacity;

            if (flightName.equals("SpiceJet")) {
                maxCapacity = 200000;
            } else if (flightName.equals("Vistara")) {
                maxCapacity = 300000;
            } else if (flightName.equals("IndiGo")) {
                maxCapacity = 250000;
            } else if (flightName.equals("Air Arabia")) {
                maxCapacity = 150000;
            } else {
                throw new InvalidFlightException(
                        "Invalid fuel level for " + flightName);
            }

            if (currentFuelLevel < 0 || currentFuelLevel > maxCapacity) {
                throw new InvalidFlightException(
                        "Invalid fuel level for " + flightName);
            }

            return maxCapacity - currentFuelLevel;

        } catch (InvalidFlightException e) {
            throw e;
        }
    }
}
