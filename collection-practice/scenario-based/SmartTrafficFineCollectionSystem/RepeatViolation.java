package SmartTrafficFineCollectionSystem;

public class RepeatViolation extends Violation {

    public RepeatViolation(String type) {
        super(type);
    }

    @Override
    public double getFine() {
        return super.getFine() + 500; // extra penalty
    }
}
