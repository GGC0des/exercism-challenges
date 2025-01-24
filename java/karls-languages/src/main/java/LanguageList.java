import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
      return languages.isEmpty();
    }

    public void addLanguage(String language) {
      languages.add(language);
      System.out.println(languages);
    }

    public void removeLanguage(String language) {
      languages.remove(language);
      System.out.println(language + " has been removed from your List.");
    }

    public String firstLanguage() {
      if (languages.isEmpty()) {
        throw new IllegalStateException("The list of languages is empty!");
      }
      return languages.get(0);
    }

    public int count() {
        throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        throw new UnsupportedOperationException("Please implement the isExciting() method");
    }
}
