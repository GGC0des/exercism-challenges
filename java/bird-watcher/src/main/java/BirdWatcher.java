import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;
    // each BirdWatcher instance signifies a week of bird sightings (birdsPerDay)
    // Note: final keyword means reference can never change but the array itsself (cannot reassign reference to different array) but can be populated (modifying its elements).

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        // Note: clone() method is used to create a copy of the input array
        // Note: Arrays in Java are passed by reference, not by value. If the original array (birdsPerDay) were assigned directly, any changes to the original array outside the class would also affect the internal state of the BirdWatcher object. Cloning ensures the class maintains its own independent copy of the array.
        // constructor will take argument of lastWeek[]
        // public BirdWatcher(int[] lastWeek) {
        //  this.birdsPerDay = lastWeek.clone();
        //}
    }



    public int[] getLastWeek() {
      // accessor method for birdsPerDay which according to exerc. == lastWeek[]

      // Conditional to enure array has exactly 7 elements
      if (birdsPerDay == null || birdsPerDay.length != 7) {
        throw new IllegalArgumentException("Array must have exactly 7 elements.");
      }

      // Iteration to ensure all indices contain a valid value
      for (int count : birdsPerDay) {
        if (count < 0) {
            throw new IllegalArgumentException("Array contains invalid values.");
        }
      }

      // Note: did not add additional check for expected array [0, 2, 5, 3, 7, 8, 4] as the Test checks for those
      // However, could be checked here if so wished with for each loop and boolean logic

      // Returing a clone so that the internal array of the BirdWatcher instance cannot be modified externally, eg.: int[] lastWeekClone = birdWatcher.getLastWeek(); lastWeekClone[0] = 100; which would modify the interal state of the current instance (birdsPerDay) !
      return birdsPerDay.clone();
    }


    public int getToday() {
      return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
      // Note: does not need to clone the value since int are primitives and immutable (original value remains in the same memory and instead reassigns the variable to hold a new value)
    }

    public void incrementTodaysCount() {
      // method to increment by 1
      if (birdsPerDay.length > 0) {
        birdsPerDay[birdsPerDay.length - 1] += 1;
        // Note: final keyword allows for array to be populated
      } else {
        throw new IllegalStateException("Cannot increment, array is empty.");
      }
    }

    public boolean hasDayWithoutBirds() {
     for (int i : birdsPerDay) {
      if (i == 0) {
        return true;
      }
    }
    return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
      int sumOfFristDays = 0;
      for (int i = 0; i < numberOfDays; i++) {
        sumOfFristDays += birdsPerDay[i];
      }
      return sumOfFristDays;
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
