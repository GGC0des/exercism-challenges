class NeedForSpeed {
  public int speed;
  public int batteryDrain;
  public int battery = 100;
  public int distanceDriven = 0;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return battery < 1 || battery < batteryDrain;
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
}

class RaceTrack {
  public int distance;

    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      int currentBattery = car.battery;
      int currentDistance = 0;
      while (currentBattery >= car.batteryDrain && currentDistance < distance) {
        currentDistance += car.speed;
        currentBattery -= car.batteryDrain;
      }
      return currentDistance >= distance;
    }
}
