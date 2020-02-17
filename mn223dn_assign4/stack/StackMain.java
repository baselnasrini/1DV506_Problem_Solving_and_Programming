package mn223dn_assign4.stack;

import java.util.*;

public class StackMain {
	public static void main(String[] args) {

		Stack s = new StackArray();

		System.out.println("Is the stack empty: " + s.isEmpty() + "\n");

		s.push(1);
		s.push("A");

		System.out.println("Stack size: " + s.size());

		System.out.println("Is the stack empty: " + s.isEmpty());

		System.out.println("The stack: "+ s + "\n");
		

		try {
			System.out.println("Peek: " + s.peek());
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.err.println("Stack is Empty");
			exc.printStackTrace();
		}
		
		System.out.print("The stack after peek: " + s +"\n");

		Iterator<Object> it = s.iterator();
		
		System.out.println("Trying the iterator");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.print("\n");
		
		try {
			System.out.println("Pop: " + s.pop());
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.err.println("Stack is Empty");
			exc.printStackTrace();
		}
		
		System.out.println("The stack after pop: " + s + "\n");

		try {
			System.out.println("Pop: " + s.pop());
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.err.println("Stack is Empty");
			exc.printStackTrace();
		}
		
		System.out.println("The stack after second pop: " + s + "\n");

		try {
			System.out.println("Pop: " + s.pop());
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.err.println("Stack is Empty");
			exc.printStackTrace();
		}
	}
}
