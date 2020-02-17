package mn223dn_assign4.stack;

import java.util.ArrayList;
import java.util.Iterator;

public class StackArray implements Stack{

	private ArrayList<Object> arr;
	private Object obj = null; 
	
	public StackArray (){
		arr = new ArrayList <Object>();
	}
	
	public String toString () {
		return arr.toString();
	}
	
	public int size() {
		return arr.size();
	}

	public boolean isEmpty() {
		if (arr.size() == 0)
			return true;

		return false;
	}
	
	public void push(Object element){
		arr.add(element);
	}
	
	public Object pop() throws ArrayIndexOutOfBoundsException{
		obj= arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return obj;
	}
	public Object peek() throws ArrayIndexOutOfBoundsException{
		return arr.get(arr.size()-1);
	}
	
	public Iterator<Object> iterator(){
		ArrayList<Object> temp = new ArrayList<Object>();

		for (int i=arr.size()-1; i>=0; i--){
			temp.add(arr.get(i));
		}
		Iterator<Object> it = temp.iterator();
		return it;
	}
	
	
}
