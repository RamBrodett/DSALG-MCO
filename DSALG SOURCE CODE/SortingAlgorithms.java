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
     * Syntax for insertionSort(array, size);
     */

    public long insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        long steps = 0;
        // usage of stage is index to iterate through the whole array.
        steps+=2; // initialization of stage and first check of condition
        for(int stage = 1; stage < n; stage++){

            Record key = arr[stage];
            int j = stage - 1;
            steps+=2; // key and j assignment

            steps++;
            while (j>=0 && arr[j].getIdNumber() > key.getIdNumber()){
                arr[j+1] = arr[j];
                j--;
                steps+=3; //
            }
            arr[j+1] = key;
            steps++;
            steps+=2;
        }
        return steps;
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
     * Syntax for selectionSort: selectionSort(array, size);
     */

    public long selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        long steps = 0;
        steps +=2;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            steps++;
            steps+=2;
            for(int j = i+1; j<n; j++) {
                if (arr[j].getIdNumber() < arr[minIndex].getIdNumber()) {
                    minIndex = j;
                    steps += 2;
                }
                steps++;
            }

            Record temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            steps+=4;
        }

        return steps;
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
     * Syntax for usage of mergeSort: mergeSort(array, starting index, size - 1);
     */
    public long mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.
        long steps =0;

        if(p<r){
            int mid = (p+r)/2;
            steps+=mergeSort(arr,p,mid);
            steps+=mergeSort(arr,mid+1 ,r);
            steps+=mergeHelper(arr,p,mid,r);
            steps+=2;
        }
        return steps;
    }

    /*
     * @param arr is an array of objects of Record.
     * @param nArr_Size is the size of array.
     *
     * @var run is the minimum run for the sorting division.
     * @var start,mid,end, i, and j are indices for the looping of the sort algorithm.
     *
     *
     * Timsort is a sorting algorithm that employs a divide and conquer approach,
     * similar to Merge Sort. However, it divides the input into smaller segments called
     * runs using insertion sort. The size of each run usually adheres to a specific criterion,
     * often a power of 2. Once these smaller runs are sorted individually, Timsort utilizes the
     * merge sort algorithm to merge and sort them into larger runs, ultimately creating the final sorted output.
     * Syntax for usage of timSort: timsort(array, size);
     */
    public long timSort(Record[] arr, int nArr_size) {
        long steps = 0;
        final int run = 32;
        steps++;

        steps+=2;
        for (int i = 0; i < nArr_size; i += run) {
            steps+= insertionSort(arr, Math.min(i + run - 1, nArr_size - 1) + 1);
            steps++;
        }
        steps+=2;
        for (int size = run; size < nArr_size; size = 2 * size) {
            steps+=2;
            for (int start = 0; start < nArr_size; start += 2 * size) {
                int mid = start + size-1;
                int end = Math.min(start + 2 * size - 1, nArr_size - 1);
                steps+=2;
                if(mid<end) {
                    steps+= mergeHelper(arr, start, mid, end);
                    steps++;
                }
                steps++;
            }
            steps++;
        }
        return  steps;
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
     * Syntax for mergeHelper: mergeHelper(array, starting index, mid index, end index);
     */
    private long mergeHelper(Record[] arr, int p, int m, int r){
        long steps=0;
        int subArr1_size = m-p+1;
        int subArr2_size = r-m;

        Record[] subArr1 = new Record[subArr1_size];
        Record[] subArr2 = new Record[subArr2_size];
        steps+=4;

        steps+=2;
        //copies each array to new temp arrays. format : arraycopy(obj src,int srcPos, obj dest, int destPos, int length)
        for(int i = 0; i < subArr1_size; i++) {
            subArr1[i] = arr[p + i];
            steps+=2;
        }
        steps+=2;
        for (int j = 0; j < subArr2_size; j++) {
            subArr2[j] = arr[m + 1 + j];
            steps+=2;
        }

        int i,j,k;
        i = 0;
        j = 0;
        k = p;
        steps+=3;

        steps++;
        while(i < subArr1_size && j < subArr2_size){
            steps++;
            if(subArr1[i].getIdNumber() <= subArr2[j].getIdNumber()){
                arr[k] = subArr1[i];
                i++;
                steps+=3;
            } else{
                arr[k] = subArr2[j];
                j++;
                steps+=2;
            }
            k++;
            steps++;
        }
        steps++;
        while (i < subArr1_size){
            arr[k] = subArr1[i];
            i++;
            k++;
            steps+=4;
        }
        steps++;
        while(j < subArr2_size){
            arr[k] = subArr2[j];
            j++;
            k++;
            steps+=4;
        }
        return steps;
    }
}