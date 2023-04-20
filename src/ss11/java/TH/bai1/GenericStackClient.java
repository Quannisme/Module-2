package ss11.java.TH.bai1;

public class GenericStackClient {
    public static void stackOfStrings()
    {
        MyGenericStack<String>stack=new MyGenericStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println("1.1 Size of stack after push operations:"+stack.size());
        System.out.println("1.2 Pop elements from stack :");
        while (!stack.isEmpty())
        {
            stack.pop();
        }
        System.out.println("1.3 Size of stack after pop operations:"+stack.size());
    }
    public static void stackOfIntegers()
    {
        MyGenericStack<Integer>stack=new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("1.1 Size of stack after push operations:"+stack.size());
        System.out.println("1.2 Pop elements from stack :");
        while (!stack.isEmpty())
        {
            stack.pop();
        }
        System.out.println("1.3 Size of stack after pop operations:"+stack.size());
    }

    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntegers();
    }
}
