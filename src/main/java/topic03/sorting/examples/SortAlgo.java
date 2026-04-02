/**
 * SortAlgo class implements different sorting algorithms to sort an array of integer items
 * We assume that the sorting order is ascending
 *
 * @author (nxthang)
 * @version (1.0)
 */
package topic03.sorting.examples;

public class SortAlgo {
    /**
     * Constructor for objects of class SortAlgo
     */
    public SortAlgo() {
    }

    // Selection sort algorithm
    public void selectionSort(int[] a) {
        int n = a.length;
        // After each passs, the boundary of unsorted subarray is moved one step to the right
        for (int step = 0; step < n-1; step++) {
            // Find the minimum element in unsorted array
            int minIndex = step;
            for (int i = step+1; i < n; i++)
                if (a[i] < a[minIndex])
                    minIndex = i;
            // Swap to put the found minimum element at correct position
            int tmp = a[step];
            a[step] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    // Insertion sort algorithm
    public void insertionSort(int[] a) {
        int n = a.length;
        // At the begining the sorted subarray contains the first item
        // The unsorted range is from the second item to the end of the array
        // After each pass, the boundary of the sorted subarray is increased by one
        for (int i = 1; i < n; ++i) {
            // key is the first item of unsorted subarray
            int key = a[i];
            int j = i - 1;
            // Shifted the items one slot to the right until we find a correct position for key
            while (j >=0 && a[j]>key ) {
                a[j+1] = a[j];
                j --;
            }
            // Put key at its correct position
            a[j+1] = key;
        }
    }

    // Bubble sort algorithm
    public void bubbleSort(int[] a) {
        int n = a.length;
        // Loop to access each array item
        for (int i = 0; i < n-1; ++i)
            // Loop to compare adjacent items
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j+1]) {    // Here we find out an out of order pair
                    // Swap a[j] and a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
    }

    // Improved Bubble sort algorithm
    public void bubbleSortImproved(int[] a) {
        int n = a.length;
        // Loop to access each array item
        for (int i = 0; i < (n-1); ++i) {
            // Assume that we couldn't find out any out of order pair
            boolean isSorted = true;
            // Loop to compare adjacent items
            for (int j = 0; j < (n - i - 1); j++)
                if (a[j] > a[j+1]) {    // Here we find out an out of order pair
                    // Swap a[j] and a[j+1]
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    isSorted = false;
                }
            // Stop if there is no out of order pair
            if (isSorted)
                break;
        }
    }

    // Merge sort algorithm
    public void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    // Merge two subarrays of a[].
    // First subarray is a[start..mid]
    // Second subarray is arr[mid+1..end]
    private void merge(int[] a, int start, int mid, int end) {
        // Define a temporary array to store the result
        int[] c = new int[end - start+1];
        // Define two indices index1 and index2
        int index1 = start;
        int index2 = mid+1;
        // Define the current length of the result array
        int len = 0;
        // First we compare current elements of two subarrays
        // and copy smaller item into the result array
        while ((index1 <= mid)&&(index2 <= end)) {
            if (a[index1] < a[index2]) {
                c[len]=a[index1];
                index1++;
            }
            else {
                c[len]=a[index2];
                index2++;
            }
            len++;
        }

        // Then we copy all remaining items of non-empty subarray to the result array
        for (int i = index1; i <= mid; i++) {
            c[len]=a[i];
            len++;
        }

        for (int i = index2; i <= end; i++) {
            c[len]=a[i];
            len++;
        }

        // We copy items from the temporary result array back to array a
        for (int i = 0; i < len; i++) {
            a[start + i] = c[i];
        }
    }
}