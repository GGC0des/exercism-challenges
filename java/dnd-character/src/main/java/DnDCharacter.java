import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DnDCharacter {
  private final DiceRoller diceroller = new DiceRoller();
  private final Map<String, Integer> abilities = new HashMap<>();
  private final List<String> abilityNames = List.of("Strength", "Dexterity", "Constitution",
        "Intelligence", "Wisdom", "Charisma");
  private int HP;

  public DnDCharacter() {
    initializeAbilities();
    this.HP = 10 + modifier(getConstitution());
  }

  private void initializeAbilities() {
    for (String ability : abilityNames) {
      abilities.put(ability, ability(rollDice()));
    }
  }


    protected int ability(List<Integer> scores) {
      int sum = scores.stream()                      // Convert immutable list into stream (or alternatively store in mutable new ArrayList)
                      .sorted((a,b) -> b - a)        // Sort in descending order
                      .limit(3)              // Use first 3 largest elements
                      .mapToInt(Integer::intValue)   // Convert Integer objects to int primitives
                      .sum();                        // Sum the values
      System.out.println("You rolled " + scores.get(0) + ", " + scores.get(1) + ", " + scores.get(2) + ", " + scores.get(3) + ". Your " + abilityName + " is " + sum + " (" + scores.get(1) + "+" + scores.get(2) + "+" + scores.get(3) + ").");
      return sum;
    }



    protected List<Integer> rollDice() {
      return diceroller.roll4D6();
    }

    int modifier(int input) {
      return Math.floorDiv(input -10, 2);
    }

    int getStrength() {
      return abilities.get("Strength");
    }

    int getDexterity() {
      return abilities.get("Dexterity");
    }

    int getConstitution() {
      return abilities.get("Constitution");
    }

    int getIntelligence() {
      return abilities.get("Intelligence");
    }


    int getWisdom() {
      return abilities.get("Wisdom");
    }

    int getCharisma() {
      return abilities.get("Charisma");
    }

    int getHitpoints() {
      return HP;
    }
}
