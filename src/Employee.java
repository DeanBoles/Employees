public class Employee {

    private String name;
    private int age;
    private String designation;
    private Double salary;
    private String gender;

    public Employee(final String name, final int age, final String designation, final Double salary, final String gender) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Name:[%s]. Age:[%s], Designation[%s], Salary[%s], Gender[%s]", name, age, designation, salary, gender);
    }
}














