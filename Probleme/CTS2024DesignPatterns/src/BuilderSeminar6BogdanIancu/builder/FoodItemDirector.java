package builder;

public class FoodItemDirector {
    private FoodItemBuilder builder;

    public FoodItem create (String name, float price) {
        builder = new FoodItemBuilder();
        return builder.addName(name).addPrice(price).build();
    }

    public FoodItem create (String name, float price, String producer) {
        builder = new FoodItemBuilder();
        return builder.addName(name).addPrice(price).addProducer(producer).build();
    }
}


// romb = compunere (directorul are un abstract builder)
// sageaga - derivare