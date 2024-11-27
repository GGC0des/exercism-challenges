class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
      //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
      // canFastAttack returns true if knight is asleep !awake
      return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
      // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
      // canSpy returns true if at least one of them is awake
      return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
      // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
      // return true if !archerisAwake (asleep) && prisonerIsAwake
      return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
      // failed two tests with logic from instructions, used tests to reverse logic
      // true if dog is there and everyone is asleep
      // true if knightIsAwake cos dog handles knight but only if !archerIsAwake (asleep)
      // true as long as prisioner is not the only !awake
      if (petDogIsPresent) {
        return !archerIsAwake;
      }
      // true if prisioner is awake, others needs to sleep without dog there
      return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }
}
