package CA221.Practice;

public class Vehicle {
    //variables
    private int id;
    private boolean isRented;
    private double rentRate;

    Vehicle(){
        id = 1;
        isRented = false;
        rentRate = 10;
    }
    public Vehicle(int id, boolean isRented, double rentRate) {
        this.id = id;
        this.isRented = isRented;
        this.rentRate = rentRate;
    }
    //Methods
    void rent(){
        if( !isRented )
            isRented = true;
        else
            System.out.println("Already rented!");
    }
    void returnVehicle(){
        if( isRented)
            isRented = false;
        else
            System.out.println("This is vehicle is not rented!");
    }
    void calculateCost(int days) throws IllegalArgumentException{
        if(days > 0)
            System.out.println("Cost: " + (rentRate * days));
        else
            throw new IllegalArgumentException("days must be greater than zero");
    }
    void display(){
        System.out.println("Id:  " + id);
        System.out.println("Is rented: " + isRented);
        System.out.println("Rental rate: " + rentRate) ;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", isRented=" + isRented +
                ", rentRate=" + rentRate +
                '}';
    }
}
