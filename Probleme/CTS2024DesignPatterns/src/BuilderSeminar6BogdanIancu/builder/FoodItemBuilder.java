package builder;

import java.time.LocalDate;

public class FoodItemBuilder {
    private String name;
    private float price;
    private String producer;
    private LocalDate bestBefore;
    private float discount;
    private boolean isGlutenFree;
    private boolean isVegetarian;

    public FoodItemBuilder addName(String name) {
        this.name = name;
        return this;
    }

    public FoodItemBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public FoodItemBuilder addProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public FoodItemBuilder addBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
        return this;
    }

    public FoodItemBuilder addDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    public FoodItemBuilder addGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public FoodItemBuilder addVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
        return this;
    }
    public FoodItem build() {
        return new FoodItem(name, price, producer, bestBefore, discount, isGlutenFree, isVegetarian);
    }
}
