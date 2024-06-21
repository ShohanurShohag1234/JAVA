public class Employee {
 
    private static String company_name = "My Homeland";
    private static String company_address = "45/2,Mirpur";
    private static int totalEmployees = 0;

    
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Parameterized constructor
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++;
    }

   
    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary:" + salary);
        System.out.println("Company:" + company_name);
        System.out.println("Address:" + company_address);
        System.out.println();
    }

  
    public static void displayTotalEmployees() {
        System.out.println("Total employees are:"+totalEmployees);
    }

    public static void main(String[] args) {
     
        Employee emp1 = new Employee("Abir", 30, "Software Engineer", 75000);
        Employee emp2 = new Employee("Rashid", 28, "Product Manager", 95000);
        Employee emp3 = new Employee("Polash", 35, "Data Analyst", 65000);

     
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

      
        displayTotalEmployees();
    }
}
