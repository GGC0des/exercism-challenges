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
        throw new UnsupportedOperationException(
                "Delete this statement and write your own implementation.");
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
