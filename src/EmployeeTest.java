import java.util.ArrayList;
import java.util.List;


public class EmployeeTest {

    public static void main(String[] Args) {

        Employee empOne = new Employee("-Tom", 23, "-manager", 1000d, "male");
        empOne.printEmployee();
        Employee empTwo = new Employee("-Mary", 30, "-Worker", 500d, "female");
        empTwo.printEmployee();
        Employee empThree = new Employee("-John", 35, "-Worker", 580d, "male");
        empTwo.printEmployee();


        // Convert this to a loop


        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(empOne);
        employeelist.add(empTwo);
        employeelist.add(empThree);

        for (Employee e : employeelist) {
            System.out.println("Employee Name is :" + e.getName());


        }


        System.out.println("Employees :");
        System.out.println(employeelist);

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
            if (e.getDesignation().equals("-manager")) {
                totalUnderman += e.getSalary();

            }
        }
        // calculate emps that start with T
        for (Employee e : employeelist) {
            if (e.getName().startsWith("-T")) {
                totalUnderT += e.getSalary();
            }

        }
        for (Employee e : employeelist) {
            if (e.getGender().equals("female")) {
                totalUndergen += e.getSalary();
            }
        }


        //
        System.out.println(empOne.toString());
        System.out.println("Total Salary: " + total);
        System.out.println("Total Salary under 30: " + totalUnder30);
        System.out.println("Total Salary under First letter T:" + totalUnderT);
        System.out.println("Total Salary under Manager:" + totalUnderman);
        System.out.println("Total Salary under Female:" + totalUndergen);
        System.out.println("Total Annual Salary:"+ total*12);


    }
}






