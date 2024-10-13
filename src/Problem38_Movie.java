/*
Create class Movie with below attributes:

movieName - String
company - String
genre - String
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie
objects where the searchGenre String matches with the original array of Movie object's genre attribute
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
 */

import java.util.*;

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getGenre(){
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}

public class Problem38_Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie details: \n");
        Movie[] movies = new Movie[4];
        for(int i = 0; i < movies.length; i++){
            System.out.print("Enter the movie name: ");
            String movieName = sc.nextLine();
            System.out.print("Enter the movie company: ");
            String company = sc.nextLine();
            System.out.print("Enter the movie genre: ");
            String genre = sc.nextLine();
            System.out.print("Enter the movie budget: ");
            int budget = sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(movieName, company, genre, budget);
        }
        System.out.println("Enter movie genre Parameter: ");
        String genreParameter = sc.nextLine();

        System.out.println("Output: ");
        List<Movie> moviesByGenre = getMovieByGenre(movies , genreParameter);
        for(Movie movie : moviesByGenre){
            System.out.println(movie.getBudget() > 80000000 ? "High Budget Movie" : "Low Budget Movie");
        }

    }
    public static List<Movie> getMovieByGenre(Movie[] movies, String genreParameter){
        List<Movie> moviesByGenre = new ArrayList<>();
        for(Movie movie : movies){
            if(movie.getGenre().equalsIgnoreCase(genreParameter)){
                moviesByGenre.add(movie);
            }
        }
        return moviesByGenre == null? null : moviesByGenre;
    }
}
