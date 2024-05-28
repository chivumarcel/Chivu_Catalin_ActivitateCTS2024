package builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private float price;
    private String producer;
    private LocalDate bestBefore;
    private float discount;
    private boolean isGlutenFree;
    private boolean isVegetarian;

    private FoodItem() {
    }

    FoodItem(String name, float price, String producer, LocalDate bestBefore, float discount, boolean isGlutenFree, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.bestBefore = bestBefore;
        this.discount = discount;
        this.isGlutenFree = isGlutenFree;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public float getDiscount() {
        return discount;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FoodItem{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", bestBefore=").append(bestBefore);
        sb.append(", discount=").append(discount);
        sb.append(", isGlutenFree=").append(isGlutenFree);
        sb.append(", isVegetarian=").append(isVegetarian);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{
        private FoodItem foodItem = new FoodItem();
        public void addName(String name){
            foodItem.name = name;
        }
        public void addPrice(float price){
            foodItem.price = price;
        }
        public void addProducer(String producer){
            foodItem.producer = producer;
        }
        public void addDiscount(float discount){
            foodItem.discount = discount;
        }

        public void addBestBefore(LocalDate bestBefore){
            foodItem.bestBefore = bestBefore;
        }
        public void addIsGlutenFree(boolean isGlutenFree){
            foodItem.isGlutenFree = isGlutenFree;
        }
        public void addIsVegetarian(boolean isVegetarian){
            foodItem.isVegetarian = isVegetarian;
        }
        public FoodItem build(){
            FoodItem copy = foodItem;
            foodItem = new FoodItem();
            return copy;
        }
    }
}

