
public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        SortingAlgorithms sortAlgorithms = new SortingAlgorithms();
        FileReader fileReader = new FileReader();

        // -------------------------------------------- Almost sorted data-------------------------------------
        String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\almostsorted.txt";
        Record[] rec1_almstsrt = fileReader.readFile(filePath);
        Record[] rec2_almstsrt = fileReader.readFile(filePath);
        Record[] rec3_almstsrt = fileReader.readFile(filePath);
        Record[] rec4_almstsrt = fileReader.readFile(filePath); //end of insertion sort trial sample
        Record[] rec1a_almstsrt = fileReader.readFile(filePath);
        Record[] rec2a_almstsrt = fileReader.readFile(filePath);
        Record[] rec3a_almstsrt = fileReader.readFile(filePath);
        Record[] rec4a_almstsrt = fileReader.readFile(filePath); //end of selection sort trial sample
        Record[] rec1b_almstsrt = fileReader.readFile(filePath);
        Record[] rec2b_almstsrt = fileReader.readFile(filePath);
        Record[] rec3b_almstsrt = fileReader.readFile(filePath);
        Record[] rec4b_almstsrt = fileReader.readFile(filePath); //end of merge sort trial sample
        Record[] rec1c_almstsrt = fileReader.readFile(filePath);
        Record[] rec2c_almstsrt = fileReader.readFile(filePath);
        Record[] rec3c_almstsrt = fileReader.readFile(filePath);
        Record[] rec4c_almstsrt = fileReader.readFile(filePath); //end of timsort trial sample

        int almstsrt_size = rec1_almstsrt.length; // size of Almost Sorted Record.
        // -------------------------------------------- random 100 data-----------------------------------------







        // Insertion Sort runtime trials -------------------------------------------------------------------------------
        long strtTime_insertion = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_almstsrt, almstsrt_size);
        long endTime_insertion = System.currentTimeMillis();
        long execTime_insertion = endTime_insertion - strtTime_insertion;

        long strtTime_insertion1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_almstsrt, almstsrt_size);
        long endTime_insertion1 = System.currentTimeMillis();
        long execTime_insertion1 = endTime_insertion1 - strtTime_insertion1;

        long strtTime_insertion2 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_almstsrt, almstsrt_size);
        long endTime_insertion2 = System.currentTimeMillis();
        long execTime_insertion2 = endTime_insertion2 - strtTime_insertion2;

        long strtTime_insertion3 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_almstsrt, almstsrt_size);
        long endTime_insertion3 = System.currentTimeMillis();
        long execTime_insertion3 = endTime_insertion3 - strtTime_insertion3;


        // Selection Sort runtime trials--------------------------------------------------------------------------------

        long strtTime_selection = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_almstsrt, almstsrt_size);
        long endTime_selection = System.currentTimeMillis();
        long execTime_selection = endTime_selection - strtTime_selection;

        long strtTime_selection1 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_almstsrt, almstsrt_size);
        long endTime_selection1 = System.currentTimeMillis();
        long execTime_selection1 = endTime_selection1 - strtTime_selection1;

        long strtTime_selection2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_almstsrt, almstsrt_size);
        long endTime_selection2 = System.currentTimeMillis();
        long execTime_selection2 = endTime_selection2 - strtTime_selection2;

        long strtTime_selection3 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_almstsrt, almstsrt_size);
        long endTime_selection3 = System.currentTimeMillis();
        long execTime_selection3 = endTime_selection3 - strtTime_selection3;

        // Merge Sort runtime trials------------------------------------------------------------------------------------

        long strtTime_merge = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3_almstsrt,0, rec3_almstsrt.length -1);
        long endTime_merge = System.currentTimeMillis();
        long execTime_merge = endTime_merge - strtTime_merge;

        long strtTime_merge1 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3_almstsrt,0, rec3_almstsrt.length -1);
        long endTime_merge1 = System.currentTimeMillis();
        long execTime_merge1 = endTime_merge1 - strtTime_merge1;

        long strtTime_merge2 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3_almstsrt,0, rec3_almstsrt.length -1);
        long endTime_merge2 = System.currentTimeMillis();
        long execTime_merge2 = endTime_merge2 - strtTime_merge2;

        long strtTime_merge3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3_almstsrt,0, rec3_almstsrt.length -1);
        long endTime_merge3 = System.currentTimeMillis();
        long execTime_merge3 = endTime_merge3 - strtTime_merge3;

        // TimSort runtime trials---------------------------------------------------------------------------------------

        long strtTime_tim = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4_almstsrt, rec4_almstsrt.length);
        long endTime_tim = System.currentTimeMillis();
        long execTime_tim = endTime_tim - strtTime_tim;

        long strtTime_tim1 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4_almstsrt, rec4_almstsrt.length);
        long endTime_tim1 = System.currentTimeMillis();
        long execTime_tim1 = endTime_tim1 - strtTime_tim1;

        long strtTime_tim2 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4_almstsrt, rec4_almstsrt.length);
        long endTime_tim2 = System.currentTimeMillis();
        long execTime_tim2 = endTime_tim2 - strtTime_tim2;

        long strtTime_tim3 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4_almstsrt, rec4_almstsrt.length);
        long endTime_tim3 = System.currentTimeMillis();
        long execTime_tim3 = endTime_tim3 - strtTime_tim3;






        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%21s | %15s | %11s | %s\n","Algorithm : Insertion","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 1",execTime_insertion, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 2",execTime_insertion1, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 3",execTime_insertion2, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 4",execTime_insertion3, almstsrt_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%21s | %15s | %11s | %s\n","Algorithm : Selection","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 1",execTime_selection, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 2",execTime_selection1, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 3",execTime_selection2, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 4",execTime_selection3, almstsrt_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%21s | %15s | %11s | %s\n","Algorithm : Merge","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 1",execTime_selection, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 2",execTime_selection1, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 3",execTime_selection2, almstsrt_size);
        System.out.printf("%-21s | %-15d | %-10d\n","Trial 4",execTime_selection3, almstsrt_size);










/*

        long strtTime_selection = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2_almstsrt, rec2_almstsrt.length);
        long endTime_selection = System.currentTimeMillis();
        long execTime_selection = endTime_selection -strtTime_selection;

        long strtTime_merge = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3_almstsrt,0, rec3_almstsrt.length -1);
        long endTime_merge = System.currentTimeMillis();
        long execTime_merge = endTime_merge - strtTime_merge;

        long strtTime_tim = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4_almstsrt, rec4_almstsrt.length);
        long endTime_tim = System.currentTimeMillis();
        long execTime_tim = endTime_tim - strtTime_tim;


        System.out.printf("%10s | %15s | %11s\n","Algorithm","Time Taken (ms)","File Length");
        System.out.printf("%10s | %-15d | %-10d\n","Insertion",execTime_insertion, rec1_almstsrt.length);
        System.out.printf("%10s | %-15d | %-10d\n","Selection",execTime_selection, rec1_almstsrt.length);
        System.out.printf("%10s | %-15d | %-10d\n","Merge",execTime_merge, rec1_almstsrt.length);
        System.out.printf("%10s | %-15d | %-10d\n","Tim",execTime_tim, rec1_almstsrt.length);


*/



        //------------------------------------------------------------------------------------------------------


    }

}
