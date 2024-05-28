package ro.acs.ase.command.v1;

public class ReserveTable implements Reserve {

    private Table table;
    //private int noPersons;

    public ReserveTable (Table table, int noPersons, String clientName){
        this.table = table;
        table.reserveTable(noPersons, clientName);
    }

    @Override
    public void reserveTable() {

    }

    @Override
    public void cancelReservation() {

    }
}
