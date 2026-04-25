class Rectangle
{

	public double area(double length, double breadth)
	{
		double area=length*breadth;
		return area;
	}
	public double perimeter(double length, double breadth)
	{
		double perimeter=2*(length + breadth);
		return perimeter;
	}
	public static void main(String[] str)
	{
	
		double length = Integer.parseInt(str[0]);
		double breadth = Integer.parseInt(str[1]);
		{
			Rectangle ob=new Rectangle();
			System.out.println("Area of rectangle="+ob.area(length,breadth));
			System.out.println("Perimeter of rectangle="+ob.perimeter(length,breadth));
		}
	}
}