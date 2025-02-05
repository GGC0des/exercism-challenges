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
    initializeAbility();
  }

  private void initializeAbility() {
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

    int modifier(int score) {
      return (score -10) / 2;
    }

    int getStrength() {
      return strength;
    }

    int getDexterity() {
      return dexterity;
    }

    int getConstitution() {
      return constitution;
    }

    int getIntelligence() {
      return intelligence;
    }


    int getWisdom() {
      return wisdom;
    }

    int getCharisma() {
      return charisma;
    }

    int getHitpoints() {
      return constitution * 2;
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
