package MergeSort;

/**
 * Example for MergeSortedArray
 */
public class example {

    public static void main(String[] args) {
        int[] sortedArrayOne = { 2,5,12,18,20};
        int[] sortedArrayTwo = { 7,9,11,15,25,28,30,35};

        MergeSortedArray mergedArray = new MergeSortedArray(); // Initialise the MergedSortedArray to use method
        int[] s = mergedArray.mergeTwoSortedArray(sortedArrayOne,sortedArrayTwo); // Return the merged array
        mergedArray.displayArray(s); // Finally displaying the final merged array
    }
}
