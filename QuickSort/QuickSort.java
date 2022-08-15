package QuickSort;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 * It picks an element as a pivot and partitions the given array around the picked pivot.
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] unsortedArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18}; // Some Example use Quick Sort

        quickSort(unsortedArray,0,unsortedArray.length - 1);

        displayArray(unsortedArray);
    }


    public static void quickSort(int[]arr,int low,int high)
    {

        if(low >= high){
            return;
        }

        int pvt = arr[high];
        int partionedIndex = partitionArray(arr,pvt,low,high);

        quickSort(arr,low,partionedIndex - 1);
        quickSort(arr,partionedIndex + 1,high);
    }

    public static int partitionArray(int[]arr,int pvt,int low,int high)
    {
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pvt) {
                swapNumber(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        return (j - 1);
    }


    /**
     *
     * @param array Received Array for operation
     * @param currentData Current Data Index to swap
     * @param nextData Next Data Index to Swap with
     */
    public static  void swapNumber (int[] array,int currentData, int nextData){
        int temp =  array[currentData];
        array[currentData] = array[nextData];
        array[nextData] = temp;
        System.out.println("Swapping the data from " + array[currentData] + " -> " + array[nextData]);// Optional Message
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
