import java.util.Scanner;

public class P5 {
    static Scanner sc = new Scanner(System.in);

    // Part 1

    // Creating methods

    public static void println(String str) {
        System.out.println(str);
    }

    static int count(int x, int y) {
        System.out.println("Give me an x:");
        x = sc.nextInt();
        System.out.println("Give me an y:");
        y = sc.nextInt();
        sc.nextLine();
        return x + y;
    }

    static void nameage(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    static int getage(int userage){
        System.out.println("How old are you?");
        userage = sc.nextInt();
        return userage;
    }
    static String namelastname() {
        String[] namelastname = new String[3];
        System.out.println("What is your name?");
        namelastname[0] = "";
        namelastname[1] = sc.nextLine();
        System.out.println("What is your lastname?");
        namelastname[2] = sc.nextLine();
        return namelastname[1] + " " + namelastname[2] + ".";
    }

    static void printnamelastname() {
        System.out.println("You are " + namelastname()); // 2 arguments, returns string
    }

    static void loop(){
        boolean go = true;
        while (go) {
            printnamelastname();
            println("Is that right? (Y/N)");
            String answer = getUserString();
            if (answer.equalsIgnoreCase("Y")) {
                println("You are " + getage(0) + " years old.");
                println("Thanks for using my program!");
                go = false;
            }
            else{
                println("Let's try this again then!");
                // Goes to the beginning of while loop
            }
        }
    }

    public static String getUserString() {
        String input = sc.nextLine();
        return input;
    }

    public static void calleverything(){
        println("Names are:"); // 1 argument, no return value
        nameage("Danylo", 18); // 2 arguments, no return value
        nameage("Roman", 9); // 2 arguments, no return value
        nameage("Rysia", 21); // 2 arguments, no return value
        println("The sum is " + count(0, 0) + "."); // 2 arguments, returns int
        println("You are " + namelastname()); // 2 arguments, returns string
        loop(); // Y/N loop
    }

// Main method

    public static void main(String[] args) {
        // Using methods
        calleverything(); // Calls the method with every other method in it, demonstrates everything
    } // Main
} // Class
