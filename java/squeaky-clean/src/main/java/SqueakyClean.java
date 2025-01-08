class SqueakyClean {
  // creating a static method so that it can be called without having to create an object instance of the class
    static String clean(String identifier) {
      if (identifier == null || identifier.isEmpty()) {
        return identifier; // Handle null or empty input
      }
      // Step 1: Replace spaces with underscores
      identifier = identifier.replace(" ","_");

      // Step 2: Convert kebab-case to camelCase
      if (identifier.contains("-")) {
        identifier = kebabToCamelCase(identifier);
      }


      return identifier;

    }


    // method to convert kebab-case to camelCase
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
  }
