abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {

    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Rectangle Area: " + (l * w));
    }
}

public class ShapeMain {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.area();

        Rectangle r = new Rectangle(4, 6);
        r.area();
    }
}