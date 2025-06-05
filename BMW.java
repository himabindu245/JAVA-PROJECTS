package xyz;

abstract class AbstractExample {
    abstract void drive(); 
    abstract void stop(); 
}

public class BMW extends AbstractExample {

    @Override
    void drive() {
        System.out.println("Driving a BMW");
    }

    @Override
    void stop() {
        System.out.println("BMW is stopped");
    }

    public static void main(String[] args) {
        BMW ob = new BMW();         
        ob.drive();              
        ob.stop();
    }
}

