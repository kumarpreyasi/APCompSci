public class Savings extends Account{

    protected double savingsBalance;

    int customer;

    Savings(int newCustomer, double newBalance) {

        customer = newCustomer;

        savingsBalance = newBalance;

        //System.out.println("Account: " + customer);

    }

    //deposit

    //withdrawal

    public void editBalance(double amount) {

        savingsBalance += amount;

    }
}
