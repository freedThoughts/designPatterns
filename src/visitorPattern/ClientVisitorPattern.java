package visitorPattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Prakash on 11-06-2018.
 *
 */
public class ClientVisitorPattern {
    public static void main(String[] a){

        List<ShoppingItem> items = Arrays.asList(new ShoppingItemApparel(1000), new ShoppingItemApparel(500), new ShoppingItemApparel(2000),
                new ShoppingItemBooks(200), new ShoppingItemBooks(500), new ShoppingItemBooks(150),
                new ShoppingItemFootware(200), new ShoppingItemFootware(2500), new ShoppingItemFootware(5000));

        Visitor visitor = shoppingItem -> {
            int cost = shoppingItem.getMRP();

            // Seasonal discount of 5 % on all Items --- Common logic for all Items  - changes can be handled at only one place i.e here only
            // ****** Only one changes here helps to avoid changes in all item classes **************************
            cost *= 0.95;

            // Special discount of 15 % on Apparel  --- Common logic for all Apparel - changes can be handled at only one place i.e here only
            if(shoppingItem instanceof ShoppingItemApparel )
                cost *= 0.85;

            // Special discount of 5 % on books --- Common logic for all Books  - changes can be handled at only one place i.e here only
            if(shoppingItem instanceof ShoppingItemBooks)
                cost *= 0.95;

            // Tax of 10 %      --- Common logic for all Items  - changes can be handled at only one place i.e here only
            // ****** Only one changes here helps to avoid changes in all item classes **************************
            cost *= 1.1;

            return cost;
        };


        List<Integer> costListForItems = items.stream().map(item -> item.accept(visitor)).collect(Collectors.toList());
        costListForItems.stream().forEach(System.out ::  println);
    }

}
