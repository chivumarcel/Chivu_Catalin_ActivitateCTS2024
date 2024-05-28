package ro.ase.acs.chain;

public class CallCenterManager extends CallCenterHandler{
    public static final int MANAGER_THRESHOLD = 1000;

    @Override
    public void refund(float sum) {
        if (sum <= MANAGER_THRESHOLD) {
            System.out.println("The manager processed the refund of " + sum);
        } else {
            if (nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
