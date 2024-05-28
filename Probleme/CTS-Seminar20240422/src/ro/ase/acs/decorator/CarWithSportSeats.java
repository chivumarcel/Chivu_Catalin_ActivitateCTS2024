package ro.ase.acs.decorator;

public class CarWithSportSeats extends CarDecorator{
    private String seatProducer; //e.g. Recaro

    public String getSeatProducer() {
        return seatProducer;
    }

    public void setSeatProducer(String seatProducer) {
        this.seatProducer = seatProducer;
    }

    public CarWithSportSeats(Vehicle vehicle) {
        super(vehicle);
    }
}
