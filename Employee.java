package PracticaOpp2;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private Employee employee;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       if (firstName.equals("")){throw new IllegalArgumentException();}
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.equals("")){throw  new IllegalArgumentException();}
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    if(age<16&&age>70){throw  new IllegalArgumentException();}
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "}" ;
    }
}
