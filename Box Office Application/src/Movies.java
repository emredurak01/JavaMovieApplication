import java.util.Scanner;

public class Movies {
    static Session dayDecision = new Session();

    static String yourMovie;
    static int dayChoice;
    static String dayName;
    static int sessionNumber;
    static int movieDecision;

    static String movieNames = "1.Matrix\n" +"2.Avatar\n" + "3.Fight Club\n"+"4.Toy Story\n"+"5.Cars";
    static String movieNamesUnder18 = "1.Toy Story\n" +"2.Cars";
    static String dayList = "1.Sunday\n"+"2.Monday\n"+"3.Tuesday\n"+"4.Wednesday\n"+"5.Thursday\n"+"6.Friday\n"+"7.Saturday";


    public static void display() {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is the movie list");
        System.out.println(movieNames);

        System.out.println("Which one do you prefer to watch? ");
       movieDecision = input.nextInt();

        if (movieDecision == 1) {

            yourMovie = "Matrix";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Matrix \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsMatrix();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }
        }

        if (movieDecision == 2) {

            yourMovie = "Avatar";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Avatar \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsAvatar();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }

        if (movieDecision == 3) {

            yourMovie = "Fight Club";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Fight Club \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsFightClub();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }

        if (movieDecision == 4) {

            yourMovie = "Toy Story";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Toy Story \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }

        if (movieDecision == 5) {

            yourMovie = "Cars";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Cars \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }
    }

    public static void displayUnder18() {

        Scanner input = new Scanner(System.in);

        System.out.println("Here is the movie list: ");
        System.out.println(movieNamesUnder18);

        System.out.println("Which one do you prefer to watch? ");
        movieDecision = input.nextInt();

        if (movieDecision == 1) {

            yourMovie = "Toy Story";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Toy Story \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsToyStory();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }

        if (movieDecision == 2) {

            yourMovie="Cars";
            System.out.println("*****-*****");
            System.out.println("Your movie is going to be Cars \n"
                    +"Which day would you like to go?");

            System.out.println(dayList);

            int dayChoice = input.nextInt();

            switch (dayChoice) {
                case 1 -> {
                    System.out.println("Session list for Sunday");
                    dayDecision.weekendSessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Sunday";
                }
                case 2 -> {
                    System.out.println("Session list for Monday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Monday";
                }
                case 3 -> {
                    System.out.println("Session list for Tuesday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Tuesday";
                }
                case 4 -> {
                    System.out.println("Session list for Wednesday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Wednesday";
                }
                case 5 -> {
                    System.out.println("Session list for Thursday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Thursday";
                }
                case 6 -> {
                    System.out.println("Session list for Friday");
                    dayDecision.weekdaySessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Friday";
                }
                case 7 -> {
                    System.out.println("Session list for Saturday");
                    dayDecision.weekendSessionsCars();
                    sessionNumber = input.nextInt();
                    dayName = "Saturday";
                }
                default -> {
                    System.out.println("You entered invalid value\n" + "Please enter a valid number! (1 to 7): ");
                }
            }

        }


    }
}
