/*
Create a class Cinema with the below attributes:

movieId - int
director - String
rating - int
budget - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

findAvgBudgetByDirector method:
----------------------------------
This method will take two input parameters - array of Movie objects and string parameter director.
The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter.
If no movie with the given director is present in the array of movie objects, then the method should return 0.

getMovieByRatingBudget method:
----------------------------------
This method will take two int parameters rating and budget, along with the array of movie objects.
The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget
attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder).
If any of the conditions are not met, then the method should return null.

Note : No two movie object would have the same value for rating and budget attributes.
All the searches should be case insensitive.
The budget mentioned are in crores and in INR.

These above mentioned static methods should be called from the main method.

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is
greater than 0, or it should print "Sorry - The given director has not yet directed any movie".

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned
value is null then it should print "Sorry - No movie is available with the specified rating and budget requirement".

Before calling these static methods in main, use Scanner object to read the values of four Movie objects referring attributes
in the above mentioned attribute sequence. Next, read the value for director, rating and budget.

Input
----------
1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300

Output
----------
200
1401
 */
import java.util.*;

class Cinema{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Cinema(int movieId, String director, int rating, int budget){
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;

    }

    public String getDirector() {
        return director;
    }

    public int getBudget() {
        return budget;
    }
    public int getRating() {
        return rating;
    }
    public int getMovieId() {
        return movieId;
    }

}

public class Problem98_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Movies");
        Cinema[] cinemas = new Cinema[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < cinemas.length; i++) {
            System.out.println("Enter the movie ID");
            int movieId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the director");
            String director = sc.nextLine();
            System.out.println("Enter the rating");
            int rating = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the budget");
            int budget = sc.nextInt();
            sc.nextLine();
            cinemas[i] = new Cinema(movieId, director, rating, budget);
        }
        System.out.println("Enter director parameter: ");
        String directorParameter = sc.nextLine();

        System.out.println("Enter rating parameter: ");
        int ratingParameter = sc.nextInt();
        System.out.println("Enter budget parameter: ");
        int budgetParameter = sc.nextInt();
        sc.nextLine();

        int avgBudget = findAvgBudgetByDirector(cinemas , directorParameter);
        System.out.println(avgBudget > 0 ? avgBudget : "Sorry - The given director has not yet directed any movie");

        Cinema cinema = getMovieByRatingBudget(cinemas, ratingParameter, budgetParameter);
        System.out.println(cinema != null ? cinema.getMovieId() : "Sorry - No movie is available with the specified rating and budget requirement");



    }
    public static int findAvgBudgetByDirector(Cinema[] cinemas, String directorParameter){
        int budget = 0;
        int noOfCinemasByDirector = 0;
        for(Cinema cinema : cinemas){
            if(cinema.getDirector().equalsIgnoreCase(directorParameter)){
                noOfCinemasByDirector++;
                budget += cinema.getBudget();
            }
        }
        return budget / noOfCinemasByDirector;
    }
    public static Cinema getMovieByRatingBudget(Cinema[] cinemas, int ratingParameter, int budgetParameter) {
        for (Cinema cinema : cinemas) {
            if (cinema.getBudget() == budgetParameter && cinema.getRating() == ratingParameter && budgetParameter % ratingParameter == 0) {
                return cinema;
            }
        }
        return null;
    }
}
