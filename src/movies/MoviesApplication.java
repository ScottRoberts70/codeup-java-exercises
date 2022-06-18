package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean decision = true;
        while (decision) {
            System.out.println("What would you like to do?\n\n 0 - Exit\n 1 - view all movies\n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 6 - add a movie\n");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Movie movie : findAll()) {
                    System.out.println(movie);
                }
            }
            if (choice == 2) {
                for (Movie movie : findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("animated"))
                        System.out.println(movie);
                }
            }
            if (choice == 3) {
                for (Movie movie : findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("drama"))
                        System.out.println(movie);
                }
            }
            if (choice == 4) {
                for (Movie movie : findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("horror"))
                        System.out.println(movie);
                }
            }
            if (choice == 5) {
                for (Movie movie : findAll()) {
                    if (movie.getCategory().equalsIgnoreCase("scifi"))
                        System.out.println(movie);
                }
            }

            if (choice == 0) {
                decision = false;
            }
        }
    }
}
