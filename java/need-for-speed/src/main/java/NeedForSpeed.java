class NeedForSpeed {
  private final int speed;
  private final int batteryDrain;
  private int battery = 100;
  private int distanceDriven = 0;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return battery - batteryDrain < 0;
  }

    public int distanceDriven() {
      return distanceDriven;
    }

    public void drive() {
      if (battery >= batteryDrain) {
        distanceDriven += speed;
        battery -= batteryDrain;
      }
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
      return speed;
    }
}

class RaceTrack {
  private final int distance;

    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      int raceDriven = 0; // assuming that car could have driven previous races
      while (!car.batteryDrained()) {
        car.drive();
        raceDriven += car.getSpeed();
        if (raceDriven >= distance) {
          return true;
        }
      }
      return false;
    }
}
