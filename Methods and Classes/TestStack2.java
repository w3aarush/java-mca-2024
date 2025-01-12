// Improved Stack class that uses the length array member
class Stack2 {
    private int stck[];
    private int tos;

    // allocate and initialze stack
    Stack2(int size) {
        stck = new int[size];
        tos -= 1;
    }

    // Push an item onto the stack
    void push(int element) {
        if(tos==(stck.length-1)) System.out.println("Stack is full.");
        else stck[++tos] = element;
    }

    // Pop an item from the stack
    int pop() {
        if(tos<0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack2 stack1 = new Stack2(5);
        Stack2 stack2 = new Stack2(8);

        // Pushing elements into the stack
        for(int i=1; i<6; i++) stack1.push(i);

        for(int i=1; i<9; i++) stack2.push(2*i);

        // Poping elements from the stack
        System.out.println("Popping elements from stack1:");
        for(int i=1; i<6; i++) System.out.println(stack1.pop());

        System.out.println("Popping elements from stack2:");
        for(int i=1; i<9; i++) System.out.println(stack2.pop());
    }
}