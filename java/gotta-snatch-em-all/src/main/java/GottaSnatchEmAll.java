import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards) ; // Set<String> collectionSet = new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return !collection.contains(card) ? collection.add(card) && true : false;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.canTrade() method");
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.commonCards() method");
    }

    static Set<String> allCards(List<Set<String>> collections) {
        throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.allCards() method");
    }
}
