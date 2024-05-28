package main;

import builder.FoodItem;
import builder.FoodItemBuilder;
import builder.FoodItemDirector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       FoodItem.Builder builder = new FoodItem.Builder();
           builder.addName("Pizza");
           builder.addPrice(24);
           builder.addBestBefore(LocalDate.now().plusDays(2));
           FoodItem pizza = builder.build();
           System.out.println(pizza);

           FoodItem item = builder.build();
              System.out.println(item);
              System.out.println(pizza);

        FoodItemBuilder foodItemBuilder = new FoodItemBuilder();
        foodItemBuilder.addName("Pasta").addPrice(15).addGlutenFree(true).addVegetarian(true);
        FoodItem pasta = foodItemBuilder.build();
        System.out.println(pasta);

        FoodItemDirector director = new FoodItemDirector();
        FoodItem sandwich = director.create("Club Sandwich", 30);
        System.out.println(sandwich);   
    };


}
