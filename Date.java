/**
  Represent a date
 */
public class Date{
    private int y,m,d;

    public int compareTo(Object otherObj) {
        int result;
        if(    (result = ((Integer)y).compareTo(((Date)otherObj).y)) == 0
            && (result = ((Integer)m).compareTo(((Date)otherObj).m)) == 0
            && (result = ((Integer)d).compareTo(((Date)otherObj).d)) == 0)
            return 0;
        else
            return result;
    }
    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

}
