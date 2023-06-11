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
     *
     * Insertion Sort is a sorting algorithm that compares the
     * currently held element with the elements in the array and
     * inserts it into the correct position by shifting any larger
     * elements to the right.
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
     * Selection Sort is a sorting algorithm that iteratively identifies
     * the smallest or largest element based on a specific criterion and
     * places it at the beginning of the unsorted portion. This process continues,
     * gradually forming a sorted list at the rear end while the unsorted area diminishes.
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
     * Merge Sort is a recursive sorting algorithm that employs
     * the Divide and Conquer principle. It divides the problem into smaller parts,
     * solves each sub-problem individually, and then combines them into a final sorted form.
     */
    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.

        if(p<r){
            int mid = (p+r)/2;
            mergeSort(arr,p,mid);
            mergeSort(arr,mid+1 ,r);
            mergeHelper(arr,p,mid,r);
        }
    }

    /*
     *
     *
     * Timsort is a sorting algorithm that employs a divide and conquer approach,
     * similar to Merge Sort. However, it divides the input into smaller segments called
     * runs using insertion sort. The size of each run usually adheres to a specific criterion,
     * often a power of 2. Once these smaller runs are sorted individually, Timsort utilizes the
     * merge sort algorithm to merge and sort them into larger runs, ultimately creating the final sorted output.
     */
    public void timSort(Record[] arr, int nArr_size) {
        final int run = 32;
        for (int i = 0; i < nArr_size; i += run)
            insertionSort(arr, Math.min(i + run - 1, nArr_size - 1)+1);
        for (int size = run; size < nArr_size; size = 2*size) {
            for (int start = 0; start < nArr_size; start += 2 * size) {
                int mid = start + size-1;
                int end = Math.min(start+2*size-1, nArr_size-1);
                if(mid<end)
                    mergeHelper(arr, start, mid, end);
            }
        }
    }

    /*
     * --------------------------Helper function---------------------------------
     */

    /*
     * @param arr is an array of objects of Record.
     * @param p is the starting index of first sub-array.
     * @param m is the ending index of first sub-array.
     * @param r is the ending index of second sub-array. *note: starting index of second sub-array is m+1*
     *
     * @var subArr(no.)_size are sizes of divided arrays.
     * @var i,j,k are indices for the process of sorting the array of Records.
     *
     * Merges sub-arrays and compares data in each sub-array.
     */
    private void mergeHelper(Record[] arr, int p, int m, int r){
        int subArr1_size = m-p+1;
        int subArr2_size = r-m;

        Record[] subArr1 = new Record[subArr1_size];
        Record[] subArr2 = new Record[subArr2_size];
        //copies each array to new temp arrays. format : arraycopy(obj src,int srcPos, obj dest, int destPos, int length)
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