
public class Main {
  public static void main(String[] args) {
    DnDCharacter character = new DnDCharacter();

    System.out.println("Strength: " + character.getStrength());
    System.out.println("Dexterity: " + character.getDexterity());
        System.out.println("Constitution: " + character.getConstitution());
        System.out.println("Intelligence: " + character.getIntelligence());
        System.out.println("Wisdom: " + character.getWisdom());
        System.out.println("Charisma: " + character.getCharisma());
        System.out.println("Hitpoints: " + character.getHitpoints());
        System.out.println("Charisma Modifier:" + character.modifier(character.getCharisma()));
  }
}
