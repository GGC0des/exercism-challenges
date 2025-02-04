import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random; // allows to pass instance with a prediefined seed to make test results predicatable for testing

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
      char[] planetaryClasses = {'D','H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
      int randomIndex = random.nextInt(planetaryClasses.length);
      return planetaryClasses[randomIndex];
    }

    String randomShipRegistryNumber() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
