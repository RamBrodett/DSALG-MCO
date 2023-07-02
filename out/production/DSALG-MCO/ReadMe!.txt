
         //tester codes that shows that it is getting sorted.

         System.out.println("Each id number should correspond to their rank. If not case is failed!");

         //tester code for insertion ----------------------------------------------------
         Record[] ccs_Students = new Record[]{
             new Record( "4th", 12205559),
             new Record( "3rd", 10165833),
             new Record( "2nd", 10056472),
             new Record( "5th", 12205560),
             new Record("1st", 926472)
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
                 new Record( "4th", 12205559),
                 new Record( "3rd", 10165833),
                 new Record( "2nd", 10056472),
                 new Record( "5th", 12205560),
                 new Record("1st", 926472)
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
                 new Record( "5th", 12205559),
                 new Record( "3rd", 10165833),
                 new Record( "2nd", 10056472),
                 new Record( "6th", 12205560),
                 new Record("4th", 12135617),
                 new Record("1st", 926472)
         };

         sr.mergeSort(cla_Students,0,cla_Students.length-1);

         int z=0;

         for(Record student : cla_Students){
             z++;
             System.out.println(z + " " + student.getIdNumber() +" "+ student.getName());
         }

         // end of merge tester -------------------------------------------------------

         System.out.println();

         //---------------------------------------------------------------------------

         Record[] cos_Students  = new Record[]{
                 new Record( "7th", 12205559),
                 new Record( "3rd", 10165833),
                 new Record( "2nd", 10056472),
                 new Record( "8th", 12205560),
                 new Record("6th", 12135617),
                 new Record("4th", 11065471),
                 new Record("5th", 11596746),
                 new Record("1st", 926472)
         };
         sr.timSort(cos_Students, cos_Students.length);
         int a = 0;
         for(Record student : cos_Students){
             a++;
             System.out.println(a + " " + student.getIdNumber() +" "+ student.getName());
         }
         //---------------------------------------------------------------------------------
