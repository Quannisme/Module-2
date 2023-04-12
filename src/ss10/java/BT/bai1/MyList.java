package ss10.java.BT.bai1;

import java.util.ArrayList;

public class MyList<E>{
    private ArrayList<E>mylist=new ArrayList<>();
    int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    MyList(){}

    public MyList(ArrayList<E> mylist, int size, Object[] elements) {
        this.mylist = mylist;
        this.size = size;
        this.elements = elements;
    }

    public ArrayList<E> getMylist() {
        return mylist;
    }

    public void setMylist(ArrayList<E> mylist) {
        this.mylist = mylist;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    void add(int Index , E element)
    {
        mylist.add(Index,element);
    }
    E removeMylist(int Index)
    {
        return mylist.remove(Index);
    }
    int size()
    {
        return mylist.size();
    }
    E cloneMylist()
    {
        return (E) mylist.clone();
    }
    boolean add(E e)
    {
        return mylist.add(e);
    }
    boolean containsMylist(E e)
    {
        return mylist.contains(e);
    }
    int indexOfMylist(int Index)
    {
        return mylist.indexOf(Index);
    }
    void ensureCapa()
    {
        int newSize=elements.length*2;
        return;
    }
}
