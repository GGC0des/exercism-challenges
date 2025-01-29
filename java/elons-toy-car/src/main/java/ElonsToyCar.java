public class ElonsToyCar {
    private int distanceDriven;
    private int batteryLevel = 100;

    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
      if (batteryLevel >= 1) {
        return String.format("Battery at %d%%", batteryLevel);
      }
      return "Battery empty";
    }

    public void drive() {
      if (batteryLevel >= 1) {
        distanceDriven += 20;
        batteryLevel -= 1;
      }
    }
}
