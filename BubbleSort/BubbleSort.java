package BubbleSort;

/**
 * Bubble Sort is the simplest sorting algorithm
 * that works by repeatedly swapping the adjacent elements
 * if they are in the wrong order.
 * This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] unsortedArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18}; // Some Example use Bubble Sort

        System.out.println("Before Bubble Sort");// Optional
        displayArray(unsortedArray);// Displaying Before Bubble Sort:
        System.out.println("--------------------");// Optional


        // Bubble Sort Implementing:
        for(int i = 1; i <= unsortedArray.length - 1; i++){ // 1 to n - 1
            for (int j = 0; j < unsortedArray.length - i; j++){ // 0 to n-1 because last number does not have to check n + 1 value
                if(isSmaller(unsortedArray,j+1,j)){ // providing current data and next data to check
                    swapNumber(unsortedArray,j+1,j); // same here providing current data and next data fore swap
                }
            }
        }


        System.out.println("--------------------");// Optional
        System.out.println("After Bubble Sort");// Optional
        displayArray(unsortedArray);// Displaying After Bubble Sort:


    }


    /**
     *
     * @param array Received Array for operation
     * @param currentIndex Current Data Index to check
     * @param nextIndex Next Data Index to meet the condition
     * @return Return True if Current is smaller else False
     */
    public static boolean isSmaller (int[] array,int currentIndex,int nextIndex){
        if(array[currentIndex] < array[nextIndex]){
            return true;
        }
        else{
            return false;
        }
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
