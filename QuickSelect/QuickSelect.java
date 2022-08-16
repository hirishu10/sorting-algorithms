package QuickSelect;

public class QuickSelect {

    public static void main(String[] args) {
        int[] unsortedArray = {2,1,5,3,4}; // Some Example use Quick Select
        int kIndex = 3; // Find the k-th the smallest element
        int kthSmallestValue = quickSelect(unsortedArray,0,unsortedArray.length - 1,kIndex - 1);

        displayArray(unsortedArray);
        System.out.println("kthSmallestValue -> " + kthSmallestValue);
    }


    public static int quickSelect(int[]arr,int low,int high, int k) {
        int pvt = arr[high];
        int partIndex = partitionArray(arr,pvt,low,high);

        if(k > partIndex){
            return quickSelect(arr,partIndex + 1,high,k);
        }
        else if (k < partIndex) {
            return quickSelect(arr,low,partIndex - 1,k);
        }
        else {
            return pvt;
        }
    }

    public static int partitionArray(int[]arr,int pvt,int low,int high) {
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
