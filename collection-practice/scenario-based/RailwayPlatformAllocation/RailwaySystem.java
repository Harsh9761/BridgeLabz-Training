package RailwayPlatformAllocation;

import java.util.*;

public class RailwaySystem {

    public static void main(String[] args) {

        Map<Integer, Platform> platforms = new HashMap<>();

        // Create 3 platforms
        platforms.put(1, new Platform(1));
        platforms.put(2, new Platform(2));
        platforms.put(3, new Platform(3));

        PriorityQueue<Train> trains = new PriorityQueue<>();

        trains.add(new Train("Express A", 10));
        trains.add(new Train("Express B", 5));
        trains.add(new Train("Express C", 8));

        try {
            allocatePlatforms(platforms, trains);
        } catch (PlatformUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

    static void allocatePlatforms(Map<Integer, Platform> platforms,
                                  PriorityQueue<Train> trains)
            throws PlatformUnavailableException {

        while (!trains.isEmpty()) {

            Train train = trains.poll();
            boolean allocated = false;

            for (int i = 1; i <= platforms.size(); i++) {
                Platform p = platforms.get(i);

                if (!p.isOccupied) {
                    p.isOccupied = true;
                    System.out.println(train.name +
                            " allocated to Platform " + p.platformNumber);
                    allocated = true;
                    break;
                }
            }

            if (!allocated) {
                throw new PlatformUnavailableException(
                        "No platform available for " + train.name);
            }
        }
    }
}
