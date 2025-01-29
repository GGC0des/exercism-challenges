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
        distanceDriven += this.speed;
        battery -= this.batteryDrain;
      }
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed(50, 5);
    }
}

class RaceTrack {
  public int distance;

    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      int totalBatteryDrain = (car.distanceDriven() / car.speed) * car.batteryDrain;
      return totalBatteryDrain <= car.battery;
    }
}
