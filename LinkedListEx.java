
class LinkedList{
    Node head;
    Node tail;
    int size;


    private class Node{
        // int data;
        // Node next;
    
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data=data;
        }

        public Node(int data, Node next)
        {
        this.data=data;
        this.next=next;   
        }
    }

    public int returnHead()
    {
        return head.data;
    } 

    public int returnTail()
    {
        Node node=head;
        while(node.next!=null)
        {
            node=node.next;
        }
        return node.data;
    }

    public void length()
    {
        int length=0;
        Node current=head;
        while(current!=null)
        {
            length++;
            current=current.next;
        }
        System.out.println("Length of linked list : "+length);
    }

    public void insert(int data)
    {
        Node node=new Node(data);
        node.next=null;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
        size++;
    }

    public void insertLastUsingTail(int data)
    {
        if(tail==null)
        {
            insert(data);
            return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node; 
        size++;
    }
    
    public void insertAtStart(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
        size++;
    }

    
    
    public void insertAtIndex(int index, int data)
    {
        Node node=new Node(data);
        Node n=head;

        if(index==0)
        {
            insertAtStart(data);
        }

        else
        {
            for(int i=1;i<index;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }

        // else
        // {
        //     Node temp=head;
        //     for(int i=1;i<index;i++)
        //     {
        //         temp=temp.next;
        //     }
        //     Node node=new Node(data, temp.next);
        //     temp.next=node;
        // }
        size++;
    }

    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data);
    }

    public String toStringList()
    {
        String result="[";

        if(head==null)
        return result+"]";

        Node temp=head.next;
        result=result+head.data;

        while(temp.next!=null)
        {
            result=result+" "+temp.data;
            temp=temp.next;
        }
        result=result+" "+temp.data;
        return result+"]";
    }

    public int position(int data)
    {
        int index=0;
        Node curr=head;
        while(curr.next!=null)
        {
            if(curr.data==data)
            {
                System.out.println("Element found at index : "+index);
                return index;
            } 
            index++;
            curr=curr.next;
        }
        return Integer.MIN_VALUE;
    }

    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        System.out.println("data at index "+index+" : "+node.data);
        return node;
    }

    public int deleteFirst()
    {
        int data=head.data;
        head=head.next;
        
        if(head==null)
        {
            tail=null;
        }
        System.out.println("first element deleted "+data);
        size--;
        return data;

    }

    public int deleteLast()
    {
        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        int data =temp.data;
        tail=temp;
        temp.next=null;
        System.out.println("Deleted last element "+data);
        size--;
        return data;
    }
    
    public void deleteAtIndex(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n.next=n.next.next;
        }
        size--;
    }  

    public int deleteAtIndex2(int index)
    {
        if(index==0)
        return deleteFirst();

        if(index==size-1)
        return deleteLast();

        Node prev=get(index-1);
        int data=prev.next.data;

        prev.next=prev.next.next;

        return data;

    }

    public void removeNode(Node node)
    {
        if(head==null)
        return;

        if(node.equals(head))
        {
            head=head.next;
            return;
        }

        Node curr=head;
        while(curr.next!=null)
        {
            if(curr.equals(node))
            {
                curr.next=curr.next.next;
                return;
            }
        }
    }

    public Node findNode(int data)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.data==data)
            return node;
        
        node=node.next;
        }
        return null;
    }

    public void deleteList()
    {
        head=null;
        System.out.println("List is deleted");
    }
}



//*************************************************************************************************************************




public class LinkedListEx{
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(0);
        l.insert(11);
        l.insert(22);
        l.insert(33);
        l.show();
        l.insert(44);

        l.insertAtStart(55);
        l.show();

        l.insertAtIndex(2, 66);
        l.show();
        l.insertAtIndex(0, 77);
        l.show();

        l.deleteAtIndex(5);
        l.show();

        l.insertLastUsingTail(88);

        l.length();

        System.out.println(l.returnHead());
        System.out.println(l.returnTail());

        // l.removeNode();

        System.out.println(l.toStringList());

        l.position(33);

        l.get(1);

        l.deleteFirst();
        l.deleteLast();

        l.deleteAtIndex2(3);
        l.show();

        System.out.println(l.findNode(33));
    }
}
