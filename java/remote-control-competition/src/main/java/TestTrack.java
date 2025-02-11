import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
      car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
          cars.sort(null); // passing null tells sort() to use the natural ordering defined by Comparable; Java 8+ use import Collections & Collections.sort(cars)
          return cars;
      }

    }

    // FOR FUN - If Test would allow for additional instance fields, a leaderboard could be printed like this

    // public static void displayLeaderboard(List<ProductionRemoteControlCar> cars) {
    //   System.out.println("Leaderboard - Victories by Car:");
    //   for (ProductionRemoteControlCar car : cars) {
    //     System.out.println(car.getName() + " - " + car.getNumberOfVictories() + " victories");
    //   }
    // }
