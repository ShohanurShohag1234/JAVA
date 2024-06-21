
public class Student {
   private static String University="ULAB";
    private static int numberOfStudents=0;
    private int id;
    private String name;
    private String department;
    private double cgpa;
   

    public Student(int id,String name,String department,double cgpa)
  {
      this.id=id;
      this.name=name;
      this.department=department;
      this.cgpa=cgpa;
        numberOfStudents++;
  }
        
    
    void display()
    {
        System.out.println("Id is:"+id);
        System.out.println("Student name is:"+name);
        System.out.println("Department is:"+department);
        System.out.println("Cgpa is:"+cgpa);
        System.out.println(" ");
    }
  
    
    public static void getStudents()
    {
        System.out.println("Number of students are:"+numberOfStudents);
    }
  
    public static void main(String[] args) {
        
       Student student1 = new Student(101,"Shohag","CSE",3.80);
       Student student2 = new Student(102,"Rai","MSE",3.50);
       Student student3 = new Student(105,"Kalam","EEE",3.85);
       Student student4 = new Student(109,"Rafiq","Civil",3.70);
       
       student1.display();
       student2.display();
       student3.display();
       student4.display();
       getStudents();
       
    }
    
}
