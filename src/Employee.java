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

    public void empAge(final int empage) {
        age = empage;
    }

    public void empDesignation(final String empdesig) {
        designation = empdesig;
    }

    public void empSalary(final Double empsalary) {
        salary = empsalary;
    }

    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public double getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }

    public String setTitiel(){
        return "shoe";
    }

    public String getDesignation(){
        return this.designation;
    }

    public void printEmployee() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Designation" + designation);
        System.out.println("Salary" + salary);
        System.out.println("gender" + gender);
    }
}














