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

  public boolean isVulnerable() {
    return false;
  }

  int getDamagePoints (Fighter fighter) {
    return fighter.isVulnerable()? 10 : 6;
  }


}


class Wizard extends Fighter {

 @Override
 public String toString() {
  return "Fighter is a Wizard";
  }

}
