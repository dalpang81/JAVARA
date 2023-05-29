import java.util.*;

interface IStack<T>{
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
    Vector<T> v;

    public MyStack(){
        v = new Vector<T>();
    }
    public T pop(){
        if(v.size() == 0) return null;
        else return v.remove(0);
    }
    public boolean push(T ob){
        v.add(0, ob);
        return true;
    }
}

public class Ch7_9{
    public static void main(String[] args){
        IStack<Integer> stack = new MyStack<Integer>();
        for(int i = 0; i < 10; i++) stack.push(i);
        while(true){
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n + " ");
        }
    }
}