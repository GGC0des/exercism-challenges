import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DnDCharacter {
  private final DiceRoller diceroller = new DiceRoller();
  private final Map<String, Integer> abilities = new HashMap<>();
  private final Map<String, List<Integer>> diceRolls = new HashMap<>();
  private final List<String> abilityNames = List.of("Strength", "Dexterity", "Constitution",
        "Intelligence", "Wisdom", "Charisma");
  private final int hp;

  public DnDCharacter() {
    initializeAbilities();
    this.hp = 10 + modifier(getAbilities().get("Constitution"));
  }

  private void initializeAbilities() {
    for (String abilityName : abilityNames) {
      List<Integer> rolls = rollDice();
      diceRolls.put(abilityName, rolls);
      int abilityScore = ability(rolls);
      abilities.put(abilityName, abilityScore);
    }
  }


    protected int ability(List<Integer> scores) {
      return scores.stream()                      // Convert immutable list into stream (or alternatively store in mutable new ArrayList)
                   .sorted((a,b) -> b - a)        // Sort in descending order
                   .limit(3)              // Use first 3 largest elements
                   .mapToInt(Integer::intValue)   // Convert Integer objects to int primitives
                   .sum();                        // Sum the values
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
      return hp;
    }

    public Map<String, Integer> getAbilities() {
      return abilities;
    }

    public Map<String, List<Integer>> getDiceRolls() {
      return diceRolls;
    }

    public List<String> getAbilityNames() {
      return abilityNames;
    }
}
