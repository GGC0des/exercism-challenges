import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceRoller {
  private final Random random = new Random();

  public List<Integer> roll4D6() {
    List<Integer> diceValues = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      diceValues.add(random.nextInt(6) + 1);
    }
    return diceValues;
  }
}
