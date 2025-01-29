public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
      // boolean expr = daysSkipped < 5;
      // double multiplier = expr ? 1.0 : 0.85;
      // return multiplier;
      double value = daysSkipped < 5 ? 1.0 : 0.85;
      return value;
    }

    public int bonusMultiplier(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
    }

    public double bonusForProductsSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    }
}
