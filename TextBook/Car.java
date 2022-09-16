package TextBook;

public class Car {
    String carname;
    String color = "검정색";
    int velocity;
    void speedUp(){
        velocity += 5;
    }
    void speedDown(){
        velocity = -5;
    }
}

class Truck extends Car{
    int ton;

}
class Truckmain{
    public static void main(String args[]){
        Truck mytruck = new Truck();
        mytruck.carname = "프론티어";
        mytruck.ton = 3;
        System.out.println("나의 트럭은 "+mytruck.color+"의"+mytruck.carname+"이다.");
        System.out.println(mytruck.carname+"는 "+mytruck.color+"이다.");
    }
}

