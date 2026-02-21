package RailwayPlatformAllocation;

public class Train implements Comparable<Train> {
    String name;
    int arrivalTime; // simple integer (e.g., 10, 12, 15)

    public Train(String name, int arrivalTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Train other) {
        return this.arrivalTime - other.arrivalTime;
    }
}
