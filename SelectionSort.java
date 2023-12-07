public class SelectionSort {

    public void selection2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
        for (int n : arr) 
        {
            System.out.print(n + " ");
        }
    }

    public int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = { 3, 11, 6, 2, 10, 8, 1, 5, 8, 9, 33 };
        // s.selection(arr);
        s.selection2(arr);

    }
}
