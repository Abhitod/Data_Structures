import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

    public void countSortArray(int[] arr) {

        if (arr == null || arr.length <= 1)
            return;

        // find max element in array
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        // create new array of number max+1 size
        int[] carr = new int[max + 1];

        // create frequency array
        for (int num : arr) {
            carr[num]++;
        }
        // 1 1 1 3 1 0 1 1 1 1
        for (int i : carr) {
            System.out.print(i + " ");
        }

        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (carr[i] > 0) {
                arr[index] = i;
                index++;
                carr[i]--;
            }
        }
    }

    public void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> cmap = new HashMap<>();

        for (int num : arr) {
            cmap.put(num, cmap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = cmap.getOrDefault(i, 0);

            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 4, 2, 7, 3, 8, 3, 1, 0, 9 };
        CountSort c = new CountSort();
        // c.countSortArray(arr);
        c.countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}