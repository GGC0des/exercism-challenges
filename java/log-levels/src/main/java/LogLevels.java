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
      //  throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
      /* Solution 1 Using indexOF () and substring()
       *
       */
      int endIndex = logLine.indexOf("]");
      return logLine.substring(1, endIndex).toLowerCase();

      // int endIndex = logLine.indexOf("]");

      // if (endIndex != -1) {
      //     return logLine.substring(1, endIndex).toLowerCase(); // Get log level from index 1 to endIndex
      // }

      // return ""; // Return empty if no closing bracket is found

// // Find the first and last square brackets to extract the log level
// int startIndex = logLine.indexOf("[") + 1;
// int endIndex = logLine.indexOf("]");
// return logLine.substring(startIndex, endIndex).toLowerCase(Locale.ROOT);

// //
// return logLine.split(":")[0].replaceAll("(\\[|\\])", "").toLowerCase(Locale.ROOT);

    }


    public static String reformat(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
      String formattedMessage = LogLevels.message(logLine);
      String formattedLog = LogLevels.logLevel(logLine);
      String reformatedLog = formattedMessage + " (" + formattedLog + ")";
      return reformatedLog;
    }
}
