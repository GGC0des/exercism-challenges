public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() throws IllegalAccessException {
        String lvl = logLine.substring(1,4);
        return switch (lvl) {
          case "TRC" -> LogLevel.TRACE;
          case "DBG" -> LogLevel.DEBUG;
          case "INF" -> LogLevel.INFO;
          case "WRN" -> LogLevel.WARNING;
          case "ERR" -> LogLevel.ERROR;
          case "FTL" -> LogLevel.FATAL;
          default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
