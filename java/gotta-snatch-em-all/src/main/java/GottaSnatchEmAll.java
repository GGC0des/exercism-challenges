import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myUniqueCards = new HashSet<>(myCollection);
        myUniqueCards.removeAll(theirCollection);
        Set<String> theirUniqueCards = new HashSet<>(theirCollection);
        theirUniqueCards.removeAll(myCollection);
        return !myUniqueCards.isEmpty() && !theirUniqueCards.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCardsSet = new HashSet<>();
        if (!collections.isEmpty()) {
          commonCardsSet.addAll(collections.get(0));
          for (Set<String> collection : collections) {
            commonCardsSet.retainAll(collection); // value is the intersection of the sets
          }
        }
        return commonCardsSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        
    }
}
