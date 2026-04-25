class Dimension {
    void area() {
        System.out.println("Area method of Dimension class");
    }
}

class Rectangle extends Dimension {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Dimension {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

class polymorphism {
    public static void main(String[] str) {

        int length = Integer.parseInt(str[0]);
        int breadth = Integer.parseInt(str[1]);
        int base = Integer.parseInt(str[2]);
        int height = Integer.parseInt(str[3]);

        Dimension d;

        d = new Rectangle(length, breadth);
        d.area();

        d = new Triangle(base, height);
        d.area();
    }
}
