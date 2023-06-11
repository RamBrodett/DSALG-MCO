/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

public class SortingAlgorithms {

    /*
     * @param arr is an array of objects of Record.
     * @param n is the size of the array.
     *
     * @var stage and j are indices of array Record.
     * @var key is the holder of the current object of Record.
     */

    public void insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

        for(int stage = 1; stage < n; stage++){
            Record key = arr[stage];
            int j = stage - 1;

            while (j>=0 && arr[j].getIdNumber() > key.getIdNumber()){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    /*
     * @param arr is an array of objects of Record.
     * @param n is the size of the array.
     *
     * @var i and j are indices of array Record.
     * @var temp is a temporary holder of an object of Record.
     *
     * SelectionSort is a sorting algorithm which repeatedly selects
     * the lowest/largest element base on criteria and places it on the
     * first element of the unsorted part(forming a successive sorted list behind the unsorted area).
     */

    public void selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

        for(int i = 0; i < n-1; i++){
            int minIndex = i;

            for(int j = i+1; j<n; j++)
                if(arr[j].getIdNumber() < arr[i].getIdNumber())
                    minIndex = j;

            Record temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /*
     * @param arr is an array of objects of Record.
     * @param p is the starting index integer.
     * @param r is the ending index integer.
     *
     * @var mid is mid-value index integer.
     *
     * MergeSort is a recursive sorting algorithm that sorts problem through a
     * principle called Divide and Conquer Algorithm where it divides
     * the problem into smaller parts and solve each sub-problems individually
     * then form it to one final form on the end.
     *
     */
    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.

        if(p<r){
            int mid = (p+r)/2;
            mergeSort(arr,p,mid);
            mergeSort(arr,mid+1 ,r);
            merge(arr,p,mid,r);
        }
    }

    /*
     *
     *
     *
     */
    public void timSort(){

    }


    /*
     * --------------------------Helper function---------------------------------
     */

    /*
     * Merges sub-arrays and compares data in each sub-array.
     *
     * @param arr is an array of objects of Record.
     * @param p is the starting index of first sub-array.
     * @param m is the ending index of first sub-array.
     * @param r is the ending index of second sub-array. *note: starting index of second sub-array is m+1*
     *
     * @var subArr(no.)_size are sizes of divided arrays.
     * @var i,j,k are indices for the process of sorting the array of Records.
     *
     *
     */
    private void merge(Record[] arr, int p, int m, int r){
        int subArr1_size = m-p+1;
        int subArr2_size = r-m;

        Record[] subArr1 = new Record[subArr1_size];
        Record[] subArr2 = new Record[subArr2_size];

        for(int i = 0; i < subArr1_size; i++)
            subArr1[i] = arr[p+i];
        for (int j = 0; j < subArr2_size; j++)
            subArr2[j] = arr[m+1+j];

        int i,j,k;
        i = 0;
        j = 0;
        k = p;

        while(i < subArr1_size && j < subArr2_size){
            if(subArr1[i].getIdNumber() <= subArr2[j].getIdNumber()){
                arr[k] = subArr1[i];
                i++;
            } else{
                arr[k] = subArr2[j];
                j++;
            }
            k++;
        }

        while (i < subArr1_size){
            arr[k] = subArr1[i];
            i++;
            k++;
        }

        while(j < subArr2_size){
            arr[k] = subArr2[j];
            j++;
            k++;
        }

    }
}