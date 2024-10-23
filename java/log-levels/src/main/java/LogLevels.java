public class LogLevels {

    public static String message(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
      /* Solution 1 - Using split() and trim()
       split string at ":" & extract part at index 1
       trim any leading/trailing spaces, eg. \r\n (carriage return and newline) */
      //return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
