package ro.ase.acs.state;

public class ReturnChangeState implements VendingMachineState{

    @Override
    public void displayMessage() {
        System.out.println("Please take your change");
    }
}
