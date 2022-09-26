import java.util.Scanner;

// 1. Ask the user for input (name)
//  1.1 Get the input from user
// 2. List all the genres, ask the user for input (genre)
//  2.1 Get the input fom user
// 3. Ask the user for input (age)
//  3.1 Get the input from user
// 4. See if age is <= 15
//  4.1 If so, go through switch for <= 15, look for the genre in the switch
//  4.2 If > 15, go through switch for > 15, look for the genre in the switch
// 5. Print the genre
// 6. Ask the user for input (Y/N), to see if they want to try again
//  6.1 If the input is y/Y, go to #1
//  6.2 If the input is anything else but y/Y, terminate the program

public class P5_2 {
    static Scanner sc = new Scanner(System.in); // importing the scanner

    // Start of creating methods

    public static void println(String str) {
        System.out.println(str);
    } // println

    public static String getUserString() {
        return sc.nextLine();
    } // getUserString

    public static int getUserInt() {
        return sc.nextInt();
    } // getUserInt

    public static void ageless(String genre) {
        switch (genre) {
            case "HORROR" -> println("I wouldn't recommend you watching any horrors until 16.");
            case "FANTASY" -> println("Charlie and the Chocolate Factory is a cool fantasy movie!");
            case "SCI-FI" -> println("Buzz Lightyear is a cool sci-fi movie to watch!");
            case "THRILLER" -> println("Nightmare before Christmas is a cool thriller movie to watch!");
            case "COMEDY" -> println("Bad Guys is a cool comedy movie to watch!");
            default -> println("");
        }
    } // ageless

    public static void agemore(String genre) {
        switch (genre) {
            case "HORROR" -> println("Time is a cool horror movie to watch!");
            case "FANTASY" -> println("Doctor Strange is a cool fantasy movie!");
            case "SCI-FI" -> println("Samaritan is a cool sci-fi movie to watch!");
            case "THRILLER" -> println("Deep Waters is a cool thriller movie to watch!");
            case "COMEDY" -> println("Man from Toronto is a cool comedy movie to watch!");
            default -> println("");
        }
    } //agemore

    public static void agecheck(String genre, int userage) {
        if (userage <= 15) {
            ageless(genre);
        } else {
            agemore(genre);
        }
    } // agecheck

    public static void mainloop(boolean go, String newline) {
        while (go) {
            println("Hello, User, what's your name?");
            String username = getUserString();
            println("Nice to meet you, " + username + ". What's your favorite movie genre?");
            println("Here are some of the most popular genres: " + newline + "Horror" + newline + "Fantasy" + newline + "Sci-Fi" + newline + "Thriller" + newline + "Comedy");
            String genre = getUserString();
            genre = genre.toUpperCase();
            println("And one more question: how old are you?");
            int userage = getUserInt();
            agecheck(genre, userage);
            getUserString();
            println("Would you like to try again? (Y/N)");
            String answer5 = getUserString();
            if (answer5.equalsIgnoreCase("Y")) {
                println("Sure thing!");
            } else {
                println("Oh, alright! Sad to see you leave!");
                go = false;
            }
        }
    } // mainloop

// End of creating methods

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newline = System.lineSeparator();
        boolean go = true;
        mainloop(go, newline);
    } // Main
} // Class
