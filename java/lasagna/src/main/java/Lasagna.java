public class Lasagna {
    // declare instance fields
    public Lasagna(){
      // no parameters given for constructor method
    }
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
      int minutes = 40;
      return minutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven) {
      int remainingTime = 40 - timeInOven;
      return remainingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int lasagnaLayers) {
      int preparationTime = lasagnaLayers * 2;
      return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int bakingTime) {
      Lasagna myLasagna = new Lasagna();
      int cookingTimeInTotal = myLasagna.preparationTimeInMinutes(numOfLayers) + bakingTime;
      // simpler solution:
      // int cookingTimeInTotal = numOfLayers*2 + bakingTime;
      return cookingTimeInTotal;
    }
}
