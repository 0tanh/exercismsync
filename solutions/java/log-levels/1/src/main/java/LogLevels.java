public class LogLevels {
    
    public static String message(String logLine) {

        String[] splitLog = logLine.split(":");
        return splitLog[1].strip();
    }

    public static String logLevel(String logLine) {
        String[] splitLog = logLine.split(":");
        return splitLog[0]
                .replace("[", "")
                .replace("]", "")
                .trim()
                .toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return String.format("%s (%s)", message, logLevel);
    }
}
