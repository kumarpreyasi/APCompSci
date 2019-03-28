public class Checking extends Account{

    protected double checkingBalance;

    int customer;

    Checking(int newCustomer, double newBalance) {

        customer = newCustomer;

        checkingBalance = newBalance;

        //System.out.println("Account: " + customer);

    }

    //deposit

    //withdrawal

    public void editBalance(double amount) {

        checkingBalance += amount;

    }
}
