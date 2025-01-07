import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;
    // each BirdWatcher instance signifies a week of bird watching of the last week

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // constructor will take argument of lastWeek[]
    // public BirdWatcher(int[] lastWeek) {
    //  this.birdsPerDay = lastWeek.clone();
    //}


    public int[] getLastWeek() {
      // accessor method for birdsPerDay which according to exerc. == lastWeek[]

      // Conditional to enure array has exactly 7 elements
      if (birdsPerDay == null || birdsPerDay.length != 7) {
        throw new IllegalArgumentException("The array must have exactly 7 elements.");
      }

      // Iteration to ensure all indices contain a valid value
      for (int count : birdsPerDay) {
        if (count <= 0) {
            throw new IllegalArgumentException("Array contains invalid values.");
        }
      }

      return birdsPerDay;
    }

    public int getToday() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
