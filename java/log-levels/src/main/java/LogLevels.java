public class LogLevels {

    public static String message(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");

      /* Solution 1
       * Using split() and trim()
       * split string at ":" & extract part at index 1
       * trim any leading/trailing spaces, eg. \r\n (carriage return and newline)
       */
      //return logLine.split(":")[1].trim();


      /* Solution 2
       * Using substring() and indexOf()
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

      // Solution 1 Using indexOF () and substring()
      int endIndex = logLine.indexOf("]");
      return logLine.substring(1, endIndex).toLowerCase();


      /* Solution 1 using a loop
       * int endIndex = logLine.indexOf("]");
       * if (endIndex != -1) {
       *   return logLine.substring(1, endIndex).toLowerCase();
       *   }
       * return ""; // Return empty if no closing bracket is found
       */


      // Solution 2 - using split()
      // return logLine.split(":")[0].replaceAll("(\\[|\\])", "").toLowerCase(Locale.ROOT);

      
      /* Solution 3 - using substring()
       * int startIndex = logLine.indexOf("[") + 1;
       * int endIndex = logLine.indexOf("]");
       * return logLine.substring(startIndex, endIndex).toLowerCase(Locale.ROOT); // Locale.ROOT ignores environment spelling settings
       */
    }


    public static String reformat(String logLine) {
      // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
      // Solution using previous message() & logLevel() method
      String formattedMessage = LogLevels.message(logLine);
      String formattedLog = LogLevels.logLevel(logLine);
      String reformatedLog = formattedMessage + " (" + formattedLog + ")";
      return reformatedLog;
    }
}
