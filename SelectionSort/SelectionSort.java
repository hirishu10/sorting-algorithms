package SelectionSort;

/**
 * The selection sort algorithm sorts an array
 * by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 * The algorithm maintains two subarrays in a given array.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] unsortedArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18}; // Some Example use Selection Sort

        System.out.println("Before Selection Sort"); // Optional
        displayArray(unsortedArray); // Displaying Before Selection Sort:
        System.out.println("--------------------"); // Optional


        // Selection Sort Implementing:
        for(int i = 0; i < unsortedArray.length - 1;i++){ //1 to n - 1
            int min = i;
            for (int j = i + 1; j < unsortedArray.length;j++){//
                if(isSmaller(unsortedArray,j,min)){ // providing current data and next data to check
                    min = j;
                }
            }
            if(min != i){
                swapNumber(unsortedArray,i,min);// same here providing current data and next data fore swap
            }
        }


        System.out.println("--------------------"); // Optional
        System.out.println("Before Selection Sort"); // Optional
        displayArray(unsortedArray); // Displaying After Selection Sort:

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
