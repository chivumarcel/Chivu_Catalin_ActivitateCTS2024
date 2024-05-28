package ro.acs.ase.command.v1;

public class Table {
    private int tableNumber;
    private boolean isReserved;
    private boolean isOccupied;
    private boolean isFree;

    public void rezerveTable (int noPersons, String clientName){
        System.out.println("The table is occupied for "+ noPersons +" persons, for the client name "+clientName);
        //System.out.println("The table is occupied");
    }

    public void cancelReservation (int noPersons, String clientName){
        System.out.println("The reservation for "+clientName+ " was canceled");
        //System.out.println("The reservation was canceled");
    }

    public void occupyTable(int noPersons, String clientName){
        System.out.println("The table was occupied by "+clientName + " for " +noPersons + " persons");
    }

    public void freeTable(){
        System.out.println("The table has been freed, the clients left");
    }

    public void reserveTable(int noPersons, String clientName) {
        System.out.println("The table has been reserver by" + clientName + " for "+noPersons+ " persons");
    }
}
