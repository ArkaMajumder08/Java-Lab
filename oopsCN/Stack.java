class Stack {
    int[] stack = new int[5];
    int top = 0;

    void push(int a) {
        stack[top]=a;
	top+=1;
    }
    
    void pop(){
	top-=1;
    }
    
    void display(){
	for(int i=0;i<top;i++){
		System.out.println(" "+stack[i]);
	}
    }
	public static void main(String[] str){
		Stack ob=new Stack();
		for(int i=0;i<5;i++){
			ob.push(Integer.parseInt(str[i]));
		}
	
	
		ob.display();
		ob.pop();
		System.out.println("\n output after pop:");
		ob.display();
	}
}