package PartitionArray;

public class PartitionArray {

    public static void main(String[] args) {

        int[] mainArray = {2,3,4,1,6,5};

        int[] partionedArray = partitionArray(mainArray,5);

        displayArray(partionedArray);

    }


    public static int[] partitionArray(int[]arr,int pvt)
    {
        int i = 0;
        int j = 0;

        while (i < arr.length){
            if(arr[i] > pvt){
                i++;
            }
            else {
                swapNumber(arr,i,j);
                i++;
                j++;
            }
        }
        return arr;
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
