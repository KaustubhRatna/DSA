class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

public class circularll 
{
    public static Node insert_at_end(Node head,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            temp.next=temp;
            return temp;
        }
        Node curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=head;
        return head;
    }
    public static void display(Node head)
    {   
        if(head==null)
        {
            System.out.println("linked list empty");
            return;
        }
        System.out.print(head.data+" ");
        Node curr=head.next;
        while(curr!=head)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }
    public static void main(String[] args)
     {
        Node head=new Node(1);
        head.next=head;
        display(head);
        head=insert_at_end(head, 2);
        display(head);
        head=insert_at_end(head, 3);
        head=insert_at_end(head, 4);
        head=insert_at_end(head, 5);
        display(head);
    }
}
