package practise2;

interface I1 {
    public void show();
}
interface I2 {
    public void display();
}
public class InterfaceDemo implements I1,I2 {
    @Override
    public void show() {
        System.out.println("Show ");
    }
    @Override
    public void display() {
        System.out.println("Display");
    }
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.show();
        obj.display();
    }


}
