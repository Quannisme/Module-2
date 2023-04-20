package ss11.java.TH.bai2;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head=null;
        this.tail=null;
    }
    void enqueue(int key)
    {
        Node n1=new Node(key);
        if(tail==null)
        {
            this.head=this.tail=n1;
            return;// khong thuc hien o duoi
        }
        this.tail.next=n1;
        this.head=n1;
    }
}
