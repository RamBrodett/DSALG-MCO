
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
        Record[] rec1_rand25000 = fileReader.readFile(filePath3);
        Record[] rec2_rand25000 = fileReader.readFile(filePath3);
        Record[] rec3_rand25000 = fileReader.readFile(filePath3);
        Record[] rec4_rand25000 = fileReader.readFile(filePath3); //end of insertion sort trial sample
        Record[] rec1a_rand25000 = fileReader.readFile(filePath3);
        Record[] rec2a_rand25000 = fileReader.readFile(filePath3);
        Record[] rec3a_rand25000 = fileReader.readFile(filePath3);
        Record[] rec4a_rand25000 = fileReader.readFile(filePath3); //end of selection sort trial sample
        Record[] rec1b_rand25000 = fileReader.readFile(filePath3);
        Record[] rec2b_rand25000 = fileReader.readFile(filePath3);
        Record[] rec3b_rand25000 = fileReader.readFile(filePath3);
        Record[] rec4b_rand25000 = fileReader.readFile(filePath3); //end of merge sort trial sample
        Record[] rec1c_rand25000 = fileReader.readFile(filePath3);
        Record[] rec2c_rand25000 = fileReader.readFile(filePath3);
        Record[] rec3c_rand25000 = fileReader.readFile(filePath3);
        Record[] rec4c_rand25000 = fileReader.readFile(filePath3); //end of timsort trial sample

        int rand25000_size = rec1_rand25000.length; // size of Rand2500 Sorted Record.
        // ------------------------------------ random 50 000 data----------------------------------------------
        String filePath4 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random50000.txt";
        Record[] rec1_rand50000 = fileReader.readFile(filePath4);
        Record[] rec2_rand50000 = fileReader.readFile(filePath4);
        Record[] rec3_rand50000 = fileReader.readFile(filePath4);
        Record[] rec4_rand50000 = fileReader.readFile(filePath4); //end of insertion sort trial sample
        Record[] rec1a_rand50000 = fileReader.readFile(filePath4);
        Record[] rec2a_rand50000 = fileReader.readFile(filePath4);
        Record[] rec3a_rand50000 = fileReader.readFile(filePath4);
        Record[] rec4a_rand50000 = fileReader.readFile(filePath4); //end of selection sort trial sample
        Record[] rec1b_rand50000 = fileReader.readFile(filePath4);
        Record[] rec2b_rand50000 = fileReader.readFile(filePath4);
        Record[] rec3b_rand50000 = fileReader.readFile(filePath4);
        Record[] rec4b_rand50000 = fileReader.readFile(filePath4); //end of merge sort trial sample
        Record[] rec1c_rand50000 = fileReader.readFile(filePath4);
        Record[] rec2c_rand50000 = fileReader.readFile(filePath4);
        Record[] rec3c_rand50000 = fileReader.readFile(filePath4);
        Record[] rec4c_rand50000 = fileReader.readFile(filePath4); //end of timsort trial sample

        int rand50000_size = rec1_rand50000.length; // size of Rand50000 Sorted Record.
        // ------------------------------------ random 75 000 data----------------------------------------------
        String filePath5 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random75000.txt";
        Record[] rec1_rand75000 = fileReader.readFile(filePath5);
        Record[] rec2_rand75000 = fileReader.readFile(filePath5);
        Record[] rec3_rand75000 = fileReader.readFile(filePath5);
        Record[] rec4_rand75000 = fileReader.readFile(filePath5); //end of insertion sort trial sample
        Record[] rec1a_rand75000 = fileReader.readFile(filePath5);
        Record[] rec2a_rand75000 = fileReader.readFile(filePath5);
        Record[] rec3a_rand75000 = fileReader.readFile(filePath5);
        Record[] rec4a_rand75000 = fileReader.readFile(filePath5); //end of selection sort trial sample
        Record[] rec1b_rand75000 = fileReader.readFile(filePath5);
        Record[] rec2b_rand75000 = fileReader.readFile(filePath5);
        Record[] rec3b_rand75000 = fileReader.readFile(filePath5);
        Record[] rec4b_rand75000 = fileReader.readFile(filePath5); //end of merge sort trial sample
        Record[] rec1c_rand75000 = fileReader.readFile(filePath5);
        Record[] rec2c_rand75000 = fileReader.readFile(filePath5);
        Record[] rec3c_rand75000 = fileReader.readFile(filePath5);
        Record[] rec4c_rand75000 = fileReader.readFile(filePath5); //end of timsort trial sample

        int rand75000_size = rec1_rand75000.length; // size of Rand75000 Sorted Record.
        // ------------------------------------ random 100 000 data----------------------------------------------
        String filePath6 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100000.txt";
        Record[] rec1_rand100000 = fileReader.readFile(filePath6);
        Record[] rec2_rand100000 = fileReader.readFile(filePath6);
        Record[] rec3_rand100000 = fileReader.readFile(filePath6);
        Record[] rec4_rand100000 = fileReader.readFile(filePath6); //end of insertion sort trial sample
        Record[] rec1a_rand100000 = fileReader.readFile(filePath6);
        Record[] rec2a_rand100000 = fileReader.readFile(filePath6);
        Record[] rec3a_rand100000 = fileReader.readFile(filePath6);
        Record[] rec4a_rand100000 = fileReader.readFile(filePath6); //end of selection sort trial sample
        Record[] rec1b_rand100000 = fileReader.readFile(filePath6);
        Record[] rec2b_rand100000 = fileReader.readFile(filePath6);
        Record[] rec3b_rand100000 = fileReader.readFile(filePath6);
        Record[] rec4b_rand100000 = fileReader.readFile(filePath6); //end of merge sort trial sample
        Record[] rec1c_rand100000 = fileReader.readFile(filePath6);
        Record[] rec2c_rand100000 = fileReader.readFile(filePath6);
        Record[] rec3c_rand100000 = fileReader.readFile(filePath6);
        Record[] rec4c_rand100000 = fileReader.readFile(filePath6); //end of timsort trial sample

        int rand100000_size = rec1_rand100000.length; // size of Rand75000 Sorted Record.
        // ---------------------------------- totally reversed data----------------------------------------------
        String filePath7 = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\totallyreversed.txt";
        Record[] rec1_rev = fileReader.readFile(filePath7);
        Record[] rec2_rev  = fileReader.readFile(filePath7);
        Record[] rec3_rev  = fileReader.readFile(filePath7);
        Record[] rec4_rev  = fileReader.readFile(filePath7); //end of insertion sort trial sample
        Record[] rec1a_rev  = fileReader.readFile(filePath7);
        Record[] rec2a_rev  = fileReader.readFile(filePath7);
        Record[] rec3a_rev  = fileReader.readFile(filePath7);
        Record[] rec4a_rev  = fileReader.readFile(filePath7); //end of selection sort trial sample
        Record[] rec1b_rev  = fileReader.readFile(filePath7);
        Record[] rec2b_rev  = fileReader.readFile(filePath7);
        Record[] rec3b_rev  = fileReader.readFile(filePath7);
        Record[] rec4b_rev  = fileReader.readFile(filePath7); //end of merge sort trial sample
        Record[] rec1c_rev  = fileReader.readFile(filePath7);
        Record[] rec2c_rev  = fileReader.readFile(filePath7);
        Record[] rec3c_rev  = fileReader.readFile(filePath7);
        Record[] rec4c_rev  = fileReader.readFile(filePath7); //end of timsort trial sample

        int rev_size = rec1_rev.length; // size of Rand75000 Sorted Record.
        //---------------------------------------END OF RECORDS---------------------------------------------------------


        /*
         * note:
         *  naming with a,b,c,d on the ends are to make disticntion between for what sorting.
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
        long strtTime_insertion_a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand100, rand100_size);
        long endTime_insertion_a = System.currentTimeMillis();
        long execTime_insertion_a = endTime_insertion_a - strtTime_insertion_a;

        long strtTime_insertion1_a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand100, rand100_size);
        long endTime_insertion1_a = System.currentTimeMillis();
        long execTime_insertion1_a = endTime_insertion1_a - strtTime_insertion1_a;

        long strtTime_insertion2_a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand100, rand100_size);
        long endTime_insertion2_a = System.currentTimeMillis();
        long execTime_insertion2_a = endTime_insertion2_a - strtTime_insertion2_a;

        long strtTime_insertion3_a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand100, rand100_size);
        long endTime_insertion3_a = System.currentTimeMillis();
        long execTime_insertion3_a = endTime_insertion3_a - strtTime_insertion3_a;
            // insertion(a1) -- for random25000.txt
        long strtTime_insertion_a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand25000, rand25000_size);
        long endTime_insertion_a1 = System.currentTimeMillis();
        long execTime_insertion_a1 = endTime_insertion_a1 - strtTime_insertion_a1;

        long strtTime_insertion1_a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand25000, rand25000_size);
        long endTime_insertion1_a1 = System.currentTimeMillis();
        long execTime_insertion1_a1 = endTime_insertion1_a1 - strtTime_insertion1_a1;

        long strtTime_insertion2_a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand25000, rand25000_size);
        long endTime_insertion2_a1 = System.currentTimeMillis();
        long execTime_insertion2_a1 = endTime_insertion2_a1 - strtTime_insertion2_a1;

        long strtTime_insertion3_a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand25000, rand25000_size);
        long endTime_insertion3_a1 = System.currentTimeMillis();
        long execTime_insertion3_a1 = endTime_insertion3_a1 - strtTime_insertion3_a1;
            // insertion(a1a) -- for random50000.txt
        long strtTime_insertion_a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand50000, rand50000_size);
        long endTime_insertion_a1a = System.currentTimeMillis();
        long execTime_insertion_a1a = endTime_insertion_a1a - strtTime_insertion_a1a;

        long strtTime_insertion1_a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand50000, rand50000_size);
        long endTime_insertion1_a1a = System.currentTimeMillis();
        long execTime_insertion1_a1a = endTime_insertion1_a1a - strtTime_insertion1_a1a;

        long strtTime_insertion2_a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand50000, rand50000_size);
        long endTime_insertion2_a1a = System.currentTimeMillis();
        long execTime_insertion2_a1a = endTime_insertion2_a1a - strtTime_insertion2_a1a;

        long strtTime_insertion3_a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand50000, rand50000_size);
        long endTime_insertion3_a1a = System.currentTimeMillis();
        long execTime_insertion3_a1a = endTime_insertion3_a1a - strtTime_insertion3_a1a;
        // insertion(a1a1) -- for random75000.txt
        long strtTime_insertion_a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand75000, rand75000_size);
        long endTime_insertion_a1a1 = System.currentTimeMillis();
        long execTime_insertion_a1a1 = endTime_insertion_a1a1 - strtTime_insertion_a1a1;

        long strtTime_insertion1_a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand75000, rand75000_size);
        long endTime_insertion1_a1a1 = System.currentTimeMillis();
        long execTime_insertion1_a1a1 = endTime_insertion1_a1a1 - strtTime_insertion1_a1a1;

        long strtTime_insertion2_a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand75000, rand75000_size);
        long endTime_insertion2_a1a1 = System.currentTimeMillis();
        long execTime_insertion2_a1a1 = endTime_insertion2_a1a1 - strtTime_insertion2_a1a1;

        long strtTime_insertion3_a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand75000, rand75000_size);
        long endTime_insertion3_a1a1 = System.currentTimeMillis();
        long execTime_insertion3_a1a1 = endTime_insertion3_a1a1 - strtTime_insertion3_a1a1;
        // insertion(a1a1a) -- for random100000.txt
        long strtTime_insertion_a1a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rand100000, rand100000_size);
        long endTime_insertion_a1a1a = System.currentTimeMillis();
        long execTime_insertion_a1a1a = endTime_insertion_a1a1a - strtTime_insertion_a1a1a;

        long strtTime_insertion1_a1a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rand100000, rand100000_size);
        long endTime_insertion1_a1a1a = System.currentTimeMillis();
        long execTime_insertion1_a1a1a = endTime_insertion1_a1a1a - strtTime_insertion1_a1a1a;

        long strtTime_insertion2_a1a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rand100000, rand100000_size);
        long endTime_insertion2_a1a1a = System.currentTimeMillis();
        long execTime_insertion2_a1a1a = endTime_insertion2_a1a1a - strtTime_insertion2_a1a1a;

        long strtTime_insertion3_a1a1a = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rand100000, rand100000_size);
        long endTime_insertion3_a1a1a = System.currentTimeMillis();
        long execTime_insertion3_a1a1a = endTime_insertion3_a1a1a - strtTime_insertion3_a1a1a;
        // insertion(a1a1a1) -- for totallyreverse.txt
        long strtTime_insertion_a1a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1_rev, rev_size);
        long endTime_insertion_a1a1a1 = System.currentTimeMillis();
        long execTime_insertion_a1a1a1 = endTime_insertion_a1a1a1 - strtTime_insertion_a1a1a1;

        long strtTime_insertion1_a1a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2_rev, rev_size);
        long endTime_insertion1_a1a1a1 = System.currentTimeMillis();
        long execTime_insertion1_a1a1a1 = endTime_insertion1_a1a1a1 - strtTime_insertion1_a1a1a1;

        long strtTime_insertion2_a1a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3_rev, rev_size);
        long endTime_insertion2_a1a1a1 = System.currentTimeMillis();
        long execTime_insertion2_a1a1a1 = endTime_insertion2_a1a1a1 - strtTime_insertion2_a1a1a1;

        long strtTime_insertion3_a1a1a1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4_rev, rev_size);
        long endTime_insertion3_a1a1a1 = System.currentTimeMillis();
        long execTime_insertion3_a1a1a1 = endTime_insertion3_a1a1a1 - strtTime_insertion3_a1a1a1;



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
        long strtTime_selection_b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand100, rand100_size);
        long endTime_selection_b = System.currentTimeMillis();
        long execTime_selection_b = endTime_selection_b - strtTime_selection_b;

        long strtTime_selection1_b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand100, rand100_size);
        long endTime_selection1_b = System.currentTimeMillis();
        long execTime_selection1_b = endTime_selection1_b - strtTime_selection1_b;

        long strtTime_selection2_b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand100, rand100_size);
        long endTime_selection2_b = System.currentTimeMillis();
        long execTime_selection2_b = endTime_selection2_b - strtTime_selection2_b;

        long strtTime_selection3_b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand100, rand100_size);
        long endTime_selection3_b = System.currentTimeMillis();
        long execTime_selection3_b = endTime_selection3_b - strtTime_selection3_b;
        // selection(b2) -- for random25000.txt
        long strtTime_selection_b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand25000, rand25000_size);
        long endTime_selection_b2 = System.currentTimeMillis();
        long execTime_selection_b2 = endTime_selection_b2 - strtTime_selection_b2;

        long strtTime_selection1_b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand25000, rand25000_size);
        long endTime_selection1_b2 = System.currentTimeMillis();
        long execTime_selection1_b2 = endTime_selection1_b2 - strtTime_selection1_b2;

        long strtTime_selection2_b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand25000, rand25000_size);
        long endTime_selection2_b2 = System.currentTimeMillis();
        long execTime_selection2_b2 = endTime_selection2_b2 - strtTime_selection2_b2;

        long strtTime_selection3_b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand25000, rand25000_size);
        long endTime_selection3_b2 = System.currentTimeMillis();
        long execTime_selection3_b2 = endTime_selection3_b2 - strtTime_selection3_b2;
        // selection(b2b) -- for random50000.txt
        long strtTime_selection_b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand50000, rand50000_size);
        long endTime_selection_b2b = System.currentTimeMillis();
        long execTime_selection_b2b = endTime_selection_b2b - strtTime_selection_b2b;

        long strtTime_selection1_b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand50000, rand50000_size);
        long endTime_selection1_b2b = System.currentTimeMillis();
        long execTime_selection1_b2b = endTime_selection1_b2b - strtTime_selection1_b2b;

        long strtTime_selection2_b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand50000, rand50000_size);
        long endTime_selection2_b2b = System.currentTimeMillis();
        long execTime_selection2_b2b = endTime_selection2_b2b - strtTime_selection2_b2b;

        long strtTime_selection3_b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand50000, rand50000_size);
        long endTime_selection3_b2b = System.currentTimeMillis();
        long execTime_selection3_b2b = endTime_selection3_b2b - strtTime_selection3_b2b;
        // selection(b2b2) -- for random75000.txt
        long strtTime_selection_b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand75000, rand75000_size);
        long endTime_selection_b2b2 = System.currentTimeMillis();
        long execTime_selection_b2b2 = endTime_selection_b2b2 - strtTime_selection_b2b2;

        long strtTime_selection1_b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand75000, rand75000_size);
        long endTime_selection1_b2b2 = System.currentTimeMillis();
        long execTime_selection1_b2b2 = endTime_selection1_b2b2 - strtTime_selection1_b2b2;

        long strtTime_selection2_b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand75000, rand75000_size);
        long endTime_selection2_b2b2 = System.currentTimeMillis();
        long execTime_selection2_b2b2 = endTime_selection2_b2b2 - strtTime_selection2_b2b2;

        long strtTime_selection3_b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand75000, rand75000_size);
        long endTime_selection3_b2b2 = System.currentTimeMillis();
        long execTime_selection3_b2b2 = endTime_selection3_b2b2 - strtTime_selection3_b2b2;
        // selection(b2b2b) -- for random100000.txt
        long strtTime_selection_b2b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rand100000, rand100000_size);
        long endTime_selection_b2b2b = System.currentTimeMillis();
        long execTime_selection_b2b2b = endTime_selection_b2b2b - strtTime_selection_b2b2b;

        long strtTime_selection1_b2b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rand100000, rand100000_size);
        long endTime_selection1_b2b2b = System.currentTimeMillis();
        long execTime_selection1_b2b2b = endTime_selection1_b2b2b - strtTime_selection1_b2b2b;

        long strtTime_selection2_b2b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rand100000, rand100000_size);
        long endTime_selection2_b2b2b = System.currentTimeMillis();
        long execTime_selection2_b2b2b = endTime_selection2_b2b2b - strtTime_selection2_b2b2b;

        long strtTime_selection3_b2b2b = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rand100000, rand100000_size);
        long endTime_selection3_b2b2b = System.currentTimeMillis();
        long execTime_selection3_b2b2b = endTime_selection3_b2b2b - strtTime_selection3_b2b2b;
        // selection(b2b2b2) -- for totallyreversed.txt
        long strtTime_selection_b2b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1a_rev, rev_size);
        long endTime_selection_b2b2b2 = System.currentTimeMillis();
        long execTime_selection_b2b2b2 = endTime_selection_b2b2b2 - strtTime_selection_b2b2b2;

        long strtTime_selection1_b2b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2a_rev, rev_size);
        long endTime_selection1_b2b2b2 = System.currentTimeMillis();
        long execTime_selection1_b2b2b2 = endTime_selection1_b2b2b2 - strtTime_selection1_b2b2b2;

        long strtTime_selection2_b2b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3a_rev, rev_size);
        long endTime_selection2_b2b2b2 = System.currentTimeMillis();
        long execTime_selection2_b2b2b2 = endTime_selection2_b2b2b2 - strtTime_selection2_b2b2b2;

        long strtTime_selection3_b2b2b2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4a_rev, rev_size);
        long endTime_selection3_b2b2b2 = System.currentTimeMillis();
        long execTime_selection3_b2b2b2 = endTime_selection3_b2b2b2 - strtTime_selection3_b2b2b2;


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
            // merge(c) -- for random100.txt
        long strtTime_merge_c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand100,0, rand100_size - 1);
        long endTime_merge_c = System.currentTimeMillis();
        long execTime_merge_c = endTime_merge_c - strtTime_merge_c;

        long strtTime_merge1_c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand100,0, rand100_size - 1);
        long endTime_merge1_c = System.currentTimeMillis();
        long execTime_merge1_c = endTime_merge1_c - strtTime_merge1_c;

        long strtTime_merge2_c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand100,0, rand100_size - 1);
        long endTime_merge2_c = System.currentTimeMillis();
        long execTime_merge2_c = endTime_merge2_c - strtTime_merge2_c;

        long strtTime_merge3_c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand100,0, rand100_size - 1);
        long endTime_merge3_c = System.currentTimeMillis();
        long execTime_merge3_c = endTime_merge3_c - strtTime_merge3_c;
        // merge(c) -- for random25000.txt
        long strtTime_merge_c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand25000,0, rand25000_size - 1);
        long endTime_merge_c3 = System.currentTimeMillis();
        long execTime_merge_c3 = endTime_merge_c3 - strtTime_merge_c3;

        long strtTime_merge1_c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand25000,0, rand25000_size - 1);
        long endTime_merge1_c3 = System.currentTimeMillis();
        long execTime_merge1_c3 = endTime_merge1_c3 - strtTime_merge1_c3;

        long strtTime_merge2_c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand25000,0, rand25000_size - 1);
        long endTime_merge2_c3 = System.currentTimeMillis();
        long execTime_merge2_c3 = endTime_merge2_c3 - strtTime_merge2_c3;

        long strtTime_merge3_c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand25000,0, rand25000_size - 1);
        long endTime_merge3_c3 = System.currentTimeMillis();
        long execTime_merge3_c3 = endTime_merge3_c3 - strtTime_merge3_c3;
        // merge(c) -- for random50000.txt
        long strtTime_merge_c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand50000,0, rand50000_size - 1);
        long endTime_merge_c3c = System.currentTimeMillis();
        long execTime_merge_c3c = endTime_merge_c3c - strtTime_merge_c3c;

        long strtTime_merge1_c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand50000,0, rand50000_size - 1);
        long endTime_merge1_c3c = System.currentTimeMillis();
        long execTime_merge1_c3c = endTime_merge1_c3c - strtTime_merge1_c3c;

        long strtTime_merge2_c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand50000,0, rand50000_size - 1);
        long endTime_merge2_c3c = System.currentTimeMillis();
        long execTime_merge2_c3c = endTime_merge2_c3c - strtTime_merge2_c3c;

        long strtTime_merge3_c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand50000,0, rand50000_size - 1);
        long endTime_merge3_c3c = System.currentTimeMillis();
        long execTime_merge3_c3c = endTime_merge3_c3c - strtTime_merge3_c3c;
        // merge(c) -- for random75000.txt
        long strtTime_merge_c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand75000,0, rand75000_size - 1);
        long endTime_merge_c3c3 = System.currentTimeMillis();
        long execTime_merge_c3c3 = endTime_merge_c3 - strtTime_merge_c3;

        long strtTime_merge1_c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand75000,0, rand75000_size - 1);
        long endTime_merge1_c3c3 = System.currentTimeMillis();
        long execTime_merge1_c3c3 = endTime_merge1_c3c3 - strtTime_merge1_c3c3;

        long strtTime_merge2_c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand75000,0, rand75000_size - 1);
        long endTime_merge2_c3c3 = System.currentTimeMillis();
        long execTime_merge2_c3c3 = endTime_merge2_c3c3 - strtTime_merge2_c3c3;

        long strtTime_merge3_c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand75000,0, rand75000_size - 1);
        long endTime_merge3_c3c3 = System.currentTimeMillis();
        long execTime_merge3_c3c3 = endTime_merge3_c3c3 - strtTime_merge3_c3c3;
        // merge(c3c3c) -- for random100000.txt
        long strtTime_merge_c3c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rand100000,0, rand100000_size - 1);
        long endTime_merge_c3c3c = System.currentTimeMillis();
        long execTime_merge_c3c3c = endTime_merge_c3c3c - strtTime_merge_c3c3c;

        long strtTime_merge1_c3c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rand100000,0, rand100000_size - 1);
        long endTime_merge1_c3c3c = System.currentTimeMillis();
        long execTime_merge1_c3c3c = endTime_merge1_c3c3c - strtTime_merge1_c3c3c;

        long strtTime_merge2_c3c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rand100000,0, rand100000_size - 1);
        long endTime_merge2_c3c3c = System.currentTimeMillis();
        long execTime_merge2_c3c3c = endTime_merge2_c3c3c - strtTime_merge2_c3c3c;

        long strtTime_merge3_c3c3c = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rand100000,0, rand100000_size - 1);
        long endTime_merge3_c3c3c = System.currentTimeMillis();
        long execTime_merge3_c3c3c = endTime_merge3_c3c3c - strtTime_merge3_c3c3c;
        // merge(c3c3c3) -- for totallyreversed.txt
        long strtTime_merge_c3c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1b_rev,0, rev_size - 1);
        long endTime_merge_c3c3c3 = System.currentTimeMillis();
        long execTime_merge_c3c3c3 = endTime_merge_c3c3c3 - strtTime_merge_c3c3c3;

        long strtTime_merge1_c3c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2b_rev,0, rev_size - 1);
        long endTime_merge1_c3c3c3 = System.currentTimeMillis();
        long execTime_merge1_c3c3c3 = endTime_merge1_c3c3c3 - strtTime_merge1_c3c3c3;

        long strtTime_merge2_c3c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3b_rev,0, rev_size - 1);
        long endTime_merge2_c3c3c3 = System.currentTimeMillis();
        long execTime_merge2_c3c3c3 = endTime_merge2_c3c3c3 - strtTime_merge2_c3c3c3;

        long strtTime_merge3_c3c3c3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4b_rev,0, rev_size - 1);
        long endTime_merge3_c3c3c3 = System.currentTimeMillis();
        long execTime_merge3_c3c3c3 = endTime_merge3_c3c3c3 - strtTime_merge3_c3c3c3;
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
            // tim(d) -- for random100.txt
        long strtTime_tim_d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand100,rand100_size);
        long endTime_tim_d = System.currentTimeMillis();
        long execTime_tim_d = endTime_tim_d - strtTime_tim_d;

        long strtTime_tim1_d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand100, rand100_size);
        long endTime_tim1_d = System.currentTimeMillis();
        long execTime_tim1_d = endTime_tim1_d - strtTime_tim1_d;

        long strtTime_tim2_d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand100, rand100_size);
        long endTime_tim2_d = System.currentTimeMillis();
        long execTime_tim2_d = endTime_tim2_d - strtTime_tim2_d;

        long strtTime_tim3_d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand100, rand100_size);
        long endTime_tim3_d = System.currentTimeMillis();
        long execTime_tim3_d = endTime_tim3_d - strtTime_tim3_d;
            // tim(d4) -- for random25000.txt
        long strtTime_tim_d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand25000,rand25000_size);
        long endTime_tim_d4 = System.currentTimeMillis();
        long execTime_tim_d4 = endTime_tim_d4 - strtTime_tim_d4;

        long strtTime_tim1_d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand25000, rand25000_size);
        long endTime_tim1_d4 = System.currentTimeMillis();
        long execTime_tim1_d4 = endTime_tim1_d4 - strtTime_tim1_d4;

        long strtTime_tim2_d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand25000, rand25000_size);
        long endTime_tim2_d4 = System.currentTimeMillis();
        long execTime_tim2_d4 = endTime_tim2_d4 - strtTime_tim2_d4;

        long strtTime_tim3_d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand25000, rand25000_size);
        long endTime_tim3_d4 = System.currentTimeMillis();
        long execTime_tim3_d4 = endTime_tim3_d4 - strtTime_tim3_d4;
        // tim(d4) -- for random50000.txt
        long strtTime_tim_d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand50000,rand50000_size);
        long endTime_tim_d4d = System.currentTimeMillis();
        long execTime_tim_d4d = endTime_tim_d4d - strtTime_tim_d4d;

        long strtTime_tim1_d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand50000, rand50000_size);
        long endTime_tim1_d4d = System.currentTimeMillis();
        long execTime_tim1_d4d = endTime_tim1_d4d - strtTime_tim1_d4d;

        long strtTime_tim2_d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand50000, rand50000_size);
        long endTime_tim2_d4d = System.currentTimeMillis();
        long execTime_tim2_d4d = endTime_tim2_d4d - strtTime_tim2_d4d;

        long strtTime_tim3_d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand50000, rand50000_size);
        long endTime_tim3_d4d = System.currentTimeMillis();
        long execTime_tim3_d4d = endTime_tim3_d4d - strtTime_tim3_d4d;
        // tim(d4d4) -- for random75000.txt
        long strtTime_tim_d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand75000,rand75000_size);
        long endTime_tim_d4d4 = System.currentTimeMillis();
        long execTime_tim_d4d4 = endTime_tim_d4d4 - strtTime_tim_d4d4;

        long strtTime_tim1_d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand75000, rand75000_size);
        long endTime_tim1_d4d4 = System.currentTimeMillis();
        long execTime_tim1_d4d4 = endTime_tim1_d4d4 - strtTime_tim1_d4d4;

        long strtTime_tim2_d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand75000, rand75000_size);
        long endTime_tim2_d4d4 = System.currentTimeMillis();
        long execTime_tim2_d4d4 = endTime_tim2_d4d4 - strtTime_tim2_d4d4;

        long strtTime_tim3_d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand75000, rand75000_size);
        long endTime_tim3_d4d4 = System.currentTimeMillis();
        long execTime_tim3_d4d4 = endTime_tim3_d4d4 - strtTime_tim3_d4d4;
        // tim(d4d4d) -- for random100000.txt
        long strtTime_tim_d4d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rand100000,rand100000_size);
        long endTime_tim_d4d4d = System.currentTimeMillis();
        long execTime_tim_d4d4d = endTime_tim_d4d4d - strtTime_tim_d4d4d;

        long strtTime_tim1_d4d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rand100000, rand100000_size);
        long endTime_tim1_d4d4d = System.currentTimeMillis();
        long execTime_tim1_d4d4d = endTime_tim1_d4 - strtTime_tim1_d4;

        long strtTime_tim2_d4d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rand100000, rand100000_size);
        long endTime_tim2_d4d4d = System.currentTimeMillis();
        long execTime_tim2_d4d4d = endTime_tim2_d4d4d - strtTime_tim2_d4d4d;

        long strtTime_tim3_d4d4d = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rand100000, rand100000_size);
        long endTime_tim3_d4d4d = System.currentTimeMillis();
        long execTime_tim3_d4d4d = endTime_tim3_d4d4d - strtTime_tim3_d4d4d;
        // tim(d4d4d4) -- for totallyreversed.txt
        long strtTime_tim_d4d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1c_rev,rev_size);
        long endTime_tim_d4d4d4 = System.currentTimeMillis();
        long execTime_tim_d4d4d4 = endTime_tim_d4d4d4 - strtTime_tim_d4d4d4;

        long strtTime_tim1_d4d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2c_rev, rev_size);
        long endTime_tim1_d4d4d4 = System.currentTimeMillis();
        long execTime_tim1_d4d4d4 = endTime_tim1_d4 - strtTime_tim1_d4;

        long strtTime_tim2_d4d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3c_rev, rev_size);
        long endTime_tim2_d4d4d4 = System.currentTimeMillis();
        long execTime_tim2_d4d4d4 = endTime_tim2_d4d4d - strtTime_tim2_d4d4d;

        long strtTime_tim3_d4d4d4 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4c_rev, rev_size);
        long endTime_tim3_d4d4d4 = System.currentTimeMillis();
        long execTime_tim3_d4d4d4 = endTime_tim3_d4d4d4 - strtTime_tim3_d4d4d4;




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

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: almostsorted.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion+execTime_insertion1+
                execTime_insertion2+ execTime_insertion3)/4), almstsrt_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection+execTime_selection1+
                execTime_selection2+execTime_selection3)/4), almstsrt_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge+execTime_merge1+
                execTime_merge2+execTime_merge3)/4), almstsrt_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim+execTime_tim1+execTime_tim2+
                execTime_tim3)/4), almstsrt_size);
        System.out.println("\n\n");
        // ----------------------------------random 100 data results---------------------------------------------

        System.out.println("\n|RANDOM 100 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c, rand100_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d, rand100_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d, rand100_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: random100.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a+execTime_insertion1_a+
                execTime_insertion2_a+ execTime_insertion3_a)/4), rand100_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b+execTime_selection1_b+
                execTime_selection2_b+execTime_selection3_b)/4), rand100_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c+execTime_merge1_c+
                execTime_merge2_c+execTime_merge3_c)/4), rand100_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d+execTime_tim1_d+execTime_tim2_d+
                execTime_tim3_d)/4), rand100_size);
        System.out.println("\n\n");


        //----------------------------------random 25 000 data results-------------------------------------

        System.out.println("\n|RANDOM 25 000 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random25000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a1, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a1, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a1, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a1, rand25000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random25000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b2, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b2, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b2, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b2, rand25000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random25000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c3, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c3, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c3, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c3, rand25000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random25000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d4, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d4, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d4, rand25000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d4, rand25000_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: random25000.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a1+execTime_insertion1_a1+
                execTime_insertion2_a1+ execTime_insertion3_a1)/4), rand25000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b2+execTime_selection1_b2+
                execTime_selection2_b2+execTime_selection3_b2)/4), rand25000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c3+execTime_merge1_c3+
                execTime_merge2_c3+execTime_merge3_c3)/4), rand25000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d4+execTime_tim1_d4+execTime_tim2_d4+
                execTime_tim3_d4)/4), rand25000_size);
        System.out.println("\n\n");

        //----------------------------------random 50 000 data results-------------------------------------

        System.out.println("\n|RANDOM 50 000 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random50000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a1a, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a1a, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a1a, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a1a, rand50000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random50000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b2b, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b2b, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b2b, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b2b, rand50000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random50000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c3c, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c3c, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c3c, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c3c, rand50000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random50000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d4d, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d4d, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d4d, rand50000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d4d, rand50000_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: random50000.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a1a+execTime_insertion1_a1a+
                execTime_insertion2_a1a+ execTime_insertion3_a1a)/4), rand50000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b2b+execTime_selection1_b2b+
                execTime_selection2_b2b+execTime_selection3_b2b)/4), rand50000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c3c+execTime_merge1_c3c+
                execTime_merge2_c3c+execTime_merge3_c3c)/4), rand50000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d4d+execTime_tim1_d4d+execTime_tim2_d4d+
                execTime_tim3_d4d)/4), rand50000_size);
        System.out.println("\n\n");

        //----------------------------------random 75 000 data results-------------------------------------

        System.out.println("\n|RANDOM 75 000 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random75000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a1a1, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a1a1, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a1a1, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a1a1, rand75000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random75000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b2b2, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b2b2, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b2b2, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b2b2, rand75000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random75000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c3c3, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c3c3, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c3c3, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c3c3, rand75000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random75000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d4d4, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d4d4, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d4d4, rand75000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d4d4, rand75000_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: random75000.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a1a1+execTime_insertion1_a1a1+
                execTime_insertion2_a1a1+ execTime_insertion3_a1a1)/4), rand75000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b2b2+execTime_selection1_b2b2+
                execTime_selection2_b2b2+execTime_selection3_b2b2)/4), rand75000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c3c3+execTime_merge1_c3c3+
                execTime_merge2_c3c3+execTime_merge3_c3c3)/4), rand75000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d4d4+execTime_tim1_d4d4+execTime_tim2_d4d4+
                execTime_tim3_d4d4)/4), rand75000_size);
        System.out.println("\n\n");

        //----------------------------------random 100 000 data results-------------------------------------

        System.out.println("\n|RANDOM 100 000 DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: random100000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a1a1a, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a1a1a, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a1a1a, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a1a1a, rand100000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: random100000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b2b2b, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b2b2b, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b2b2b, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b2b2b, rand100000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: random100000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c3c3c, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c3c3c, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c3c3c, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c3c3c, rand100000_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: random100000.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d4d4d, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d4d4d, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d4d4d, rand100000_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d4d4d, rand100000_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: random100000.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a1a1a+execTime_insertion1_a1a1a+
                execTime_insertion2_a1a1a+ execTime_insertion3_a1a1a)/4), rand100000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b2b2b+execTime_selection1_b2b2b+
                execTime_selection2_b2b2b+execTime_selection3_b2b2b)/4), rand100000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c3c3c+execTime_merge1_c3c3c+
                execTime_merge2_c3c3c+execTime_merge3_c3c3c)/4), rand100000_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d4d4d+execTime_tim1_d4d4d+execTime_tim2_d4d4d+
                execTime_tim3_d4d4d)/4), rand100000_size);
        System.out.println("\n\n");

        //----------------------------------totally reversed data results-------------------------------------

        System.out.println("\n|TOTALLY REVERSED DATA RESULTS|");

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Insertion Sort","Time Taken (ms)","File Length",
                "filename: totallyreversed.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_insertion_a1a1a1, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_insertion1_a1a1a1, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_insertion2_a1a1a1, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_insertion3_a1a1a1, rev_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Selection Sort","Time Taken (ms)","File Length",
                "filename: totallyreversed.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_selection_b2b2b2, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_selection1_b2b2b2, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_selection2_b2b2b2, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_selection3_b2b2b2, rev_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Merge Sort","Time Taken (ms)","File Length",
                "filename: totallyreversed.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_merge_c3c3c3, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_merge1_c3c3c3, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_merge2_c3c3c3, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_merge3_c3c3c3,rev_size);

        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%35s | %15s | %11s | %s\n","Algorithm : Timsort","Time Taken (ms)","File Length",
                "filename: totallyreversed.txt");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime_tim_d4d4d4, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime_tim1_d4d4d4, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime_tim2_d4d4d4, rev_size);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime_tim3_d4d4d4, rev_size);

        System.out.println("\n----------------------------------" +
                "--------------------------------------------------------");
        System.out.printf("%35s | %20s | %11s | %s\n","Algorithm: "," Avg Time Taken (ms)","File Length",
                "filename: totallyreversed.txt");
        System.out.printf("%-35s | %-20d | %-10d\n","Insertion Sort",((execTime_insertion_a1a1a1+execTime_insertion1_a1a1a1+
                execTime_insertion2_a1a1a1+ execTime_insertion3_a1a1a1)/4), rev_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Selection Sort",((execTime_selection_b2b2b2+execTime_selection1_b2b2b2+
                execTime_selection2_b2b2b2+execTime_selection3_b2b2b2)/4), rev_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Merge Sort",((execTime_merge_c3c3c3+execTime_merge1_c3c3c3+
                execTime_merge2_c3c3c3+execTime_merge3_c3c3c3)/4), rev_size);
        System.out.printf("%-35s | %-20d | %-10d\n","Tim Sort",((execTime_tim_d4d4d4+execTime_tim1_d4d4d4+execTime_tim2_d4d4d4+
                execTime_tim3_d4d4d4)/4), rev_size);
        System.out.println("\n\n");

    }

}
