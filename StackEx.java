class Stack{
    int stack[]=new int[10]; 
    int top=0;

    public boolean isEmpty()
    {
        return top<=0;
    }

    public void push(int data)
    {
        stack[top]=data;
        top++;
    }

    public void pop() 
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            int data;
            top--;
            data=stack[top];
            stack[top]=0;
            System.out.println("\npoped element is : "+data);
        }   
    }

    public void peek()
    {
        int data;
        data=stack[top-1];
        System.out.println("peeked element is : "+data);

    }

    public void size()
    {
        System.out.println("Size of stack is : "+top);
    }
    
    public void show() 
    {
        for(int n:stack)
        {
            System.out.print(n+" ");
        }
    }
}


//*************************************************************************************************************************


public class StackEx {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.size();
        System.out.println(s.isEmpty());
        s.push(0);
        s.push(11);
        s.push(22);
        s.size();
        s.push(33);
        s.push(44);
        s.push(55);
        s.show();

        s.pop();

        s.peek();

        s.size();

        System.out.println(s.isEmpty());
    }
}




