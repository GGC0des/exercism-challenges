class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter {

  @Override
  public String toString() {
    return "Fighter is a Warrior";
  }

  @Override
  public boolean isVulnerable() {
    return false;
  }

  @Override
  int getDamagePoints (Fighter fighter) {
    return fighter.isVulnerable()? 10 : 6;
  }


}


class Wizard extends Fighter {
  private boolean spellPrepared = false;

  void prepareSpell() {
    spellPrepared = true;
  }

 @Override
 public String toString() {
  return "Fighter is a Wizard";
  }

  @Override
  boolean isVulnerable() {
    return !spellPrepared;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    return spellPrepared ? 12 : 3;
  }

}
