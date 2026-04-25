class Box {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

class BoxWeight extends Box {
    double weight;
    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }
}

class Shipment extends BoxWeight {
    double costPerUnitVolume;
    double costPerUnitWeight;

    Shipment(double l, double b, double h, double w, double costVol, double costWt) {
        super(l, b, h, w);
        costPerUnitVolume = costVol;
        costPerUnitWeight = costWt;
    }

    double shippingCost() {
        return (volume() * costPerUnitVolume) + (weight * costPerUnitWeight);
    }

    public static void main(String[] args) {

        Shipment s = new Shipment(10, 5, 4, 20, 2, 5);

        System.out.println("Volume of parcel: " + s.volume());
        System.out.println("Weight of parcel: " + s.weight);
        System.out.println("Shipping cost: " + s.shippingCost());
    }
}
