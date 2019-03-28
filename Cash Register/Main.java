import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product("Apple", "Fruit", 4001, 0.60, true, 500));
        inventory.add(new Product("Kiwi", "Fruit", 3877, 0.54, true, 800));
        inventory.add(new Product("Orange", "Fruit", 1198, 0.74, true, 400));
        inventory.add(new Product("Banana", "Fruit", 8265, 1.05, true, 250));
        inventory.add(new Product("Grape", "Fruit", 6949, 0.10, true, 1800));
        inventory.add(new Product("Carrot", "Vegetable", 7329, 1.10, true, 500));
        inventory.add(new Product("Onion", "Vegetable", 2880, 0.92, true, 670));
        inventory.add(new Product("Cucumber", "Vegetable", 1992, 1.54, true, 420));
        inventory.add(new Product("Broccoli", "Vegetable", 2394, 0.65, true, 800));
        inventory.add(new Product("Zucchini", "Vegetable", 3048, 1.54, true, 400));


    }
    
}
