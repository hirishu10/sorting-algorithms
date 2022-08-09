package MergeSort;

/**
 * Merged Two Sorted Array and returns in Single Array
 */
public class MergeSortedArray {

    /**
     *
     * @param sortedArrayOne Take the First Sorted Array
     * @param sortedArrayTwo Take the Second Sorted Array
     * @return The merged array of both
     */
    public int[] mergeTwoSortedArray(int[]sortedArrayOne,int[]sortedArrayTwo){

        int[] sumOfBothArray = new int[sortedArrayOne.length + sortedArrayTwo.length]; // Make array to store the both sorted data

        int i = 0; // Pointer for LeftSide
        int j = 0; // Pointer for RightSide
        int k = 0; // Pointer for above array to store the data and track the size

        //:: This Loops work if both condition have size equals and ended if one array size is different
        while(i < sortedArrayOne.length && j < sortedArrayTwo.length){
            if(sortedArrayOne[i] < sortedArrayTwo[j]){
                sumOfBothArray[k] = sortedArrayOne[i];
                i++;
            }
            else{
                sumOfBothArray[k] = sortedArrayTwo[j];
                j++;
            }
            k++;
        }

        //:: If i size is left to loop then this runs
        while ( i < sortedArrayOne.length){
            sumOfBothArray[k] = sortedArrayOne[i];
            i++;
            k++;
        }

        //:: If j size is left to loop then this runs
        while ( j < sortedArrayTwo.length){
            sumOfBothArray[k] = sortedArrayTwo[j];
            j++;
            k++;
        }

        //:: Final return the merged array
        return sumOfBothArray;
    }


    /**
     *
     * @param array Received Array and iterate to display inside the Terminal
     */
    public  void displayArray(int[] array){
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
