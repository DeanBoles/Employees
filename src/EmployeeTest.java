import java.util.ArrayList;
import java.util.List;


public class EmployeeTest {

    public static void main(String[] Args) {

        Employee empOne = new Employee("Tom", 23, "manager", 1000d, "male");
        empOne.toString();
        Employee empTwo = new Employee("Mary", 30, "worker", 500d, "female");
        empTwo.toString();
        Employee empThree = new Employee("John", 35, "worker", 580d, "male");
        empTwo.toString();

        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(empOne);
        employeelist.add(empTwo);
        employeelist.add(empThree);

        for (Employee e : employeelist) {
            System.out.println("Employee Name is :" + e.getName());
        }

        double total = 0;
        double totalUnder30 = 0;
        double totalUnderman = 0;
        double totalUnderT = 0;
        double totalUndergen = 0;

        // add all all emp salaries :)
        for (Employee e : employeelist) {
            total += e.getSalary();
        }

        // add all all emp salaries under age 30:)
        for (Employee e : employeelist) {
            if (e.getAge() >= 30) {
                totalUnder30 += e.getSalary();

            }
        }

        // calculate manager salaries
        for (Employee e : employeelist) {
            if (e.getDesignation().equals("manager")) {
                totalUnderman += e.getSalary();
            }else{
                System.out.println(String.format("Employee [%s] is not a manager but is a [%s]",e.getName(),e.getDesignation()));


            }
        }

        // calculate emps that start with T
        for (Employee e : employeelist) {
            if (e.getName().startsWith("T")) {
                totalUnderT += e.getSalary();
            } else {
                System.out.println(String.format("Employee [%s] does not start with T is starts with [%s]", e.getName(), e.getName().charAt(0)));
            }
        }

        for (Employee e : employeelist) {
            if (e.getGender().equals("female")) {
                totalUndergen += e.getSalary();
            }else{
             System.out.println(String.format("Employee [%s] is not Female",e.getName()));
            }
        }

        System.out.println("Total Salary: " + total);
        System.out.println("Total Salary under 30: " + totalUnder30);
        System.out.println("Total Salary under First letter T:" + totalUnderT);
        System.out.println("Total Salary under Manager:" + totalUnderman);
        System.out.println("Total Salary under Female:" + totalUndergen);
        System.out.println(String.format("Total Annual Salary for [%s] employees: [%s]", employeelist.size(), total*12));
        //present better
        System.out.println("Employee:" + empOne.toString());
        System.out.println("Employee" + empTwo.toString());
        System.out.println("Employee" + empThree.toString());
    }
}






