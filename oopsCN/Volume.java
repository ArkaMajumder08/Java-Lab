class Volume 
{
	double volume(double length, double breadth, double height) 
	{
        	return length * breadth * height;
    	}

	double volume(double arm) 
	{
        	return arm * arm * arm;
    	}

        double volume(double radius, double height) 
	{
        	return 3.14 * radius * radius * height;
    	}

    	public static void main(String[] str) 
	{
        	Volume ob = new Volume();

        	System.out.println("Volume of Rectangular Box: " + ob.volume(10,5,2));
       	 	System.out.println("Volume of Cube: " + ob.volume(4));
        	System.out.println("Volume of Cylinder: " + ob.volume(3,7));
    	}
}
