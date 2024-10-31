package game;

import java.util.*;

public class Main {

    // Function for "clearing" the console

    static void flush() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // General variable setup

        int i;
        int i2;
        int randomColor;
        int attempt = 0;

        final int gameLength = 10;
        final int codeLength = 4;

        String name;
        String gender;
        String character;
        String positionEvaluation = "";
        StringBuilder colorCode = new StringBuilder();
        String playerInput = "";

        boolean firstAttempt = false;
        boolean wrongInput = false;
        boolean correctGuess = false;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // Color list array

        final String[] colorList = new String[] { "R", "G", "B", "Y", "P", "O"};

        // Huge ass text

        final String masterMindText = """
                 ___ ___   ____   _____ ______    ___  ____          ___ ___  ____  ____   ___   \r
                |   |   | /    | / ___/|      |  /  _]|    \\        |   |   ||    ||    \\ |   \\  \r
                | _   _ ||  o  |(   \\_ |      | /  [_ |  D  ) _____ | _   _ | |  | |  _  ||    \\ \r
                |  \\_/  ||     | \\__  ||_|  |_||    _]|    / |     ||  \\_/  | |  | |  |  ||  D  |\r
                |   |   ||  _  | /  \\ |  |  |  |   [_ |    \\ |_____||   |   | |  | |  |  ||     |\r
                |   |   ||  |  | \\    |  |  |  |     ||  .  \\       |   |   | |  | |  |  ||     |\r
                |___|___||__|__|  \\___|  |__|  |_____||__|\\_|       |___|___||____||__|__||_____|\r
                """;

        final String goodJobText = """
                  ____   ___    ___   ___         ____   ___   ____   __ \r
                 /    | /   \\  /   \\ |   \\       |    | /   \\ |    \\ |  |\r
                |   __||     ||     ||    \\      |__  ||     ||  o  )|  |\r
                |  |  ||  O  ||  O  ||  D  |     __|  ||  O  ||     ||__|\r
                |  |_ ||     ||     ||     |    /  |  ||     ||  O  | __ \r
                |     ||     ||     ||     |    \\  `  ||     ||     ||  |\r
                |___,_| \\___/  \\___/ |_____|     \\____j \\___/ |_____||__|\r
                """;

        final String wompWompText = """
                 __          __                               __          __                                     __\r
                 \\ \\        / /                               \\ \\        / /                                _   / /\r
                  \\ \\  /\\  / /    ___    _ __ ___    _ __      \\ \\  /\\  / /    ___    _ __ ___    _ __     (_) | | \r
                   \\ \\/  \\/ /    / _ \\  | '_ ` _ \\  | '_ \\      \\ \\/  \\/ /    / _ \\  | '_ ` _ \\  | '_ \\        | | \r
                    \\  /\\  /    | (_) | | | | | | | | |_) |      \\  /\\  /    | (_) | | | | | | | | |_) |    _  | | \r
                     \\/  \\/      \\___/  |_| |_| |_| | .__/        \\/  \\/      \\___/  |_| |_| |_| | .__/    (_) | | \r
                                                    | |                                          | |            \\_\\\r
                                                    |_|                                          |_|               \r
                """;

        final String tooBadText = """
                  _______                     _                   _   _ \r
                 |__   __|                   | |                 | | | |\r
                    | |      ___     ___     | |__     __ _    __| | | |\r
                    | |     / _ \\   / _ \\    | '_ \\   / _` |  / _` | | |\r
                    | |    | (_) | | (_) |   | |_) | | (_| | | (_| | |_|\r
                    |_|     \\___/   \\___/    |_.__/   \\__,_|  \\__,_| (_)\
                """;

        final String goodBoyText = """
                  ____   ___    ___   ___        ____    ___   __ __  __ \r
                 /    | /   \\  /   \\ |   \\      |    \\  /   \\ |  |  ||  |\r
                |   __||     ||     ||    \\     |  o  )|     ||  |  ||  |\r
                |  |  ||  O  ||  O  ||  D  |    |     ||  O  ||  ~  ||__|\r
                |  |_ ||     ||     ||     |    |  O  ||     ||___, | __ \r
                |     ||     ||     ||     |    |     ||     ||     ||  |\r
                |___,_| \\___/  \\___/ |_____|    |_____| \\___/ |____/ |__|\r
                """;

        final String goodGirlText = """
                  ____   ___    ___   ___         ____  ____  ____   _     \r
                 /    | /   \\  /   \\ |   \\       /    ||    ||    \\ | |    \r
                |   __||     ||     ||    \\     |   __| |  | |  D  )| |    \r
                |  |  ||  O  ||  O  ||  D  |    |  |  | |  | |    / | |___ \r
                |  |_ ||     ||     ||     |    |  |_ | |  | |    \\ |     |\r
                |     ||     ||     ||     |    |     | |  | |  .  \\|     |\r
                |___,_| \\___/  \\___/ |_____|    |___,_||____||__|\\_||_____|\r
                """;

        // Introduction

        System.out.println("Welcome to...");
        System.out.println(masterMindText);
        System.out.println("Let's start with your name...");
        name = sc.nextLine();
        System.out.println("And your gender?");

        // Gender selection since I need to show that I know how to use all the loop
        // types :)

        do {
            System.out.println("'male' or 'female'");
            gender = sc.nextLine();

            if (gender.equals("male") || gender.equals("female")) {
                break;
            }
            System.out.println("Enter a valid gender!!!");
        } while (true);

        // Random code generation

        for (i = 0; i < codeLength; i++) {

            randomColor = r.nextInt(colorList.length);
            colorCode.append(colorList[randomColor]);
        }

        // Game

        outerLoop: for (i = 0; i < gameLength; i++) {

            // Asks for user-input and displays options

            attempt = i + 1;
            flush();

            // Debug mode if the name is set to "Admin"

            if (name.equals("Admin")) {
                System.out.println(colorCode);
            }

            System.out.println(masterMindText);
            System.out.println("Attempt: " + attempt + "/" + gameLength + "\r\n" + "Welcome " + name
                    + ", please enter your guess down below.\r\n" + "Choose from: " + Arrays.asList(colorList)
                    + "\r\n");

            // Runs when the user has made a previous guess for evaluation

            if (firstAttempt) {
                System.out.println("Previous guess:\r\n" + playerInput + "\r\n\r\n" + positionEvaluation + "\r\n" + "\r\n"
                        + "Incorrect colors are represented with hyphens (-).\r\n"
                        + "Correct colors are labeled black (B).\r\n"
                        + "Colors present in the code but in the incorrect position are labeled white (W).\r\n");
            }

            // Runs when the user give an input longer than {codeLength}

            if (wrongInput) {
                wrongInput = false;
                System.out.println("ERROR\r\n" + "Your guess must be at least " + codeLength
                        + " characters long and only contain " + Arrays.toString(colorList) + "!");
            }

            // Makes the user-input upper case

            playerInput = sc.nextLine();
            playerInput = playerInput.toUpperCase();

            // Checks if the code is {codeLength} characters long

            if (playerInput.length() != colorCode.length()) {
                i--;
                wrongInput = true;
                continue;
            }

            // Runs when the player guesses correctly

            if (playerInput.equals(colorCode.toString())) {

                correctGuess = true;
                break;
            }

            // Sets variables for next execution

            firstAttempt = true;
            positionEvaluation = "";

            // Checks if individual characters match the code and evaluates it, throws an
            // error when the character doesn't exist

            for (i2 = 0; i2 < codeLength; i2++) {

                character = "" + playerInput.charAt(i2);
                if (Arrays.asList(colorList).contains(character)) {

                    if (playerInput.charAt(i2) == colorCode.charAt(i2)) {

                        positionEvaluation = positionEvaluation + "B";
                    } else if (colorCode.toString().contains(character)) {

                        positionEvaluation = positionEvaluation + "W";
                    } else {

                        positionEvaluation = positionEvaluation + "-";
                    }
                } else {
                    wrongInput = true;
                    firstAttempt = false;
                    i--;
                    continue outerLoop;
                }
            }
        }

        // No-attempts left

        sc.close();
        flush();

        if (correctGuess) {

            System.out.println(masterMindText);
            System.out.println(goodJobText);

            if (gender.equals("male")) {
                System.out.println(goodBoyText);
            } else {
                System.out.println(goodGirlText);
            }
        } else {

            System.out.println(masterMindText);
            System.out.println(wompWompText);
            System.out.println(tooBadText);
        }
    }
}