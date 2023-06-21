import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
         Uncomment the thing you want to use !! only uncomment one at a time !!
         */

        //String filename = "experiment_Tim_AlmostSorted.txt";
        //String filename = "experiment_Tim_1HundredRandom.txt";
        //String filename = "experiment_Tim_25ThousandRandom.txt";
        //String filename = "experiment_Tim_50ThousandRandom.txt";
        //String filename = "experiment_Tim_75ThousandRandom.txt";
        //String filename = "experiment_Tim_100ThousandRandom.txt";
        String filename = "experiment_Selection_500ThousandRandom.txt";
        //String filename = "experiment_Tim_1MillionRandom.txt";  // only feasible to test with mergesort
        //String filename = "experiment_Tim_TotallyReversed.txt";

        /*
         *  Instances of used class in main.
         *  sortAlgorithms - used for accessing the different sorting algorithms
         *  fileReader - used for getting records in files
         *  fous (FileOutputStream) - used for outputting the stream to file documents.
         *  ps (PrintStream) - used for writing to a new stream.
         */
        Main main = new Main();
        SortingAlgorithms sortAlgorithms = new SortingAlgorithms();
        FileReader fileReader = new FileReader();
        FileOutputStream fous = new FileOutputStream(filename);
        PrintStream ps = new PrintStream(fous);


        // to reassign the output stream.
        System.setOut(ps);

        /*
         Uncomment the thing you want to use !! only uncomment one at a time !!
         */

        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\almostsorted.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random25000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random50000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random75000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100000.txt";
        String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random500000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random1000000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\totallyreversed.txt";

        /*
         * Initialization of 4 records for usage in 4 trials per algorithm
         */

        Record[] rec1 = fileReader.readFile(filePath);
        Record[] rec2 = fileReader.readFile(filePath);
        Record[] rec3 = fileReader.readFile(filePath);
        Record[] rec4 = fileReader.readFile(filePath);
        int fileSize = rec1.length; //gets the file size.


        /*
         Uncomment the whole block of algorithm you want to use !! only uncomment one block at a time !!
         */


        // Insertion Run block--------------------------------------------------------------------------
        String SortingAlgo = "Insertion";

        long strtTime = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;

        long strtTime1 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec2,fileSize);
        long endTime1 = System.currentTimeMillis();
        long execTime1 = endTime1 - strtTime1;

        long strtTime2 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec3,fileSize);
        long endTime2 = System.currentTimeMillis();
        long execTime2 = endTime2 - strtTime2;

        long strtTime3 = System.currentTimeMillis();
        sortAlgorithms.insertionSort(rec4,fileSize);
        long endTime3 = System.currentTimeMillis();
        long execTime3 = endTime3 - strtTime3;

        // end of block-----------------------------------------------------------------------------------


        /*
        // Selection Run block----------------------------------------------------------------------------
        String SortingAlgo = "Selection";

        long strtTime = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;

        long strtTime1 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec2,fileSize);
        long endTime1 = System.currentTimeMillis();
        long execTime1 = endTime1 - strtTime1;

        long strtTime2 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec3,fileSize);
        long endTime2 = System.currentTimeMillis();
        long execTime2 = endTime2 - strtTime2;

        long strtTime3 = System.currentTimeMillis();
        sortAlgorithms.selectionSort(rec4,fileSize);
        long endTime3 = System.currentTimeMillis();
        long execTime3 = endTime3 - strtTime3;

        // end of block-----------------------------------------------------------------------------------
        */

        /*
        // Merge Run block--------------------------------------------------------------------------------
        String SortingAlgo = "Merge";

        long strtTime = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec1,0,fileSize-1);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;

        long strtTime1 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec2,0,fileSize-1);
        long endTime1 = System.currentTimeMillis();
        long execTime1 = endTime1 - strtTime1;

        long strtTime2 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec3,0,fileSize-1);
        long endTime2 = System.currentTimeMillis();
        long execTime2 = endTime2 - strtTime2;

        long strtTime3 = System.currentTimeMillis();
        sortAlgorithms.mergeSort(rec4,0,fileSize-1);
        long endTime3 = System.currentTimeMillis();
        long execTime3 = endTime3 - strtTime3;

        // end of block-----------------------------------------------------------------------------------
        */


        /*
        //Tim Run block-----------------------------------------------------------------------------------
        String SortingAlgo = "Tim";

        long strtTime = System.currentTimeMillis();
        sortAlgorithms.timSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;

        long strtTime1 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec2,fileSize);
        long endTime1 = System.currentTimeMillis();
        long execTime1 = endTime1 - strtTime1;

        long strtTime2 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec3,fileSize);
        long endTime2 = System.currentTimeMillis();
        long execTime2 = endTime2 - strtTime2;

        long strtTime3 = System.currentTimeMillis();
        sortAlgorithms.timSort(rec4,fileSize);
        long endTime3 = System.currentTimeMillis();
        long execTime3 = endTime3 - strtTime3;

        // end of block-----------------------------------------------------------------------------------
        */

        /*
         * For printing the 4 trial results. !! uncomment the other printf if necessary !!
         */

        System.out.println("\n|DATA RESULTS|");
        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%-12s%-23s | %-15s | %-11s\n","Algorithm : ",SortingAlgo,"Time Taken (ms)","File Length");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime, fileSize);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 2",execTime1, fileSize);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 3",execTime2, fileSize);
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 4",execTime3, fileSize);
        System.out.printf("\n\nYou can open the unsorted reference of this data test: random500000.txt");
        //System.out.printf("\n\nYou can open the unsorted reference of this data test: almostsorted.txt");
        //System.out.printf("\n\nYou can open the unsorted reference of this data test: totallyreversed.txt");
        System.out.printf("\nYou can open the sorted result of this data test: sorted500000.txt");
        ps.close();
        fous.close();

        //Method for writing the sorted data to a file for verification.
        main.writeDatasetToFile(rec1,"sorted500000.txt",fileSize);
    }

    //Method for writing the sorted data to a file for verification.
    public void writeDatasetToFile(Record[] arr, String fileName,int size) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        writer.write(size + "\n");
        for (Record data : arr) {
            writer.write(data.getIdNumber() +" "+ data.getName() + "\n");
        }
        writer.close();
    }
}
