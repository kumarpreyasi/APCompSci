import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static double savingsBalance;

    public static double checkingBalance;

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<Account>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your eight-digit MemberID number: ");
        System.out.println("Is this a checking or savings account?");

        String checkORsav = sc.nextLine();

        if (checkORsav.equals("checking")){
            System.out.printf("The current balance in your checking account is $%.2f.\n", checkingBalance);
        } else if (checkORsav.equals("savings")){
            System.out.printf("The current balance in your savings account is $%.2f.\n", savingsBalance);
        }


    }

}

