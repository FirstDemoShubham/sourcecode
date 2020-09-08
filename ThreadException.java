package practise2;

public class ThreadException extends Thread {

    public void run(){
        System.out.println("running..");
    }

    public static void main(String[] args) {
        ThreadException t1 = new ThreadException();
        t1.start();
        t1.start();
    }
}
