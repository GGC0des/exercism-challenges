import java.util.List;
import java.util.Random;

class DnDCharacter {
  private final DiceRoller diceroller = new DiceRoller();

    int ability(List<Integer> scores) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    List<Integer> rollDice() {
      return diceroller.roll4D6();
    }

    int modifier(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getStrength() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getDexterity() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getConstitution() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getIntelligence() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getWisdom() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getCharisma() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}

public class DiceRoller {
  private final Random random;

  public DiceRoller() {
    this.random = new Random();
  }

  public List<Integer> roll4D6() {
    List<Integer> diceValues = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      diceValues.add(random.nextInt(6) + 1);
    }
    return diceValues;
  }
}
