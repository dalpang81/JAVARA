import java.util.*;
public class ch7_9 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i);
		while(true) {
			Integer  n = stack.pop();
			if(n == null) break;
			System.out.print(n+" ");
		}
	}
}
interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> k = null;
	public MyStack() {
		k = new Vector<T>();
	}
	public T pop() {
		if (k.size() == 0)
			return null;
		else 
			return k.remove(0);
	}
	public boolean push(T ob) {
		k.add(0, ob);
		return true;
	}
}
