

public class DoublyLinkedListEx {
    public static void main(String[] args) {
        DoublyLinkedList dd=new DoublyLinkedList();
        
        dd.insertFirst(11);
        dd.insertFirst(22);
        dd.insertFirst(33);

        dd.display();
        // dd.dipslayReverse();

    }
}

//*************************************************************************************************************************





//*************************************************************************************************************************


class DoublyLinkedList{
    private Node head;
    private Node tail;
    private int size;

        private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
        }

        public Node(int data,Node prev, Node next)
        {
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

    
    
    public void insertFirst(int data)
    {
        Node node=new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;  
        size++;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+ "-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    // public void dipslayReverse() 
    // {
    //     Node last=tail;
    //     display();
    //     last=temp;
    //     while(last!=null)
    //     {
    //         System.out.print(last.data+"-> ");
    //         last=last.prev;
    //     }
    //     System.out.println();
    // }
}



    // public void insert(int data)
    // {

        // Node node=new Node(data);
        // if(head==null)
        // {
        //     head=node;
        // }
        // else 
        // {
        //     Node curr=tail;
        //     curr.next=node;
        //     curr.next=null;
        // }

    //     Node n=new Node(data);
    //     n.next=null;
    //     if(head==null)
    //     {
    //         head=n;
    //     }
    //     else
    //     {
    //         Node curr=head;
    //         while(curr.next!=null)
    //         {
    //             curr=curr.next;
    //         }
    //         curr.next=n;
    //     }
    // }

    // public void insertAtStart(int data)
    // {
    //     Node node=new Node(data);
    //     node.next=head;
    //     head=node;
    // }

    // public void insertAtPosition(int data,int index)
    // { Node node=new Node(data);
    //     if(index==0)
    //     {
    //         head=node;
    //     }

    //     if(index>length)
    //     {
    //         tail=node;
    //     }
    //     else 
    //     {
    //         Node temp=head;
    //         for(int i=0;i<index;i++)
    //         {
    //             temp=temp.next;
    //         }
    //         node.next=temp.next; 
    //         node.prev=temp;
    //         temp.next=node;
    //     }


    // }


    // public void show()
    // {
    //     Node current=head;
    //     while(current.next!=null)
    //     {
    //         System.out.println(current.data);
    //         current=current.getNext();
    //     }
    //     System.out.println(current.data +" End of list \n");
    // }

    // public int getPosition() 

    // {
    //     return Integer.MIN_VALUE;
    // }

    // public void lengthOfList()
    // {
    //     int length=0;
    //     Node current=head;
    //     while(current!=null)
    //     {
    //         length++;
    //         current=current.Next;
    //     }
    //     System.out.println("Length of linked list : "+length);
    // }
