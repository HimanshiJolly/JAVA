class Node{
    int data;
    Node next;
    Node (int data1,Node next1)
    {
        this.data=data1;
        this.next=next1;
    }
    Node(int data1)
    {
        this.data=data1;
    }
};
public class Linkedlist{
    public static void main(String args[])
    {
        int []arr={1,2,3,4};
        Node a=new Node(arr[3]);
        Node b=new Node(arr[2]);
        Node c=new Node(arr[1]);
        Node d=new Node(arr[0]);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
    }
}