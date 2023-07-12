interface IStack<T>{
	T pop();
	boolean push(T ob);
}
class MyStack<T> implements IStack{
	int tos;
	Object [] stack;
	MyStack(){
		stack = new Object[10];
        tos = 0;
	}
	@Override
	public Object pop() {
		if(tos==0) {
			return null;
		}
		tos--;
		return (T)stack[tos];
	}

	@Override
	public boolean push(Object ob) {
		stack[tos]=ob;
		tos++;
		return true;
	}
	
}
public class StackManager {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0;i<10;i++) stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}
	}

}
