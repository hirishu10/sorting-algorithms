package InsertionSort;

public class InsertionSort {


    public static void main(String[] args) {

        int[] unsortedArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18}; // Some Example use Insertion Sort

        System.out.println("Before Insertion Sort");// Optional
        displayArray(unsortedArray);// Displaying Before Insertion Sort:
        System.out.println("--------------------");// Optional

        // Insertion Sort Implementing:
        for(int i = 0; i < unsortedArray.length - 1;i++){
            for(int j = i + 1; j > 0;j--){
                if(isSmaller(unsortedArray,j,j - 1)){ // providing current data and next data to check
                    swapNumber(unsortedArray,j,j - 1); // same here providing current data and next data fore swap
                }
                else {
                    break;
                }
            }
        }

        System.out.println("--------------------");// Optional
        System.out.println("After Insertion Sort");// Optional
        displayArray(unsortedArray);// Displaying After Insertion Sort:

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
