package LLDCarRentalSystem;

public class Bill {

    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){
        //we can use the reservation object to calculate the Bill and write the logic here.
        //whatever is required to calculate the Bill we have that in the reservation class.
        return 100.0;
    }

}
