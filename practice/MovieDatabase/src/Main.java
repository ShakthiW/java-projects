import java.util.*;

public class Main {
    static ArrayList<Movies> movies = new ArrayList<>();

    public static void addMovie(String title, String director, String genre, double rating){
        Movies movie = new Movies(title, director, genre, rating);
        movies.add(movie);
    }

    public static void removeMovie(String title){
        movies.remove(title);
    }

    public static void searchMovies(String keyWord){
        ArrayList<Movies> results = new ArrayList<>();

        for (Movies movie : movies) {
            if (movie.getTitle().contains(keyWord) || movie.getDirector().contains(keyWord)) {
                results.add(movie);
            }
        }

        System.out.println(results);
    }

    public static void topRatedMovies(int n){
        movies.sort((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));

        List<Movies> topMovies = movies.subList(0, Math.min(n, movies.size()));

        for (Movies movie : topMovies) {
            System.out.println(movie.getTitle() + " (" + movie.getRating() + ")");
        }
    }

    public static void menu() {
        System.out.println("*********************************************");
        System.out.println("*      Welcome to My Movie Database!        *");
        System.out.println("*                                           *");
        System.out.println("*    This program allows you to manage      *");
        System.out.println("*    your movies.                           *");
        System.out.println("*                                           *");
        System.out.println("*    To get started, choose an option       *");
        System.out.println("*    from the menu below:                   *");
        System.out.println("*                                           *");
        System.out.println("*    1. Add a movie                         *");
        System.out.println("*    2. Delete a movie                      *");
        System.out.println("*    3. Search for a movie                  *");
        System.out.println("*    4. Display all movies                  *");
        System.out.println("*    5. View the top 10 movies              *");
        System.out.println("*       0. Exit                             *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        while (!exit){
            menu();
            System.out.print("\nPlease enter your choice here : ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Please enter the name of the movie: ");
                    String title = input.next();
                    System.out.print("Name of the director : ");
                    String director = input.next();
                    System.out.print("Genre : ");
                    String genre = input.next();
                    System.out.print("Rating : ");
                    double rating = input.nextDouble();
                    addMovie(title, director, genre, rating);
                    System.out.println("Movie Successfully added");
                }
                case 2 -> {
                    System.out.print("Please enter the name of the movie: ");
                    removeMovie(input.next());
                }
                case 3 -> {
                    System.out.print("Please Search here: ");
                    searchMovies(input.next());
                }
                case 4 -> {
                    for (Movies movie : movies) {
                        System.out.println(movie.toString());
                    }
                }
                case 5 -> topRatedMovies(10);
                case 0 -> exit = true;
                default -> System.out.println("Not a valid response");
            }
        }
    }
}