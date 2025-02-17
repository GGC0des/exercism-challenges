public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int dinstanceTravelled;

    public ExperimentalRemoteControlCar() {
      this.dinstanceTravelled = 0;
    }
    @Override
    public void drive() {
        dinstanceTravelled += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return dinstanceTravelled;
    }
}
