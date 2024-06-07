
public class movie {

  String title;
    int genre;
    String leadactor;
    String director;
    int releaseYear;
    int rating;
    

    void display() {
        System.out.println("Title is=" + title);
        System.out.println("Genre is=" + genre);
        System.out.println("Leadactor is=" + leadactor);
        System.out.println("Director is=" + director);
        System.out.println("Release Year is=" + releaseYear);
        System.out.println("Rating is=" + rating);
        
    }

    void Rating(int r) {
        if (r < 5) {
            System.out.println("Review is not good");
        } else {
            System.out.println("Review is Good");
        }
    }

  
    public static void main(String[] args) {

        movie Dhoom = new movie();
        Dhoom.title = "Racing Car";
        Dhoom.genre = 2;
        Dhoom.director = "Suresh";
        Dhoom.leadactor = "pamkesh";
        Dhoom.releaseYear = 2005;
        Dhoom.rating = 4;
        Dhoom.display();
       Dhoom.Rating(Dhoom.rating);

        System.out.println("");
        movie krish = new movie();
        krish.title = "Flying Human";
        krish.genre = 3;
        krish.director = "Vungkesh";
        krish.leadactor = "hrittik";
        krish.releaseYear = 2017;
        krish.rating = 5;
        krish.display();

    
        krish.Rating(krish.rating);
}
}