package ro.ase.acs.main;

import ro.ase.acs.command.*;
import ro.ase.acs.observer.YouTubeChannel;
import ro.ase.acs.observer.YouTubeSubscriber;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(20);
        vendingMachine.buyProduct(15);
        vendingMachine.inputMoney(20);
        vendingMachine.buyProduct(25);


        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        FoodOrder pizzaOrder = new PizzaOrder(chef);
        waiter.takeOrder(pizzaOrder);
        FoodOrder burgerOrder = new BurgerOrder(chef);
        waiter.takeOrder(burgerOrder);
        waiter.sendOrdersToKitchen();


        YouTubeChannel youTubeChannel = new YouTubeChannel("Recorder");
        YouTubeSubscriber subscriber1 = new YouTubeSubscriber();
        YouTubeSubscriber subscriber2 = new YouTubeSubscriber();

        youTubeChannel.subscribe(subscriber1);
        youTubeChannel.subscribe(subscriber2);

        youTubeChannel.uploadVideo("Cartelul din Carpati");
        youTubeChannel.unsubscribe(subscriber1);

        youTubeChannel.uploadVideo("Marele alb");
//seminar CTS11

        PartMover partMover = new RoboticArm();
        partMover.move();


    }
}
