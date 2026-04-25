interface Volume {
    double pi = 3.14;

    double CalVolume(double radius, double height);
}

class Cylinder implements Volume {

    public double CalVolume(double radius, double height) {
        return pi * radius * radius * height;
    }
}

class Cone implements Volume {

    public double CalVolume(double radius, double height) {
        return (1.0 / 3) * pi * radius * radius * height;
    }
}

class Interface {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        Cone c2 = new Cone();

        System.out.println("Volume of Cylinder: " + c1.CalVolume(3, 7));

        System.out.println("Volume of Cone: " + c2.CalVolume(3, 7));
    }
}
