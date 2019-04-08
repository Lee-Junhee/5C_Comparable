/**
  Represent a date
 */
public class Date{
    private int y,m,d;
   
    public int compareTo(Object otherObj)
        Date otherDate = (Date) otherObj;
	int tempResult;
        if ((tempResult = Integer.valueOf(y).compareTo(
			  Integer.valueOf(otherDate.y))) != 0)
	    return tempResult;
	if ((tempResult = Integer.valueOf(m).compareTo(
		          Integer.valueOf(otherDate.m))) != 0)
	    return tempResult;
	return Integer.valueOf(d).compareTo(
	       Integer.valueOf(otherDate.d));

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
