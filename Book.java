
public class Book {
    private static String genre="Fiction";
    private static int numberOfBooks=0;
    
    private String title;
    private String Author;
    private int year;

  public Book(String title,String Author,int year)
  {
      this.title=title;
      this.Author=Author;
      this.year=year;
      numberOfBooks++;
  }
        
    
    void display()
    {
        System.out.println("Title is:"+title);
        System.out.println("Author name is:"+Author);
        System.out.println("Year of Publication is:"+year);
        System.out.println("Genre is:"+genre);
        System.out.println(" ");
    }
  
    
    public static void getBooks()
    {
        System.out.println("Number of Books are:"+numberOfBooks);
    }
  
    public static void main(String[] args) {
        
       Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
       Book book2 = new Book("1984", "George Orwell", 1949);
       Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
   
       book1.display();
       book2.display();
       book3.display();
       getBooks();
       
    }
    
}
