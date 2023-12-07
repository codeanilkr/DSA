import java.util.EmptyStackException;
class Stack {
 private int maxSize; // Maximum size of the stack
 private int top; // Index of the top element
 private int[] stackArray; // Array to store elements in the stack
 public Stack(int size) {
 maxSize = size;
 stackArray = new int[maxSize];
 top = -1; //
 }
 public void push(int value) {
 if (top < maxSize - 1) {
 stackArray[++top] = value; // Increment top and add the value
 System.out.println("Pushed: " + value);
 } else {
 System.out.println("Stack is full. Cannot push: " + value);
 }
 }
 public int pop() {
 if (!isEmpty()) {
 int value = stackArray[top--]; // Retrieve value and decrement

 return value;
 } else {
 throw new EmptyStackException();
 }
}
public int peek() {
 if (!isEmpty()) {
 return stackArray[top];
 // Return the value at the top
 } else {
 throw new EmptyStackException();
 }
 }
 public boolean isEmpty() {
 return top == -1;
 }
 public boolean isFull() {
 return top == maxSize - 1;
 }
}
public class StackExample {
 public static void main(String[] args) {
 Stack stack = new Stack(5); // Create a stack with a capacity of 5
 stack.push(10);
 stack.push(20);
 stack.push(30);
 System.out.println("Peek: " + stack.peek()); // Peek at the top element
 System.out.println("Pop: " + stack.pop()); // Pop the top element
 stack.push(40);
 stack.push(50);
 System.out.println("Is Empty? " + stack.isEmpty());
 System.out.println("Is Full? " + stack.isFull());
 while (!stack.isEmpty()) {
 System.out.println("Popped: " + stack.pop());
 }}}