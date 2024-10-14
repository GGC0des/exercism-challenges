public class LogLevels {

    public static String message(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
      return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
