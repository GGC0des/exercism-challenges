import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random; // constructor allows to pass instance with a prediefined seed to make test results predicatable

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
      char[] planetaryClasses = {'D','H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
      int randomIndex = random.nextInt(planetaryClasses.length);
      return planetaryClasses[randomIndex];
    }

    String randomShipRegistryNumber() {
      return "NCC-" + (1000 + random.nextInt(9000));
    }

    double randomStardate() {
      return 41000.0 + 1000.0 * random.nextDouble();
    }
}
