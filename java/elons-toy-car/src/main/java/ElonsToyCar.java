public class ElonsToyCar {
    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      String initialDistance = "Driven 0 meters";
      return initialDistance;
    }

    public String batteryDisplay() {
      String initialBattery = "Battery at 100%";
      return initialBattery;
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.drive()  method");
    }
}
