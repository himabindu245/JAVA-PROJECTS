package xyz;

class car extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("BMW car moving " + i);
            try {
                Thread.sleep(500); // pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Car thread interrupted");
            }
        }
    }
}
class bike extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ninja bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Bike thread interrupted");
            }
        }
    }
}
public class SimpleRace {
    public static void main(String[] args) {
        new car().start();
        new bike().start();
    }
}
