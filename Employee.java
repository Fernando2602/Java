public class Employee{
  private String firstName, lastName;
  private Date birthDate, hideDate;

  public Employee(String firstName, String lastName, Date birthDate, Date hideDate){
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.hideDate = hideDate;
  }

  public String toString(){
    return String.format("%s, %s Contratado: %s Cumpleaños: %s", lastName, firstName, hideDate, birthDate);
  }
}
