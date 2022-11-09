/**
 * Implementation of interface StringStack using an array as support.
 */
public class ArrayStringStack implements StringStack {
    /**
     * The array that contains the stack. Non-null.
     * When full, a new one is created.
     */
    private String[] stringArray;

    /**
     * The number of strings in this stack.
     * Never greater than stringArray.length.
     */
    private int size;

    /**
     * The initial size of the array.
     * (Note: not size of stack, which starts at 0)
     */
    private static int INITIAL_ARRAY_SIZE = 5;

    /**
     * Constructs an empty stack.
     */
    public ArrayStringStack() {
        stringArray = new String[INITIAL_ARRAY_SIZE];
        size = 0;
    }

    /**
     * Adds newText to this stack; may double memory usage of this stack.
     * @param newText to be added to this stack
     */
    public void push(String newText) {
        if (isFull()) {
            reserveMoreMemory();
        }
        stringArray[size] = newText;
        size++;
    }

    /**
     * Returns and removes the top element of this stack. Returns null if
     * this stack is empty.
     * @return the top element on this stack, null if this stack is empty
     */
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        size--;
        String result = stringArray[size];
        stringArray[size] = null;
        return result;
    }

    /**
     * Returns the top element of this stack. Returns null if
     * this stack is empty.
     * @return the top element on this stack, null if this stack is empty
     */
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stringArray[size - 1];
    }

    /**
     * @return whether this stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return true if the size of the stack is the same
     *  as the size of the array, false otherwise. 
     */ 
    private boolean isFull() {
        return stringArray.length == size;
    }

    /**
     * Creates a new array for the stack that is twice as big,
     * copies all elements from the old array into it, and
     * then replaces the old array with the new array.
     *
     * The old array is not pointed to by anyone, so it will 
     * be disposed of by the garbage collector.
     */
    private void reserveMoreMemory() {
        String[] biggerArray = new String[size*2];
        for (int i = 0; i < size; i++) {
            biggerArray[i] = stringArray[i];
        }
        stringArray = biggerArray;
    }
}
