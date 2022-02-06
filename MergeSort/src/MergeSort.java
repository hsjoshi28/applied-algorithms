public class MergeSort {
    static void Merge(int Arr[], int start, int mid, int end) {
        assert (Arr.length > 0);
        int leftLength = (mid - start) + 1;
        int rightLength = end - 1 - mid;

        int[] leftArray = new int[leftLength + 1];
        int[] rightArray = new int[rightLength + 1];

        for (int i = 0; i < leftLength; ++i)
            leftArray[i] = Arr[start + i];
        for (int j = 0; j < rightLength; ++j)
            rightArray[j] = Arr[mid + 1 + j];

        leftArray[leftLength] = rightArray[rightLength] = Integer.MAX_VALUE;

        assert leftArray.length > 0 && rightArray.length > 0;
        int i = 0, j = 0, k = start;
        while (k < end) {
            if (leftArray[i] <= rightArray[j]) {
                Arr[k] = leftArray[i];
                i++;
            } else {
                Arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
    }

    static void sort(int Arr[], int start, int end) {
        if (start < end - 1) {
            int mid = start + (end - 1 - start) / 2;
            sort(Arr, start, mid + 1);
            sort(Arr, mid + 1, end);

            Merge(Arr, start, mid, end);
        }
    }
}
