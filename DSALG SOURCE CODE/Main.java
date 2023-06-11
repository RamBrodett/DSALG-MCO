
public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.


        //tester code for insertion ----------------------------------------------------
        Record[] ccs_Students = new Record[]{
            new Record( "Ram David Brodett", 12205559),
            new Record( "Jaryll Salvador", 10165833),
            new Record( "Ilan Templa", 10056472),
            new Record( "John Paul Carney", 12205560)
        };

        SortingAlgorithms sr = new SortingAlgorithms();

        sr.insertionSort(ccs_Students, ccs_Students.length);

        int x=0;

        for(Record student : ccs_Students){
            x++;
            System.out.println(x + " " + student.getIdNumber() +" "+ student.getName());
        }
        // end of insertion tester -------------------------------------------------------


        System.out.println();


        //tester code for selection ----------------------------------------------------

        Record[] cob_Students  = new Record[]{
                new Record( "Veronica", 12205559),
                new Record( "Isabel", 10165833),
                new Record( "Albert", 10056472),
                new Record( "Queen", 12205560)
        };

        sr.selectionSort(cob_Students, cob_Students.length);

        int y=0;

        for(Record student : cob_Students){
            y++;
            System.out.println(y + " " + student.getIdNumber() +" "+ student.getName());
        }

        // end of selection tester -------------------------------------------------------

        System.out.println();

        //tester code for merge ----------------------------------------------------

        Record[] cla_Students  = new Record[]{
                new Record( "Julia", 12205559),
                new Record( "Debbie", 10165833),
                new Record( "Jersey", 10056472),
                new Record( "Amanda", 12205560),
                new Record("Veronica", 12135617)
        };

        sr.mergeSort(cla_Students,0,cla_Students.length-1);

        int z=0;

        for(Record student : cla_Students){
            z++;
            System.out.println(z + " " + student.getIdNumber() +" "+ student.getName());
        }


        // end of merge tester -------------------------------------------------------






    }
}
