import java.util.ArrayList;

public class InversionCount2 {
    static class Item
    { // Class for storing the index and Value pairs
        int val;
        int index;
        public Item(int val, int index)
        { //constructor
            this.val = val;
            this.index = index;
        }
    }
    public static int[] count(int[] A)
    {
        Item[] items = new Item[A.length];
        for (int i = 0; i < A.length; i++) {
            items[i] = new Item(A[i], i);
        }

        int[] count = new int[A.length];
        mergeSort(items, 0, A.length - 1, count);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : count) {
            res.add(i);
        }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    // Function for Merge Sort
    public static void mergeSort (Item[]items,
                                  int low, int high,
                                  int[] count)
    {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(items, low, mid, count);
        mergeSort(items, mid + 1, high, count);
        merge(items, low, mid, mid + 1, high, count);
    }

    // Utility function that merge the array
    // and count smaller element on right side
    public static void merge (Item[]items,int low,
                              int lowEnd, int high,
                              int highEnd, int[] count)
    {
        int m = highEnd - low + 1;
        Item[] sorted = new Item[m];
        int rightCounter = 0;
        int lowPtr = low, highPtr = high;
        int index = 0;

        // Loop to store the count of smaller
        // Elements on right side when both
        // Array have some elements
        while (lowPtr <= lowEnd && highPtr <= highEnd) {
            if (items[lowPtr].val > items[highPtr].val) {
                rightCounter++;
                sorted[index++] = items[highPtr++];
            } else {
                count[items[lowPtr].index] += rightCounter;
                sorted[index++] = items[lowPtr++];
            }
        }

        // Loop to store the count of smaller
        // elements in right side when only
        // left array have some element
        while (lowPtr <= lowEnd) {
            count[items[lowPtr].index] += rightCounter;
            sorted[index++] = items[lowPtr++];
        }

        // Loop to store the count of smaller
        // elements in right side when only
        // right array have some element
        while (highPtr <= highEnd) {
            sorted[index++] = items[highPtr++];
        }
        System.arraycopy(sorted, 0, items, low, m);
    }
    // Utility function that prints
    // out an array on a line
    public static void main (String[] args)
    {
        int arr[] = {1,5,4,7,9,2};
        int[] result=count(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}