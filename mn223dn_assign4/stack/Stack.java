package mn223dn_assign4.stack;

import java.util.Iterator;

public interface Stack {

	public int size();

	public boolean isEmpty();

	public void push(Object element);

	public Object pop();

	public Object peek();
	
	public Iterator<Object> iterator();
}