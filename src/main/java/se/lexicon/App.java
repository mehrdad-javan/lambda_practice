package se.lexicon;


import se.lexicon.interfaces.Action;
import se.lexicon.interfaces.Conditional;
import se.lexicon.model.Product;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Iphone x", 1000.00, 1));
        productList.add(new Product("Surface Book 3", 2000.00, 20));
        productList.add(new Product("Iphone 6s", 100.00, 0));
        productList.add(new Product("Iphone 8", 400.00, 5));


        //Print out all Products that have stock value of 0.
        Conditional conditional = p -> p.getStock() == 0;
        Action action = p -> System.out.println(p.toString());
        process(productList, conditional, action);

        //Print out the productName of all the Products that starts with B.

        //Print out all Products that have price above 100 AND lower than 150

        //Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%

    }

    public static void process(List<Product> products, Conditional filter, Action action) {
        for (Product p : products) {
            boolean check = filter.test(p);
            if (check) {
                action.execute(p);
            }
        }
    }


}
