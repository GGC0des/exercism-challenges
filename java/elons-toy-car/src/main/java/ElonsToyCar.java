public class ElonsToyCar {
    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      String initialDistance = "Driven 0 meters";
      return initialDistance;
    }

    public String batteryDisplay() {
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.drive()  method");
    }
}
