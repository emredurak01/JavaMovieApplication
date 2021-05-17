import java.sql.*;
import java.util.Scanner;


public class Main {

    static String menuDecision;

    public static void main(String[] args) {

        int ticketCounter = 0;
        int menuCounter = 0;
        int movieCounter = 0;

        DbConnection.connect();

        int ticketCost ;
        int menuCost ;
        int totalPay ;

        Scanner input = new Scanner(System.in);

        while (loginValid) {

            System.out.println(
                    "1. Register\n" +
                    "2. Login\n" +
                    "3. Admin\n" +
                    "4. Quit");

            int choice = input.nextInt();


            if (choice == 1) {


                System.out.println("Username: ");
                String username = input.next();

                System.out.println("Password: ");
                String password = input.next();

                System.out.println("Age: ");
                int age = input.nextInt();

                insert(username,password,age);
            }
            if (choice == 2) {
                System.out.println("*****-*****");
                login();
            }
            if(choice==3){
                admin();
            }
            if (choice == 4) {
                System.exit(0);
            }
        }


        while (true) {

            ticketCost = 0;
            menuCost = 0;
            totalPay = 0;
            System.out.println("*****-*****");
            System.out.println("What do you want to do? \n" +
                    "1. Booking\n" +
                    "2. View ticket\n" +
                    "3. View star\n" +
                    "4. Logout");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("*****-*****");
                if (user_age>=18) {
                    Movies.display();
                    Seats.displaySeats();

                }
                else {
                    System.out.println("Because of your age, you are not allowed to watch all movies.");
                    Movies.displayUnder18();
                    Seats.displaySeats();


                }

                while (star >= 3) {
                    System.out.println("*****-*****");
                    System.out.println("You have " +star +" star. Do you want to use your stars? \n" +
                            "1. Use stars\n" +
                            "2. Do not use stars");
                    int starChoice = input.nextInt();

                    while (starChoice == 1) {

                        System.out.println("Ticket costs 5, menu costs 3 star. What do you want to buy?\n" +
                                "1. Ticket\n" +
                                "2. Menu");
                        int buyChoice = input.nextInt();

                        if (buyChoice == 1) {

                            if (ticketCounter == 1) {
                                System.out.println("You can't buy more than 1 ticket");
                                break;
                            }

                            if (star < 5) {
                                System.out.println("You do not have enough stars to buy a ticket");
                                break;

                            }
                            if (star >= 5) {
                                System.out.println("You bought a ticket");
                                DecreaseStarBy5();
                                ticketCounter++;
                                break;
                            }
                        }

                        if (menuCounter == 1) {
                            System.out.println("You can't buy more than 1 menu");
                            break;
                        }
                        if (buyChoice == 2) {
                            System.out.println("You bought a menu");
                            DecreaseStarBy3();
                            menuCounter++;
                            menuDecision ="Yes";
                            break;
                        }
                    }
                    if (starChoice == 2) {
                        break;
                    }
                }

                if (ticketCounter == 0){
                    System.out.println("*****-*****");
                    if (user_age >= 65) {
                        System.out.println("Ticket costs 13$");
                        ticketCost = 13;
                    }
                    if (18 <= user_age && user_age < 65) {
                        System.out.println("Ticket costs 16$");
                        ticketCost = 16;
                    }
                    if (user_age < 18) {
                        System.out.println("Ticket costs 10$");
                        ticketCost = 10;
                    }
                    System.out.println("*****-*****");
                }


                if (menuCounter == 0) {
                    System.out.println("Do you want menu? (5$)\n" +
                            "1. Yes\n" +
                            "2. No");
                    int menuChoice = input.nextInt();

                    if (menuChoice == 1) {
                        System.out.println("*****-*****");
                        System.out.println("You bought menu");
                        menuCost = menuCost + 5;
                       menuDecision = "Yes";
                    }
                    else if(menuChoice==2){
                    menuDecision = "No";
                    }
                }

                totalPay = ticketCost + menuCost;
                System.out.println("*****-*****");
                System.out.println("You will pay " +totalPay +"$");

                if (ticketCounter == 0) {
                    System.out.println("*****-*****");
                    System.out.println("You earned 1 star");
                    IncreaseStar();
                }
                System.out.println("*****-*****");
                System.out.println("We sent you the ticket");
                movieCounter++;
                System.out.println("*****-*****");
                System.out.println("You have " +star +" star");


            }

            if (choice == 2) {


                    if(movieCounter==0) {
                        System.out.println("You do not have any ticket.");
                    }
                    else {
                        System.out.println("View ticket");
                        System.out.println("*****-*****");
                        System.out.println("Movie name   : " + Movies.yourMovie);
                        System.out.println("Day          : " + Movies.dayName);
                        System.out.println("Session      : " + Movies.sessionNumber);
                        System.out.println("Seat         : " + Seats.seatNumber);
                        System.out.println("Menu         : " + menuDecision);
                    }

            }
            if(choice == 3){
                System.out.println("You have " + star + " star");
            }
            if (choice == 4) {
                System.exit(0);
            }
        }


    }

    static boolean loginValid = true;
    static int user_age;
    static String username_temp;
    static String password_temp;

    private static void insert (String username, String password, int age) {
        Connection con = DbConnection.connect();
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO userData(username, password, age) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, age);

            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private static void login() {

        Scanner input = new Scanner(System.in);

        System.out.println("Username:");
        username_temp = input.nextLine();

        System.out.println("Password: ");
        password_temp = input.nextLine();

        Connection con = DbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String sql = "SELECT username,password,age,star FROM userData WHERE username = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, username_temp);

            rs = ps.executeQuery();

            if (username_temp.equals(rs.getString(1)) && password_temp.equals(rs.getString(2))) {
                System.out.println("Login successful");
                loginValid = false;
            }
            else {
                System.out.println("Incorrect username or password.Try again.");
            }


            user_age = rs.getInt(3);
            star = rs.getInt(4);


        } catch(SQLException e) {
            System.out.println("Incorrect username or password.Try again.");
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
    }

    public static int star;
    private static void IncreaseStar() {

        Connection con = DbConnection.connect();
        PreparedStatement ps = null;

        try {
            String sql = "UPDATE userData set star = ? WHERE username = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, star = star + 1);
            ps.setString(2, username_temp);
            ps.execute();
        } catch(SQLException e) {
            System.out.println(e.toString());
        }
    }

    private static void DecreaseStarBy3() {

        Connection con = DbConnection.connect();
        PreparedStatement ps = null;

        try {
            String sql = "UPDATE userData set star = ? WHERE username = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, star = star - 3);
            ps.setString(2, username_temp);
            ps.execute();
        } catch(SQLException e) {
            System.out.println(e.toString());
        }
    }

    private static void DecreaseStarBy5() {

        Connection con = DbConnection.connect();
        PreparedStatement ps = null;

        try {
            String sql = "UPDATE userData set star = ? WHERE username = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, star = star - 5);
            ps.setString(2, username_temp);
            ps.execute();
        } catch(SQLException e) {
            System.out.println(e.toString());
        }
    }
    private static void readAllData(){
        Connection con = DbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            String sql = "SELECT * FROM userData";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("ALL USERS\n");
            while (rs.next()){
                String name = rs.getString("username");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                int star = rs.getInt("star");
                System.out.println("Name: "+ name);
                System.out.println("Password: "+ password);
                System.out.println("Age: "+ age);
                System.out.println("Star: " + star+"\n");
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }finally {
            try{
                rs.close();
                ps.close();
                con.close();

            }catch (SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    public static void admin(){
        Scanner input = new Scanner(System.in);
        final String admin_name = "İlker";
        final String admin_pass = "ilker.korkmaz";
        System.out.println("Enter your name: ");
        String admin_name_temp = input.next();
        System.out.println("Enter your pass: ");
        String admin_pass_temp = input.next();
        if(admin_name.equals(admin_name_temp)&&admin_pass.equals(admin_pass_temp)){
            System.out.println("Login successful!");
            System.out.println("What do you want to do?\n"+
                    "1.See all users");
            int admin_decision = input.nextInt();
            if(admin_decision==1){
                readAllData();
            }
        }
    }
}