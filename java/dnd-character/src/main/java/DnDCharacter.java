import java.util.List;


class DnDCharacter {
  private final DiceRoller diceroller = new DiceRoller();
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;
  private int hp;

  public DnDCharacter() {
    initializeAbility();
  }

  private void initializeAbility() {
    this.strength = ability("Strength", rollDice());
    this.dexterity = ability("Dexterity", rollDice());
    this.constitution = ability("Constitution", rollDice());
    this.intelligence = ability("Intelligence", rollDice());
    this.wisdom = ability("Wisdom", rollDice());
    this.charisma = ability("Charisma", rollDice());
    this.hp = 10 + modifier(getConstitution());
  }


    private int ability(String abilityName, List<Integer> scores) {
      scores.sort(Integer::compareTo);
      int sum = scores.get(1) + scores.get(2) + scores.get(3);
      System.out.println("You rolled " + scores.get(0) + ", " + scores.get(1) + ", " + scores.get(2) + ", " + scores.get(3) + ". Your " + abilityName + " is " + sum + " (" + scores.get(1) + "+" + scores.get(2) + "+" + scores.get(3) + ").");
      return sum;
    }

    private List<Integer> rollDice() {
      return diceroller.roll4D6();
    }

    int modifier(int input) {
      return (input -10) / 2;
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
      return hp;
    }
}

// public class DiceRoller {
//   private final Random random;

//   public DiceRoller() {
//     this.random = new Random();
//   }

//   public List<Integer> roll4D6() {
//     List<Integer> diceValues = new ArrayList<>();
//     for (int i = 0; i < 4; i++) {
//       diceValues.add(random.nextInt(6) + 1);
//     }
//     return diceValues;
//   }
// }
