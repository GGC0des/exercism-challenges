public enum TravelMethod {
    WALKING("You're traveling to your destination by walking."),
    HORSEBACK("You're traveling to your destination on horseback.");

    private String description;

    TravelMethod(String description) {
      this.description = description;
    }

    public String getDescription() {
      return this.description;
    }
}
