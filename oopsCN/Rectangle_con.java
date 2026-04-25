class Rectangle 
{
    int length, breadth;

    Rectangle(int l, int b) 
    {
        length = l;
        breadth = b;
    }

    void area() 
    {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

class RectBox extends Rectangle 
{
    int height;
    RectBox(int l, int b, int h) 
    {
        super(l, b);         
	height = h;
    }

    void volume() 
    {
        System.out.println("Volume of rectangular box: " + (length * breadth * height));
    }
}

class Rectangle_con 
{
    public static void main(String[] str) 
    {
        RectBox ob = new RectBox(10, 5, 4);
        ob.area();
        ob.volume();
    }
}
