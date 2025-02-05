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
    this.strength = ability(rollDice());
    this.dexterity = ability(rollDice());
    this.constitution = ability(rollDice());
    this.intelligence = ability(rollDice());
    this.wisdom = ability(rollDice());
    this.charisma = ability(rollDice());
    this.hp = 10 + modifier(getConstitution());
  }


    protected int ability(List<Integer> scores) {
      scores.sort(Integer::compareTo);
      int sum = scores.get(1) + scores.get(2) + scores.get(3);
      // System.out.println("You rolled " + scores.get(0) + ", " + scores.get(1) + ", " + scores.get(2) + ", " + scores.get(3) + ". Your " + abilityName + " is " + sum + " (" + scores.get(1) + "+" + scores.get(2) + "+" + scores.get(3) + ").");
      return sum;
    }

    protected List<Integer> rollDice() {
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
