package flight;

public class flight {
    int seats;
    int passengers;

    flight(){// constructor
        seats = 10;
        passengers= 0;
    }

    public void addPassenger(/*int passengers*/){
        //this.passengers+=passengers;
        passengers++;
            if (passengers >= seats ) {
            System.out.println(" Full please add seats");
            System.exit(0);
        }

    }

    public void setNumberOfSeats(int seats) {
        this.seats = seats;
        //this refers to the seats in the manilaToBoracay
    }
//TODO validate if there are available seats left. If no display "Full"
//TODO set new value of seat so addPassenger is allowed again
    }

