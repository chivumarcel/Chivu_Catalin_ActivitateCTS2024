package ro.ase.acs.state;

public class DeliveryProductState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please take your product");
    }
}
