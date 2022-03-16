class Node
{
    Node next;
    int data;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class reverse_LL_ingroups
{   
    public static Node reverse_groups(Node head,int k)
    {
        if(head==null)
        return null;
        int c;
       Node prev=head;
       Node curr=head.next;
       int k=1;
       while(curr!=null)
       {
           c=k;
           while(curr!=null&&c!=0)
            {
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                c--;
            }
       }     
    } 
    public static void display(Node head)
    {
        while(head.next!=null)
        {
        System.out.print(head.data+"->");
        head=head.next;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args)
     {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(30);
        display(head);
        head=reverse_groups(head,3);
        display(head);
    }
}

