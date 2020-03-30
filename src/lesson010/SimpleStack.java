package lesson010;

public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = maxSize - 1;
    }

    public void push(long element) {
        stackArray[--top] = element;
    }

    public long pop() {
        return stackArray[top++];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == maxSize - 1;
    }
}

class StackMain {
    public static void main(String[] args) {
        SimpleStack simpleStackNew = new SimpleStack(10);
        simpleStackNew.push(10);
        simpleStackNew.push(20);
        simpleStackNew.push(30);
//        simpleStackNew.pop();
//        simpleStackNew.peek();
//        simpleStackNew.isEmpty();

        while (!simpleStackNew.isEmpty()) {
            long popElement = simpleStackNew.pop();
            System.out.println(popElement);
        }
    }
}
