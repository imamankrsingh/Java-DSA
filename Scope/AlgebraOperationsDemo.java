class Algebra {

    int a = 10;
    int b = 20;

    int add() {
        int p = 100;
        int q = 200;
        return p + q;
    }

    int sub() {
        return a - b;  
    }

    void demo() {
        int a = 5;
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            int b = 10;
            System.out.println(b);
        }

        {
            int b = 100;
            System.out.println(b);
        }
    }
}

public class AlgebraOperationsDemo {  
    public static void main(String[] args) {

        Algebra obj = new Algebra();

        obj.demo();

        System.out.println("Addition = " + obj.add());
        System.out.println("Subtraction = " + obj.sub());
    }
}