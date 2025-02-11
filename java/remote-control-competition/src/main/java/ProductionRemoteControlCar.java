class ProductionRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled;

    public ProductionRemoteControlCar() {
      this.distanceTravelled = 0;
    }


    @Override
    public void drive() {
      distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
      return distanceTravelled;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
}
