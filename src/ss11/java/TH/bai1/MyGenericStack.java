package ss11.java.TH.bai1;

import java.util.LinkedList;
import java.util.Stack;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack() {
        stack=new LinkedList();
    }
    void push(T element)
    {
        stack.addFirst(element);
    }
    T pop()
    {
        return stack.pop();
    }
    int size()
    {
        return stack.size();
    }
    boolean isEmpty()
    {
        if(size()==0)
        {
            return true;
        }
        return false;
    }
}
