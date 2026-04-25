class SumArray 
{

    public static void main(String[] str) 
	{

        	int sum=0;
	        for(int i=0;i<str.length;i++) 
		{
            		sum = sum + Integer.parseInt(str[i]);
        	}

        	System.out.println("Sum of the numbers: " + sum);
    	}
}
