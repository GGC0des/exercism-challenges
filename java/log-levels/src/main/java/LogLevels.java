public class LogLevels {

    public static String message(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
      //
      /* Solution 1 - Using split() and trim()
       * split string at ":" & extract part at index 1
       * trim any leading/trailing spaces, eg. \r\n (carriage return and newline)
       */
      //return logLine.split(":")[1].trim();
      //
      //
      /* Solution 2 - Using substring() and indexOf()
       * indexOf(":") finds the position of the colon
       * store index of colon in `int colonIndex`
       * substring(colonIndex + 1) extracts everything after ":"
       * trim() any leading/trailing spaces
       */
      int colonIndex = logLine.indexOf(":");
      return logLine.substring(colonIndex + 1).trim();

    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
