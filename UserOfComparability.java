/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        Date d0 = new Date(1000, 6, 15);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        compareDates( "same date", d0 , new Date( 1000,6,15), "0");
        compareDates( "bigger date", d0 , new Date( 1001,6,15), "-1");
        compareDates( "smaller date", d0 , new Date( 10,6,15), "1");
        compareDates( "same year bigger month", d0 , new Date( 1000,7,10), "-1");
        compareDates( "same year smaller month", d0 , new Date( 1000,5,15), "1");
        compareDates( "bigger year smaller month", d0 , new Date( 1001,1,15), "-1");
        compareDates( "smaller year, same month, bigger day", d0 , new Date( 1,6,111), "1");

        //(new IncomparableDog()).compareTo(new InconmparableDog());

        //System.out.println(p0.compareTo(d0));

    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship
      ( String description
      , Point a
      , Point b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }

     private static void compareDates
       ( String description
       , Date a
       , Date b
       , String expect
       ) {
         System.out.println( description);

         // check
         System.out.println(
             a + " compareTo " + b + ": "
           + a.compareTo( b)
             /* eventually expecting a compiler warning:
               warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
               where T is a type-variable:
                 T extends Object declared in interface Comparable
              */

           + " ...expecting " + expect
           + System.lineSeparator());
      }


}
