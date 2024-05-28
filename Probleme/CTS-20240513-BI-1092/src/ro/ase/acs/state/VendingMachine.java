package ro.ase.acs.state;

public class VendingMachine {
    private VendingMachineState state;
    private double ballance;

    public void setState(VendingMachineState state) {
        this.state = new InputMoneyState();
        state.displayMessage();
    }

    public VendingMachine() {
        this.state = state;
    }

    public void inputMoney (double sum) {
        ballance += sum;
        state = new SelectProductState();
        state.displayMessage();
    }

    public void buyProduct(double price){
        if(price <= ballance){
            state = new DeliveryProductState();
            state.displayMessage();
            if(price < ballance){
                state = new ReturnChangeState();
                state.displayMessage();
            }
            ballance =0;
    }else {
            state = new InputMoneyState();
            state.displayMessage();
        }

    }
}
