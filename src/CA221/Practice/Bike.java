package CA221.Practice;

public class Bike extends Vehicle{
    private boolean isBasket;
    Bike(){
        isBasket = false;
    }
    Bike(boolean value){
        isBasket = value;
    }

    void display(){
        System.out.println("is Basket: "+ isBasket);
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}
