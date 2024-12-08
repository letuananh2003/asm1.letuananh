import java.util.ArrayList;
import java.util.List;
import java.util.EmptyStackException;

public class StackADT<Student> {
    private List<Student> stack;

    public StackADT() {
        stack = new ArrayList<>();
    }

    // Push an element onto the stack
    public void push(Student student) {
        stack.add(student);
    }

    // Pop an element from the stack
    public Student pop() {
        if (isEmpty()) {
            throw new EmptyStackException();  // or return null
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek the top element of the stack
    public Student peek() {
        if (isEmpty()) {
            throw new EmptyStackException();  // or return null
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the number of elements in the stack
    public int size() {
        return stack.size();
    }

    // Clear the stack
    public void clear() {
        stack.clear();
    }
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        }
    }

}