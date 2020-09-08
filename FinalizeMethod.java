package practise2;

public class FinalizeMethod {
    public void finalize() throws Throwable{
        System.out.println("Object is destroyed by Garbage collector");
    }

    public static void main(String[] args) {
        FinalizeMethod obj = new FinalizeMethod();
        obj = null;
        System.gc();

    }
}
