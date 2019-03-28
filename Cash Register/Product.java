public class Product {

    //Create Product class
    //Create a class that will contain the information for a simple product in a grocery store.
    // Each instance of the class will contain a name of the item, a PLU or UPC code number, price, type of item, quantity available, and if the item is eligible for sales tax.

    String name;
    String type;
    protected int code; //PLU or UPC
    protected double price;
    protected Boolean taxEligible;
    int quantity;

    void setQuantity(int quantity1){

    }


    public Product(String newName, String newType, int newCode, double newPrice, boolean isTaxEligible, int newQuantity) {

        name = newName;
        type = newType;
        code = newCode;
        price = newPrice;
        taxEligible = isTaxEligible;
        quantity = newQuantity;

        System.out.println("There are " + quantity + " " + name + "s available. They cost $" + price + " each. They are in the " + type + " section.");

    }



}
