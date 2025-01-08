class SqueakyClean {
  // creating a static method so that it can be called without having to create an object instance of the class
    static String clean(String identifier) {
      if (identifier == null || identifier.isEmpty()) {
        return identifier; // Handle null or empty input
      }
      // Step 1: Replace spaces with underscores
      identifier = identifier.replace(" ","_");

      // Step 3: Convert leetspeak to text BEFORE CamelCase conversion i.e. y0u-4r3-my-w0rld to turn into youAreMyWorld instead of youareMyWorld
      if (containsLeetspeak(identifier)) {
        identifier = leetspeakToText(identifier);
      }

      // Step 2: Convert kebab-case to camelCase
      if (identifier.contains("-")) {
        identifier = kebabToCamelCase(identifier);
      }

      // Step 4: Remove any characters that are NOT letters, numbers, spaces, or underscores
      identifier = identifier.replaceAll("[^a-zA-Z0-9_ ]", "");

      return identifier;

    }


    // Method to convert kebab-case to camelCase
    private static String kebabToCamelCase(String input) {
    String[] parts = input.split("-");
    // solution with Stringbuilder for more efficiency
    StringBuilder camelCaseString = new StringBuilder(parts[0]);
    for (int i = 1; i < parts.length; i++) {
      camelCaseString.append(parts[i].substring(0,1).toUpperCase());
      camelCaseString.append(parts[i].substring(1).toLowerCase());
    }
    return camelCaseString.toString();

    // previous solution with concatenation
    // String result = parts[0];
    // for (int i = 1; i < parts.length; i++) {
    //   result += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
    // }
    // return result;
    }

    
    // Method to check for leetspeak
    private static boolean containsLeetspeak(String input) {
      return input.contains("4") || input.contains("3") || input.contains("0") || input.contains("1") || input.contains("7");
    }

    // Method to convert leetspeak to normal text
    private static String leetspeakToText(String input) {
      return input.replace("4", "a")
                  .replace("3", "e")
                  .replace("0", "o")
                  .replace("1", "l")
                  .replace("7", "t");

    }
  }
