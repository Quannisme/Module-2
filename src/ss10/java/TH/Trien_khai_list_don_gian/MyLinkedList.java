package ss10.java.TH.Trien_khai_list_don_gian;
import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class MyLinkedList<E> {
        private Node head;
        private int numNodes;
        int size=0;
    public MyLinkedList() {
    }
    Node<E> first;
    Node<E>last;
    private class Node<E>{
            E elements;
            Node<E> next;
            Node<E> pre;


            public Node(Node<E> prev, E element,Node<E> next) {
                this.elements = elements;
                this.next = next;
                this.pre = prev;
        }
    }
    void linkFirst(E e)
    {
        Node<E> f=first;
        Node<E> newNode=new Node<>(null,e,f);
        first=newNode;
        if(f==null)
        {
            last=newNode;

        }else
        {
            f.pre=newNode;
        }
        size++;
        numNodes++;

    }
    void linkLast(E e)
    {
        Node<E> l=last;
        Node<E> newNode=new Node<>(l, e, null);
        last=newNode;
        if(l==null)
        {
            first=newNode;
        }else
        {
            l.next=newNode;
        }
        size++;
        numNodes++;
    }
    void linkBefore(E e,Node<E> succ)
    {
        Node<E> pred=succ.pre;
        Node<E> newNode=new Node<>(pred,e,succ);
        succ.pre=newNode;
        if(pred==null)
        {
            first=newNode;

        }else
        {
            pred.next=newNode;
        }
        size++;
        numNodes++;
    }
    Node<E> node(int index) {
        if (index < (size >> 1)) {
           Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.pre;
            return x;
        }
    }
    void add(int index, E element)
    {
        if(index==size)
        {
            linkLast(element);
        }else
        {
            linkBefore(element,node(index));
        }
    }
    boolean add(E e)
    {
        linkLast(e);
        return true;
    }

    void addFirst(E e)
    {
        linkFirst(e);
    }
    void addLast(E e)
    {
        linkLast(e);
    }
//    E remove(int index)
//    {
//        if()
//    }
    int size()
    {
        return size;
    }


}
