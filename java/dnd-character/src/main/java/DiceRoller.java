import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {
  private final DiceRoller diceroller = new DiceRoller();
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;

  public DnDCharacter() {
    this.strength = ability(rollDice());
    this.dexterity = ability(rollDice());
    this.constitution = ability(rollDice());
    this.intelligence = ability(rollDice());
    this.wisdom = ability(rollDice());
    this.charisma = ability(rollDice());
  }


    private int ability(List<Integer> scores) {
      scores.sort(Integer::compareTo);
      return scores.get(1) + scores.get(2) + scores.get(3);
    }

    private List<Integer> rollDice() {
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
