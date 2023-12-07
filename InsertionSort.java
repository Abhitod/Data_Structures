public class InsertionSort {

    public void insertion(int[] arr) 
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        
        for (int n : arr) 
        {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) 
    {
        InsertionSort i = new InsertionSort();
        int[] arr = { 3, 11, 6, 2, 10, 8, 1, 5, 8, 9, 33 };
        i.insertion(arr);

    }
}

/*
    Adaptive
    Number of swaps reduced 
    stable 
    o(n-1) when array is already sorted
*/
