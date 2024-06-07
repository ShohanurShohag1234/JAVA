import java.util.Scanner;
public class rectangle {
  
   static void area(double l,double w)
    {
        double Area=l*w;
        System.out.println("Area is="+Area);
    }

   static void perimeter(double l, double w)
   {
       double Perimeter=2*(l+w);
       System.out.println("Perimeter="+Perimeter);
   }
   
   
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     double length,width;
        System.out.println("Ener the length=");
        length=input.nextDouble();
      System.out.println("Ener the Width=");
        width=input.nextDouble();
        area(length,width);
        perimeter(length,width);
        
        
        
        
    }
    
}
