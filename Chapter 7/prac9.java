import java.util.*;
import java.io.*;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	int tos;
	Vector<Object> stck;
	
	public MyStack() {
		tos = 0;
		stck = new Vector<Object>();
	}
	
	public T pop() {
		if(tos == 0) return null;
		tos--;
		return (T)stck.remove(stck.size() - 1);
	}
	
	public boolean push(T ob) {
		tos++;
		return stck.add(ob);
	}
	
}

public class Main {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i = 0; i < 10; i++) stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n == null) break;
			System.out.print(n + " ");
		}
	}

}
