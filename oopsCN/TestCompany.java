// Interface Sales
interface Sales {
    void getSales(double salesfigure);
    void displaySales();
}

// Superclass Item
class Item {
    String title;
    double price;

    void getItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

// HardwareItem class
class HardwareItem extends Item implements Sales {
    int id;
    String manufacturer;
    double salesfigure;

    void getHardware(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public void getSales(double salesfigure) {
        this.salesfigure = salesfigure;
    }

    public void displaySales() {
        System.out.println("Sales Figure: " + salesfigure);
    }

    void displayHardware() {
        displayItem();
        System.out.println("ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        displaySales();
    }
}

// SoftwareItem class
class SoftwareItem extends Item implements Sales {
    int id;
    String operatingSystem;
    double salesfigure;

    void getSoftware(int id, String os) {
        this.id = id;
        this.operatingSystem = os;
    }

    public void getSales(double salesfigure) {
        this.salesfigure = salesfigure;
    }

    public void displaySales() {
        System.out.println("Sales Figure: " + salesfigure);
    }

    void displaySoftware() {
        displayItem();
        System.out.println("ID: " + id);
        System.out.println("Operating System: " + operatingSystem);
        displaySales();
    }
}

// Main class
class TestCompany {
    public static void main(String[] args) {

        HardwareItem h = new HardwareItem();
        h.getItem("Printer", 15000);
        h.getHardware(101, "HP");
        h.getSales(500000);

        System.out.println("Hardware Item Details:");
        h.displayHardware();

        System.out.println("\nSoftware Item Details:");

        SoftwareItem s = new SoftwareItem();
        s.getItem("MS Office", 8000);
        s.getSoftware(201, "Windows");
        s.getSales(300000);

        s.displaySoftware();
    }
}