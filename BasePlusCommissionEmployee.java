public class BasePlusCommissionEmployee extends CommissionEmployee{
  private double baseSalary;

  public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    if (baseSalary < 0.0)
      throw new IllegalArgumentException("Base salary debe ser >= 0.0");

    this.baseSalary = baseSalary;
  }

  public void setBaseSalary(double baseSalary){
    if (baseSalary < 0.0)
      throw new IllegalArgumentException("Base salary debe ser >= 0.0");
    this.baseSalary = baseSalary;
  }

  public double getBaseSalary(){
    return baseSalary;
  }

  @Override
  public double earnings(){
    return baseSalary + super.earnings();
  }

  @Override
  public String toString(){
    return String.format("%s%n%s%n%s: %.2f", "base-salaried", super.toString(), "base salary", baseSalary);
  }

}
