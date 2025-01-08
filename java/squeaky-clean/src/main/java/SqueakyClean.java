class SqueakyClean {
  // creating a static method so that it can be called without having to create an object instance of the class
    static String clean(String identifier) {
      if (identifier == null || identifier.isEmpty()) {
        return identifier;
      }
      // replace space with underscore
      return identifier.replace(" ","_");

      // turn kebab-case to camelCase
      String[] parts = identifier.split("-");
      // solution with concatenation
      String result = parts[0];
      for (int i = 1; i < parts.length; i++) {
        result += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
      }
      return result;


    }
}
