
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
        String filePath2 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100.txt";
        Record[] rec1_rand100 = fileReader.readFile(filePath2);
        Record[] rec2_rand100 = fileReader.readFile(filePath2);
        Record[] rec3_rand100 = fileReader.readFile(filePath2);
        Record[] rec4_rand100 = fileReader.readFile(filePath2); //end of insertion sort trial sample
        Record[] rec1a_rand100 = fileReader.readFile(filePath2);
        Record[] rec2a_rand100 = fileReader.readFile(filePath2);
        Record[] rec3a_rand100 = fileReader.readFile(filePath2);
        Record[] rec4a_rand100 = fileReader.readFile(filePath2); //end of selection sort trial sample
        Record[] rec1b_rand100 = fileReader.readFile(filePath2);
        Record[] rec2b_rand100 = fileReader.readFile(filePath2);
        Record[] rec3b_rand100 = fileReader.readFile(filePath2);
        Record[] rec4b_rand100 = fileReader.readFile(filePath2); //end of merge sort trial sample
        Record[] rec1c_rand100 = fileReader.readFile(filePath2);
        Record[] rec2c_rand100 = fileReader.readFile(filePath2);
        Record[] rec3c_rand100 = fileReader.readFile(filePath2);
        Record[] rec4c_rand100 = fileReader.readFile(filePath2); //end of timsort trial sample

        int rand100_size = rec1_rand100.length; // size of Rand100 Sorted Record.
        // ------------------------------------ random 25 000 data----------------------------------------------
        String filePath3 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random25000.txt";


        // ------------------------------------ random 50 000 data----------------------------------------------
        String filePath4 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random50000.txt";


        // ------------------------------------ random 75 000 data----------------------------------------------
        String filePath5 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random75000.txt";


        // ------------------------------------ random 100 000 data----------------------------------------------
        String filePath6 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100000.txt";


        // ---------------------------------- totally reversed data----------------------------------------------
        String filePath7 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\totallyreversed.txt";



        /*
         * note:
         *  naming with a,b,c,d on the end are to make distiction between for what sorting.
         *  a is for insertion
         *  b is for selection
         *  c is for merge
         *  d is for tim
         */

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
                // insertion(a) -- for random100.txt
        long strtTime_insertiona = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand100, rand100_size);
        long endTime_insertiona = System.currentTimeMillis();
        long execTime_insertiona = endTime_insertiona - strtTime_insertiona;

        long strtTime_insertion1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand100, rand100_size);
        long endTime_insertion1a = System.currentTimeMillis();
        long execTime_insertion1a = endTime_insertion1a - strtTime_insertion1a;

        long strtTime_insertion2a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand100, rand100_size);
        long endTime_insertion2a = System.currentTimeMillis();
        long execTime_insertion2a = endTime_insertion2a - strtTime_insertion2a;

        long strtTime_insertion3a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand100, rand100_size);
        long endTime_insertion3a = System.currentTimeMillis();
        long execTime_insertion3a = endTime_insertion3a - strtTime_insertion3a;


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
            // selection(b) -- for random100.txt
        long strtTime_selectionb = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand100, rand100_size);
        long endTime_selectionb = System.currentTimeMillis();
        long execTime_selectionb = endTime_selectionb - strtTime_selectionb;

        long strtTime_selection1b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand100, rand100_size);
        long endTime_selection1b = System.currentTimeMillis();
        long execTime_selection1b = endTime_selection1b - strtTime_selection1b;

        long strtTime_selection2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand100, rand100_size);
        long endTime_selection2b = System.currentTimeMillis();
        long execTime_selection2b = endTime_selection2b - strtTime_selection2b;

        long strtTime_selection3b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand100, rand100_size);
        long endTime_selection3b = System.currentTimeMillis();
        long execTime_selection3b = endTime_selection3b - strtTime_selection3b;

        // Merge Sort runtime trials------------------------------------------------------------------------------------

        long strtTime_merge = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_almstsrt,0, almstsrt_size - 1);
        long endTime_merge = System.currentTimeMillis();
        long execTime_merge = endTime_merge - strtTime_merge;

        long strtTime_merge1 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_almstsrt,0, almstsrt_size - 1);
        long endTime_merge1 = System.currentTimeMillis();
        long execTime_merge1 = endTime_merge1 - strtTime_merge1;

        long strtTime_merge2 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_almstsrt,0, almstsrt_size - 1);
        long endTime_merge2 = System.currentTimeMillis();
        long execTime_merge2 = endTime_merge2 - strtTime_merge2;

        long strtTime_merge3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_almstsrt,0, almstsrt_size - 1);
        long endTime_merge3 = System.currentTimeMillis();
        long execTime_merge3 = endTime_merge3 - strtTime_merge3;

        long strtTime_mergec = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand100,0, rand100_size - 1);
        long endTime_mergec = System.currentTimeMillis();
        long execTime_mergec = endTime_mergec - strtTime_mergec;

        long strtTime_merge1c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand100,0, rand100_size - 1);
        long endTime_merge1c = System.currentTimeMillis();
        long execTime_merge1c = endTime_merge1c - strtTime_merge1c;

        long strtTime_merge2c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand100,0, rand100_size - 1);
        long endTime_merge2c = System.currentTimeMillis();
        long execTime_merge2c = endTime_merge2c - strtTime_merge2c;

        long strtTime_merge3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand100,0, rand100_size - 1);
        long endTime_merge3c = System.currentTimeMillis();
        long execTime_merge3c = endTime_merge3c - strtTime_merge3c;

        // TimSort runtime trials---------------------------------------------------------------------------------------

        long strtTime_tim = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_almstsrt,almstsrt_size);
        long endTime_tim = System.currentTimeMillis();
        long execTime_tim = endTime_tim - strtTime_tim;

        long strtTime_tim1 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_almstsrt, almstsrt_size);
        long endTime_tim1 = System.currentTimeMillis();
        long execTime_tim1 = endTime_tim1 - strtTime_tim1;

        long strtTime_tim2 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_almstsrt, almstsrt_size);
        long endTime_tim2 = System.currentTimeMillis();
        long execTime_tim2 = endTime_tim2 - strtTime_tim2;

        long strtTime_tim3 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_almstsrt, almstsrt_size);
        long endTime_tim3 = System.currentTimeMillis();
        long execTime_tim3 = endTime_tim3 - strtTime_tim3;

        long strtTime_timd = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand100,rand100_size);
        long endTime_timd = System.currentTimeMillis();
        long execTime_timd = endTime_timd - strtTime_timd;

        long strtTime_tim1d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand100, rand100_size);
        long endTime_tim1d = System.currentTimeMillis();
        long execTime_tim1d = endTime_tim1d - strtTime_tim1d;

        long strtTime_tim2d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand100, rand100_size);
        long endTime_tim2d = System.currentTimeMillis();
        long execTime_tim2d = endTime_tim2d - strtTime_tim2d;

        long strtTime_tim3d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand100, rand100_size);
        long endTime_tim3d = System.currentTimeMillis();
        long execTime_tim3d = endTime_tim3d - strtTime_tim3d;




        // ------------------------------------- Almost sorted data results--------------------------------------------
        System.out.println("\n|ALMOST SORTED DATA RESULTS|");
        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3, almstsrt_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3, almstsrt_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3, almstsrt_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2, almstsrt_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3, almstsrt_size);

        // ----------------------------------random 100 data results---------------------------------------------

        System.out.println("\n|RANDOM 100 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertiona, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1a, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2a, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3a, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selectionb, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1b, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2b, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3b, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_mergec, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1c, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2c, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3c, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_timd, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1d, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3d, rand100_size);



        //------------------------------------------------------------------------------------------------------


    }

}
