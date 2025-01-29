public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
      // boolean expr = daysSkipped < 5;
      // double multiplier = expr ? 1.0 : 0.85;
      // return multiplier;
      double value = daysSkipped < 5 ? 1.0 : 0.85;
      return value;
    }

    public int bonusMultiplier(int productsSold) {
      int value = productsSold < 20 ? 10 : 13;
      return value;
    }

    public double bonusForProductsSold(int productsSold) {
      double value = bonusMultiplier(productsSold) * productsSold;
      return value;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    }
}
