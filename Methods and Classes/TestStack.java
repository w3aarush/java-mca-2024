// This class defines an integer stack that can hold 10 values.
class Stack {
    // Both stck and tos are private. this means that they can't be accidentally or maliciously altered
    private int stck[] = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if(tos==9) System.out.println("Stack is full.");
        else stck[++tos] = item;
    }

    // Pop an item from the stack
    int pop() {
        if(tos<0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[tos--];
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        // push some numbers onto the stack
        for(int i=0; i<10; i++) {
            stack1.push(i);
            System.out.println("Pushed: "+i);
        }
        for(int i=10; i<20; i++) {
            stack2.push(i);
            System.out.println("Pushed: "+i);
        }

        // pop items off the stack
        System.out.println("\nStack in stack1:");
        for(int i=0; i<10; i++) System.out.println("Popped: "+stack1.pop());

        System.out.println("\nStack in stack2");
        for(int i=0; i<10; i++) System.out.println("Popped: "+stack2.pop());

        // these statements are not legal
        // stack1.tos = -2;
        // stack2.stck[3] = 100;
    }
}