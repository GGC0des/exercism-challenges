public class GameMaster {

    public String describe (Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
        " with " + character.getHitPoints() + " hit points.";
    }

    public String describe (Destination destination) {
      return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants()
      + " inhabitants.";
    }

    public String describe(TravelMethod method) {
      switch (method) {
        case WALKING: return "You're walking.";
        case HORSEBACK: return "You're on horseback.";
        // default: throw new IllegalArgumentException("Unknown travel method");
    }

    public String describe(Character character, Destination destination, TravelMethod method) {
      return describe(character) + " " + describe(method) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
      return describe(character, destination, TravelMethod.WALKING);
    }
}
