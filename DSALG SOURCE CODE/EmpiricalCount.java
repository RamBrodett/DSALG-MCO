

public class EmpiricalCount {
    public static void main(String[] args){


        SortingAlgorithms sortAlgorithms = new SortingAlgorithms();
        FileReader fileReader = new FileReader();


        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\almostsorted.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100.txt";
       // String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random25000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random50000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random75000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random100000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random500000.txt";
        //String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\random1000000.txt";
        String filePath = "C:\\Users\\rmbro\\DSALG-MCO\\DSALG SOURCE CODE\\data\\totallyreversed.txt";

        Record[] rec1 = fileReader.readFile(filePath);
        int fileSize = rec1.length; //gets the file size.

        String SortingAlgo = "Insertion";

        /*
        long strtTime = System.currentTimeMillis();
        long steps = sortAlgorithms.insertionSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;
*/
/*
        long strtTime = System.currentTimeMillis();
        long steps = sortAlgorithms.mergeSort(rec1,0,fileSize-1);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;
        */

        long strtTime = System.currentTimeMillis();
        long steps = sortAlgorithms.timSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;


/*
        long strtTime = System.currentTimeMillis();
        long steps = sortAlgorithms.selectionSort(rec1, fileSize);
        long endTime = System.currentTimeMillis();
        long execTime  = endTime - strtTime;
*/

        System.out.println("\n|DATA RESULTS|");
        System.out.println("----------------------------------" +
                "--------------------------------------------------------");

        System.out.printf("%-12s%-23s | %-15s | %-11s\n","Algorithm : ",SortingAlgo,"Time Taken (ms)","File Length");
        System.out.printf("%-35s | %-15d | %-10d\n","Trial 1",execTime, fileSize);
        System.out.println("Steps: "+ steps);

    }
}
