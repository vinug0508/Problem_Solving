class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        int n = arr.length;
        insertion_sort(arr, 1, n); // Start from index 1
    }

    public static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j - 1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recursive call for next index
        insertion_sort(arr, i + 1, n);
    }
}
