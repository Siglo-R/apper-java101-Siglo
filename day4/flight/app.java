package flight;

public class app {
    public static void main(String[] args) {
        flight manilaToBoracay = new flight();

        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);
        manilaToBoracay.setNumberOfSeats(10);
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        System.out.println("Current number of available passengers:" + manilaToBoracay.passengers);
        System.out.println("Current number of available seats:" + manilaToBoracay.seats);
    }
}
