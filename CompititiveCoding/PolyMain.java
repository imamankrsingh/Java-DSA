class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}


class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}


public class PolyMain {

    public static void main(String[] args) {

        
        Calculator c = new Calculator();

        System.out.println("Add 2 numbers: " + c.add(5, 10));
        System.out.println("Add 3 numbers: " + c.add(5, 10, 15));

        
        Shape s = new Circle();

        s.draw();
    }
}