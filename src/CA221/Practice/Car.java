package CA221.Practice;

public class Car extends Vehicle{
    private int noOfSeats;
    Car(){
        noOfSeats = 4;
    }
    Car(int id , boolean isRented, double rate,int number){
        super(id, isRented , rate);
        noOfSeats = number;
    }

    void display(){
        super.display();
        System.out.println("NO of seats: " + noOfSeats);
    }

    public static void main(String[] args) {
        Car brado = new Car(2 , true , 30,5);
        brado.display();
    }
}
