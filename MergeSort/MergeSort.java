package MergeSort;

public class MergeSort {

    public static void main(String[] args) {

        int[] unsortedArray = { 2,5,12,18,20,7,9,11,15,25,28,30,35}; // Some Example use Merge Sort

        System.out.println("Before Merge Sort");
        displayArray(unsortedArray);// Before Merge Sort:
        System.out.println("--------------------");

        int[] sortedArray = mergerSort(unsortedArray,0,unsortedArray.length-1);

        System.out.println("--------------------");
        System.out.println("After Merge Sort");
        displayArray(sortedArray);// After Merge Sort:

    }

    /**
     *
     * @param arr Takes array and divide into two parts to use merge sort
     * @param low Starting point
     * @param high End point
     * @return The Sorted Array
     */
    public static int[] mergerSort(int[]arr,int low, int high){
        if(low == high){
            int[] baseArray = new int[1];
            baseArray[0] = arr[low];
            return baseArray;
        }

        int mid = (low + high) / 2; // Create Middle of the array
        int[] arrayOne = mergerSort(arr,low,mid); // First Part
        int[] arrayTwo = mergerSort(arr,mid + 1,high); // Second Part

        int[] result = new MergeSortedArray().mergeTwoSortedArray(arrayOne,arrayTwo); // Merge two sorted Array

        return result;

    }


    /**
     *
     * @param array Received Array and iterate to display inside the Terminal
     */
    public static void displayArray(int[] array){
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

}
