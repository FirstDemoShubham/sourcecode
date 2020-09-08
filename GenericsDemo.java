package practise2;

class Container<T>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Container<Integer> c = new Container<>();
        c.value = 10;
        c.show();

    }
}
