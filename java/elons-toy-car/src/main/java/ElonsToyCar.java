public class ElonsToyCar {
    private int distanceDriven;
    private int batteryLevel = 100;

    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
      if (batteryLevel >= 1) {
        return "Battery at " + batteryLevel + "%";
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
