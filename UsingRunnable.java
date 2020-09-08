package practise2;

public class UsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread ended...");
    }

    public static void main(String[] args) {
        UsingRunnable obj = new UsingRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("Hi");
    }
}
