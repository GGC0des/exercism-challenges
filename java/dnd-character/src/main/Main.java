public class Main {
  public static void main(String[] args) {
      // Create two DnDCharacter instances
      DnDCharacter character1 = new DnDCharacter();
      DnDCharacter character2 = new DnDCharacter();

      // Display attributes for Character 1
      System.out.println("Character 1:");
      displayCharacterStats(character1);

      System.out.println("\nCharacter 2:");
      // Display attributes for Character 2
      displayCharacterStats(character2);

      // Compare Constitution Modifiers
      System.out.println("\nComparing Constitution Modifiers:");
      System.out.println("Character 1 Modifier: " + character1.modifier(character1.getConstitution()));
      System.out.println("Character 2 Modifier: " + character2.modifier(character2.getConstitution()));
  }

  private static void displayCharacterStats(DnDCharacter character) {
      System.out.println("Strength: " + character.getStrength());
      System.out.println("Dexterity: " + character.getDexterity());
      System.out.println("Constitution: " + character.getConstitution());
      System.out.println("Intelligence: " + character.getIntelligence());
      System.out.println("Wisdom: " + character.getWisdom());
      System.out.println("Charisma: " + character.getCharisma());
      System.out.println("Hit Points: " + character.getHitpoints());
  }
}
