public class GameMaster {

    public String describe (Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
        " with " + character.getHitPoints() + " hit points.";
    }

    public String describe (Destination destination) {
      return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants()
      + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character and Destination
}
