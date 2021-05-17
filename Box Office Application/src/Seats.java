import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seats {
    static String seatNumber;
    static String seats[][] = {
            {"A1","A2","A3","A4","A5","A6","A7","A8"},
            {"B1","B2","B3","B4","B5","B6","B7","B8"},
            {"C1","C2","C3","C4","C5","C6","C7","C8"},
            {"D1","D2","D3","D4","D5","D6","D7","D8"},
            {"E1","E2","E3","E4","E5","E6","E7","E8"}
    };
    static List<String> seatList = new ArrayList<String>();
    public static void displaySeats() {
        boolean seatValid = true;
        Scanner input = new Scanner(System.in);
        System.out.println("                -----SCREEN-----");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" |" + seats[i][j] + "| ");
            }
            System.out.println(" ");
        }
        System.out.println("Select a seat: ");
        String seatDecision = input.next();



        while (seatValid){
            if(seatList.contains(seatDecision)){
                System.out.println("This seat is full.Please enter another seat: ");
                seatDecision = input.next();
            }else{
                seatValid=false;
            }
        }
        seatList.add(seatDecision);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (seatDecision.equals(seats[i][j])) {
                    seats[i][j] = "XX";
                }
            }
        }
        System.out.println("*****-*****");
        System.out.println("                -----SCREEN-----");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" |" + seats[i][j] + "| ");
            }
            System.out.println(" ");
        }
        seatNumber = seatDecision;
    }
}
