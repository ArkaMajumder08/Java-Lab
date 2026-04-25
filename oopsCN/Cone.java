class Cone {

    double radius, height;
	Cone()
	{
        	radius = 0;
        	height = 0;
        	System.out.println("Volume of cone (no arguments): " + volume());
    	}

    	Cone(double r, double h) 
	{
        	radius = r;
        	height = h;
        	System.out.println("Volume of cone (with arguments): " + volume());
    	}

     double volume() 
	{
        	return (1.0 / 3) * 3.14 * radius * radius * height;
    	}

    public static void main(String[] args) 
	{
        	Cone c1 = new Cone();

              	Cone c2 = new Cone(3, 7);
    	}
}
