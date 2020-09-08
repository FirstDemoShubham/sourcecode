package practise2;

interface I {
     default public void show() {
         System.out.println("showing ...I");
    }
}

interface J {
    default public void show() {
        System.out.println("showing ...J");
    }
}


class Test implements I,J {

    public void show(){
        I.super.show();
    }

    public static void main(String[] args) {
        I t = new Test();
        t.show();

    }
}

