class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
  private int distanceTravelled;
  public int victories;

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
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
      return Integer.compare(otherCar.getNumberOfVictories(), this.getNumberOfVictories()); // descending order
    }
}
