class Bike{
    int speedlimit=70;
    void run()
    {
        System.out.println("Bike's limit: "+speedlimit);
    }
}

class Splender extends Bike{
    int speedlimit = 100;
    void run()
    {
        System.out.println("Splendar's limit: "+speedlimit);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
        obj = new Splender();
        obj.run();
    }
}