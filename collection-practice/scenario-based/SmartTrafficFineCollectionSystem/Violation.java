package SmartTrafficFineCollectionSystem;

public class Violation {
	String type;

    public Violation(String type) {
        this.type = type;
    }

    public double getFine() {
        if (type.equals("Signal Jump"))
            return 1000;
        else if (type.equals("No Helmet"))
            return 500;
        else if (type.equals("Overspeed"))
            return 1500;
        else
            return 300;
    }
}
