import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    private final Map<Integer, String> listOfCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return listOfCodes;
    }

    public void setDialingCode(Integer code, String country) {
        listOfCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return listOfCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!listOfCodes.containsKey(code) && !listOfCodes.containsValue(country)) {
            setDialingCode(code, country);
        // throw new IllegalArgumentException broke Tests, thus commented out
        } // else if (listOfCodes.containsKey(code)) {
        //     throw new IllegalArgumentException("Duplicate code detected! Existing: "
        //     + code + " -> " + getCountry(code) + ". New entry will not be added.");
        // } else if (listOfCodes.containsValue(country)) {
        //     Integer existingCode = listOfCodes.entrySet().stream()
        //         .filter(entry -> entry.getValue().equals(country))
        //         .map(Map.Entry::getKey)
        //         .findFirst()
        //         .orElse(null);
        //     throw new IllegalArgumentException("Duplicate country detected! Existing: "
        //     + existingCode + " -> " + country + ". New entry will not be added.");
        // }
    }

    public Integer findDialingCode(String country) {
        throw new UnsupportedOperationException(
                "Delete this statement and write your own implementation.");
    }

    public void updateCountryDialingCode(Integer code, String country) {
        throw new UnsupportedOperationException(
                "Delete this statement and write your own implementation.");
    }
}
