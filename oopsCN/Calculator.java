class Calculator {
 
    static int add(int a, int b) {
        return a + b;
    }

    
    static int subtract(int a, int b) {
        return a - b;
    }

   
    static int multiply(int a, int b) {
        return a * b;
    }

    
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[ ] str) { 

        int x = 20;
        int y = 5;

        System.out.println("Add: " + Calculator.add(x, y)); 
        System.out.println("Sub: " + Calculator.subtract(x, y)); 
        System.out.println("Mul: " + Calculator.multiply(x, y)); 
        System.out.println("Div: " + Calculator.divide(x, y)); 
    }
}
